package com.ambow.ects.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControlServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{

		String path = request.getServletPath();

		path = path.substring(0, path.lastIndexOf("."));

		if (path.equals("/productlist"))
		{

			ProductHandler productHandler = new ProductHandler();

			productHandler.viewProduct(request, response);
		} 
		else if (path.equals("/details"))
		{
			System.out.println("details");
			ProductHandler handler = new ProductHandler();
			handler.findById(request, response);
		} 
		else if (path.equals("/login"))
		{
			System.out.println("login");
			UserHandler handler = new UserHandler();
			handler.login(request, response);
		}
		else if (path.equals("/register"))
		{
			System.out.println("register");
			UserHandler handler = new UserHandler();
			handler.resgister(request, response);
		}
		else if (path.equals("/update"))
		{
			System.out.println("update");
			UserHandler handler = new UserHandler();
			handler.update(request, response);
		}
		else if (path.equals("/addCart"))
		{
			System.out.println("addCart");
			OrderHandler handler = new OrderHandler();
			handler.addCart(request, response);
		}
		else if (path.equals("/clearCart"))
		{
			System.out.println("clearCart");
			OrderHandler handler = new OrderHandler();
			handler.clearCart(request, response);
		}
		else if (path.equals("/modifyCart"))
		{
			System.out.println("modifyCart");
			OrderHandler handler = new OrderHandler();
			handler.modifyCart(request, response);
		}
		else
		{
			System.out.println("Error");
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException
	{

		doGet(request, response);
	}

}