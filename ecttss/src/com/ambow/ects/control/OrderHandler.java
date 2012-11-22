package com.ambow.ects.control;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ambow.ecport.exception.ManagerProductException;
import com.ambow.ects.dao.IProductDao;
import com.ambow.ects.dao.impl.ProductDaoImp;
import com.ambow.ects.entity.OrderLine;
import com.ambow.ects.entity.Product;
import com.ambow.ects.entity.ShopCart;
import com.ambow.ects.util.HibernateUtils;

public class OrderHandler
{
	public void addCart(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		ShopCart shopCart = (ShopCart) request.getSession().getAttribute(
				"shopCart");
		Integer pid = Integer.parseInt(request.getParameter("pid"));
		IProductDao dao = new ProductDaoImp();
		try
		{
			Product product = dao.findById(pid);
			OrderLine orderLine = new OrderLine();
			orderLine.setProduct(product);
			orderLine.setAmount(1);
			if (shopCart == null)
			{
				shopCart = new ShopCart();
			}
			shopCart.add(orderLine);
			request.getSession().setAttribute("shopCart", shopCart);
			System.out.println("add one item to shopcart.");
			request.getSession().getServletContext().getRequestDispatcher(
					"/cart.jsp").forward(request, response);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void clearCart(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
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
			request.getSession().getServletContext().getRequestDispatcher(
					"/cart.jsp").forward(request, response);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public void modifyCart(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{
		ShopCart shopCart = (ShopCart) request.getSession().getAttribute(
				"shopCart");
		Integer amount = Integer.parseInt(request.getParameter("amount"));
		Integer orderLineId = Integer.parseInt(request.getParameter("orderLineId"));
		IProductDao dao = new ProductDaoImp();
		Session session = null;
		Transaction tran = null;
		OrderLine orderLine = null;
		try
		{
			session = HibernateUtils.getSession();
			tran = session.beginTransaction();
			orderLine = (OrderLine) session.createQuery(" from  OrderLine o where o.id =:id").setInteger("id",
					orderLineId).uniqueResult();
			tran.commit();
			orderLine.setAmount(amount);
			shopCart.modify(orderLine);
			request.getSession().setAttribute("shopCart", shopCart);
			System.out.println("modify shopcart.");
			request.getSession().getServletContext().getRequestDispatcher("/cart.jsp").forward(request, response);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			tran.rollback();
		} 
		finally
		{
			session.close();
		}
	}

}
