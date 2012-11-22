package com.ambow.ects.servlet;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;
import org.hibernate.Session;

import com.ambow.ects.dao.IOrderDao;
import com.ambow.ects.dao.impl.OrderDaoHibernateImp;
import com.ambow.ects.entity.Order;
import com.ambow.ects.entity.OrderLine;
import com.ambow.ects.entity.OrderStatus;
import com.ambow.ects.entity.PayWay;
import com.ambow.ects.entity.ShopCart;
import com.ambow.ects.entity.User;
import com.ambow.ects.util.HibernateUtil;

public class OrderAction extends MappingDispatchAction
{

	public ActionForward orderList(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{
		ActionForward forward = null;
		
		if(request.getSession().getAttribute("cart")==null)
		{
			request.getSession(true);
			ShopCart cart = new ShopCart();
			request.getSession().setAttribute("cart", cart);
		}
		ShopCart cart=(ShopCart)request.getSession().getAttribute("cart");
		
		Order order = new Order ();
		User user = (User)request.getSession().getAttribute("user");
		int paywayId = Integer.parseInt(request.getParameter("payway"));
		
		OrderStatus status = new OrderStatus();
		status.setId(1);
		status.setName("配货状态");
		status.setDescriptions("订单正在配货状态三天内将发出");
		
		Session session = HibernateUtil.getSesstion();
		session.getTransaction().begin();
		String hql="from PayWay payway where payway.id=:paywayId";
		PayWay payway=(PayWay)session.createQuery(hql).setInteger("paywayId", paywayId).uniqueResult();
		session.getTransaction().commit();
		
		order=cart.getOrder();
		order.setName(user.getName());
		order.setCost(cart.getTotal());
		order.setUser(user);
		order.setPayWay(payway);
		order.setStatus(status);
		
		OrderLine orderline = new OrderLine();
		
		for (Object object : order.getOrderlines())
		{
			orderline = (OrderLine)object;
			orderline.setOrder(order);
		}
		
		IOrderDao dao = new OrderDaoHibernateImp();
		dao.addOrder(order);
		
		List<Order> orderlist = (List<Order>) dao.findAll(user.getName());
		request.getSession().setAttribute("orderlist", orderlist);
		forward = mapping.findForward("orderList");
		
		return forward;
	}
	
	public ActionForward showOrder(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{
		ActionForward forward = null;
		
		IOrderDao dao = new OrderDaoHibernateImp();
		Order orderinfo = dao.findById(Integer.parseInt(request.getParameter("orderId")));
		
		Session session = HibernateUtil.getSesstion();
		session.getTransaction().begin();
		int amount  = 0;
		double cost = 0;
		
		for (Object  object: orderinfo.getOrderlines())
		{
			OrderLine orderline =(OrderLine)object ; 
			amount += orderline.getAmount();
			cost += orderline.getAmount()*orderline.getProduct().getBasePrice();
		}
		
		request.getSession().setAttribute("orderinfo", orderinfo);
		request.getSession().setAttribute("amount", amount);
		request.getSession().setAttribute("cost", cost);
		
		forward = mapping.findForward("showOrder");
		
		return forward;
	}
	
	public ActionForward logout(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{
		ActionForward forward = null;
		
		request.getSession().invalidate();
		
		forward = mapping.findForward("logout");
		
		return forward;
	}
}
