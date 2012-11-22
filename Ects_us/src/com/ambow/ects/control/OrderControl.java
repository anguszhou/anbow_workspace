package com.ambow.ects.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ambow.ects.handler.OrderHandler;



public class OrderControl extends HttpServlet
{

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException
	{
	doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException
	{
		String path = request.getServletPath();
		
		path = path.substring(0, path.lastIndexOf("."));
		
		if(path.equals("/servlet/mvc/ShowOrderServlet"))
		{
			OrderHandler hander1 = new OrderHandler();
										
		}
		
	
	}

}
