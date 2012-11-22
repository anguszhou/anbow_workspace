package com.ambow.ects.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ambow.ecport.exception.ManagerProductException;
import com.ambow.ects.dao.IProductDao;
import com.ambow.ects.dao.impl.ProductDaoImp;
import com.ambow.ects.entity.Product;

public class ProductHandler
{
	public void viewProduct(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{

		IProductDao dao = new ProductDaoImp();
		List productList;
		
		try
		{
			productList = (List) dao.findAll();
			request.setAttribute("productList", productList);
			request.getSession().getServletContext().getRequestDispatcher("/specials.jsp").forward(request, response);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	public void findById(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		
		IProductDao dao = new ProductDaoImp();
		Product product = new Product();
		Integer id = Integer.parseInt(request.getParameter("pid"));
		System.out.println(id);
		try
		{
			product = dao.findById(id);
			request.setAttribute("productdetails", product);
			request.getSession().getServletContext().getRequestDispatcher("/details.jsp").forward(request, response);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
