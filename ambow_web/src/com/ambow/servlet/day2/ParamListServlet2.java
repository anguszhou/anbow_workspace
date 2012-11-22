package com.ambow.servlet.day2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParamListServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("	<title>Params</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2 align=\"center\">All parameters in the current request</h2>");
		out.println("<hr>");
		out.println("<ol>");
		Enumeration  en = request.getParameterNames();
		while(en.hasMoreElements()){
			
			String name = (String) en.nextElement();
			
			String [] values = request.getParameterValues(name) ;
			
			out.println("	<li>"+name+"="+join(values,",")+"</li>");
			
		}
		
		out.println("</ol>");
		out.println("</body>");
		
		out.close();
	
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			doGet(request, response);
	}
	
	public String join(String [] paramValues,String ch){
		
		StringBuffer jpsb = new StringBuffer();
		
		for (int i = 0; i < paramValues.length; i++) {
			
			if(i != 0){
				
				jpsb.append(ch);
			}
			jpsb.append(paramValues[i]);
		}
		return jpsb.toString();
	}

}









