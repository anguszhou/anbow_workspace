package com.ambow.servlet.day1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CurrentTimeServlet extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
			//�趨mine��ʽ
			
			response.setContentType("text/html");
		
			//��������
		
			PrintWriter out = response.getWriter();
			
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Untitled</title>");
			out.println("</head>");
			out.println("<body>");
			out.println(new Date());
			out.println("</body>");
			out.println("</html>");
			
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			doGet(request,response);
	}

}
