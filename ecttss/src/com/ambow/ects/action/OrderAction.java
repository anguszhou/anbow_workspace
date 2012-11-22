package com.ambow.ects.action;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ambow.ects.dao.IOrderDao;
import com.ambow.ects.dao.IProductDao;
import com.ambow.ects.dao.impl.OrderDaoHibernateImp;
import com.ambow.ects.dao.impl.ProductDaoImp;
import com.ambow.ects.entity.Order;
import com.ambow.ects.entity.OrderLine;
import com.ambow.ects.entity.OrderStatus;
import com.ambow.ects.entity.PayWay;
import com.ambow.ects.entity.Product;
import com.ambow.ects.entity.ShopCart;
import com.ambow.ects.entity.User;
import com.ambow.ects.util.HibernateUtils;


public class OrderAction  extends MappingDispatchAction
{
	public ActionForward orderList(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{
		ActionForward forward = null;
		
		Session session = null;
		Transaction tran = null;
		IOrderDao dao = new OrderDaoHibernateImp();
		Order order = new Order();
		ShopCart shopCart = (ShopCart) request.getSession().getAttribute("shopCart");
		
		User user = (User) request.getSession().getAttribute("user");
		int id = Integer.parseInt(request.getParameter("payWay"));
		
		OrderStatus status = new OrderStatus();
		status.setId(1);
		status.setName("配货状态");
		status.setDescriptions("订单正在配货状态三天内将发出");
		
		session = HibernateUtils.getSession();
		tran = session.beginTransaction();
		String hql = "from PayWay p where p.id=:id";
		PayWay payWay = (PayWay) session.createQuery(hql).setInteger("id",id).uniqueResult();
		tran.commit();
		
		if (shopCart == null)
		{
			System.out.println("shopCart is null.");
			shopCart = new ShopCart();
		}
		order = shopCart.getOrder();
		order.setName(user.getName());
		order.setPayWay(payWay);
		order.setStatus(status);
		order.setUser(user);
		order.setCost(shopCart.getTotal());
		Iterator it = order.getOrderlines().iterator();
		OrderLine orderLine = null;
		
		while (it.hasNext())
		{
			orderLine = (OrderLine) it.next();
			orderLine.setOrder(order);
		}
		
		dao.addOrder(order);
		List<Order> orderList = (List<Order>) dao.findAll(user.getName());
		request.getSession().setAttribute("orderList", orderList);
		
		forward = mapping.findForward("orderList");
		
		return forward;
	}

	public ActionForward viewOrder(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{
		ActionForward forward = null;

		IOrderDao dao = new OrderDaoHibernateImp();
		Order order = new Order();
		Integer id = Integer.parseInt(request.getParameter("orderId"));
		System.out.println(id);
		try
		{
			order = dao.findById(id);
			request.setAttribute("orderdetails", order);
			forward = mapping.findForward("viewOrder");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return forward;
	}
}