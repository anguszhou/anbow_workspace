package com.ambow.servlet.day3.mvc.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ambow.servlet.day3.mvc.Student;
import com.ambow.servlet.day3.mvc.dao.IStudentDao;
import com.ambow.servlet.day3.mvc.dao.impl.StudentDaoImpl;
import com.ambow.servlet.day3.mvc.util.ConnectionFactory;

public class ErrorStudentListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List studentList = (List)request.getAttribute("studentList");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String message = (String) request.getAttribute("message");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Untitled</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2 align=\"center\">Student List USE ViewStudentListServlet view</h2>");
		out.println("<hr/>");
		out.println(message);
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}

	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			doGet(request, response);
	}
	

}









