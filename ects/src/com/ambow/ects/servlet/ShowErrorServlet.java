package com.ambow.ects.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowErrorServlet 
{


	public  void viewError(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		String path = request.getServletPath();
		
		path = path.substring(0, path.lastIndexOf("."));
		
		if(path.equals(""))
		{
			
		}
		
	}


	

}
