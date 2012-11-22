package com.ambow.ects.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllServlet extends HttpServlet
{


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		String path = request.getServletPath();
		
		path = path.substring(0, path.lastIndexOf("."));
		
		if(path.equals("/ShowProductServlet1"))
		{
			ShowProductServlet hander = new ShowProductServlet();
			
			hander.showProduct(request, response);
						
		}
		else if(path.equals("/ShowProductServlet"))
		{
			ShowProductServlet hander = new ShowProductServlet();
			
			hander.showCategory(request, response);
		}	
		else if(path.equals("/AddUserServlet"))
		{
			AddUserServlet hander = new AddUserServlet();
			
			hander.addUser(request, response);
		}
		else if(path.equals("/AddUserServlet1"))
		{
			AddUserServlet hander = new AddUserServlet();
			
			hander.toRegister(request, response);
		}
		else if(path.equals("/toLogin"))
		{
			AddUserServlet hander = new AddUserServlet();
			
			hander.toLogin(request, response);
		}
		else if(path.equals("/Login"))
		{
			AddUserServlet hander = new AddUserServlet();
			
			hander.Login(request, response);
		}	
		else if(path.equals("/toModify"))
		{
			AddUserServlet hander = new AddUserServlet();
			
			hander.toModify(request, response);
		}	
		else if(path.equals("/Update"))
		{
			AddUserServlet  hander = new AddUserServlet ();
			
			hander.UpdateUser(request, response);
		}
		else if(path.equals("/servlet/jsp/UpdateUserServlet "))
		{
			UpdateUserServlet  hander = new UpdateUserServlet ();
			
			hander.UpdateUser(request, response);
		}	
		else 
		{
		ShowErrorServlet hander = new ShowErrorServlet();
		
		hander.viewError(request, response);
	    }
	}

		
		
	

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		doGet(request, response);
	}

}
