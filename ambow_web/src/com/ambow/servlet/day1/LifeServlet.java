package com.ambow.servlet.day1;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeServlet extends HttpServlet {
	
	
	public void init(ServletConfig config) throws ServletException {
		
		
		System.out.println(config.getInitParameter("USER_NAME"));
		
		System.out.println(config.getInitParameter("PASSWORD"));
		
		System.out.println("LifeServlet.init()");
	}


	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("LifeServlet.service()");
		
	}

	public void destroy() {
		
		System.out.println("LifeServlet.destroy()");
	
	}

	

}
