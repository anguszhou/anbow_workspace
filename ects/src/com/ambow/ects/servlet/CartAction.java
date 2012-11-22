package com.ambow.ects.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

import com.ambow.ects.dao.IProductDao;
import com.ambow.ects.dao.impl.ProductDaoImp;
import com.ambow.ects.entity.OrderLine;
import com.ambow.ects.entity.Product;
import com.ambow.ects.entity.ShopCart;


public class CartAction extends MappingDispatchAction
{


	public ActionForward addOrderLine(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{
		IProductDao dao = new ProductDaoImp();
		ActionForward forward = null;		
		OrderLine orderline = new OrderLine();
		Product product = new Product();
		
		product = dao.findById(Integer.parseInt(request.getParameter("productId")));
		
		//1�����ҳ����ύ����
				
		orderline.setAmount(1);		
		orderline.setProduct(product);
		System.out.println(orderline.getProduct().getAuthor());
		if(request.getSession().getAttribute("cart")==null)
		{
			request.getSession(true);
			ShopCart cart = new ShopCart();
			request.getSession().setAttribute("cart", cart);
		}
		ShopCart cart=(ShopCart) request.getSession().getAttribute("cart");
		System.out.println(orderline.getProduct().getBasePrice());
		cart.add(orderline);	
		double total = cart.getTotal();
		request.getSession().setAttribute("total", total);
		request.getSession().setAttribute("cart", cart);
			
		forward = mapping.findForward("OrderLineList");
						
		return forward;
	}
   
	public ActionForward deleteCart(ActionMapping mapping, ActionForm form,
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
		ShopCart cart=(ShopCart) request.getSession().getAttribute("cart");
		double total = 0;
		request.getSession().setAttribute("total", total);
		cart.clearCart();
		request.getSession().setAttribute("cart", cart);
		forward = mapping.findForward("deleteOrderLine");
		return forward;
	}
	public ActionForward modifyCart(ActionMapping mapping, ActionForm form,
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
		ShopCart cart=(ShopCart) request.getSession().getAttribute("cart");
		
		Integer amount = Integer.parseInt(request.getParameter("amount"));
		Integer productId = Integer.parseInt(request.getParameter("productId"));
		
		IProductDao dao = new ProductDaoImp();
		
		OrderLine orderLine = new OrderLine();
		try
		{
			Product product = dao.findById(productId);
			orderLine.setProduct(product);
			orderLine.setAmount(amount);
			cart.modify(orderLine);
			double total = cart.getTotal();
			request.getSession().setAttribute("total", total);
			request.getSession().setAttribute("cart", cart);
            
			forward = mapping.findForward("modifyCart");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		} 
		
		return forward;
	}
	
	public ActionForward deleteProduct(ActionMapping mapping, ActionForm form,
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
		
		ShopCart cart=(ShopCart) request.getSession().getAttribute("cart");
		
		Integer productId = Integer.parseInt(request.getParameter("productId"));
		IProductDao dao = new ProductDaoImp();
		
		OrderLine orderLine = new OrderLine();
		
		try
		{
			Product product = dao.findById(productId);
			orderLine.setProduct(product);
			cart.remove(orderLine);
			double total = cart.getTotal();
			request.getSession().setAttribute("total", total);
			request.getSession().setAttribute("cart", cart);
			forward = mapping.findForward("deleteProduct");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		} 
		
		return forward;
	}
	
}