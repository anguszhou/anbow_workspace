package com.ambow.ects.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ambow.ects.dao.IProductDao;
import com.ambow.ects.dao.impl.ProductDaoImp;
import com.ambow.ects.entity.OrderLine;
import com.ambow.ects.entity.Product;
import com.ambow.ects.entity.ShopCart;
import com.ambow.ects.util.HibernateUtils;

public class CartAction extends MappingDispatchAction
{
	public ActionForward addCart(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{

		ActionForward forward = null;

		ShopCart shopCart = (ShopCart) request.getSession().getAttribute("shopCart");
		Integer pid = Integer.parseInt(request.getParameter("pid"));
		IProductDao dao = new ProductDaoImp();
		try
		{
			Product product = dao.findById(pid);
			OrderLine orderLine = new OrderLine();
			orderLine.setProduct(product);
			orderLine.setAmount(1);// ´ý¶¨
			if (shopCart == null)
			{
				shopCart = new ShopCart();
			}
			shopCart.add(orderLine);
			request.getSession().setAttribute("shopCart", shopCart);
			System.out.println("add one item to shopcart.");
			forward = mapping.findForward("addCart");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return forward;
	}

	public ActionForward clearCart(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{
		ActionForward forward = null;

		ShopCart shopCart = (ShopCart) request.getSession().getAttribute(
				"shopCart");
		IProductDao dao = new ProductDaoImp();
		try
		{
			if (shopCart == null)
			{
				shopCart = new ShopCart();
			}
			shopCart.clearCart();
			request.getSession().setAttribute("shopCart", shopCart);
			System.out.println("clear shopcart.");
			forward = mapping.findForward("clearCart");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return forward;
	}

	public ActionForward modifyCart(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{
		ActionForward forward = null;
		ShopCart shopCart = (ShopCart) request.getSession().getAttribute("shopCart");
		Integer amount = Integer.parseInt(request.getParameter("amount"));
		Integer productId = Integer.parseInt(request.getParameter("productId"));
		System.out.println(amount);
		IProductDao dao = new ProductDaoImp();
		OrderLine orderLine = new OrderLine();
		try
		{
			Product product = dao.findById(productId);
			orderLine.setProduct(product);
			orderLine.setAmount(amount);
			shopCart.modify(orderLine);
			request.getSession().setAttribute("shopCart", shopCart);
			System.out.println("modify shopcart.");
			forward = mapping.findForward("modifyCart");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		} 
		
		return forward;
	}
	
	
	public ActionForward cancelProduct(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{
		ActionForward forward = null;
		ShopCart shopCart = (ShopCart) request.getSession().getAttribute("shopCart");
		Integer productId = Integer.parseInt(request.getParameter("productId"));
		IProductDao dao = new ProductDaoImp();
		OrderLine orderLine = new OrderLine();
		try
		{
			Product product = dao.findById(productId);
			orderLine.setProduct(product);
			shopCart.remove(orderLine);
			request.getSession().setAttribute("shopCart", shopCart);
			System.out.println("cancel one Product from shopcart.");
			forward = mapping.findForward("modifyCart");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		} 
		
		return forward;
	}
}