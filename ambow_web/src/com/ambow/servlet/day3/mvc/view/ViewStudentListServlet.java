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

public class ViewStudentListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List studentList = (List)request.getAttribute("studentList");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Untitled</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2 align=\"center\">Student List USE ViewStudentListServlet view</h2>");
		out.println("<hr/>");
		out.println("<table align=\"center\" border=\"1\" width=\"900\" height=\"70\" bgcolor=\"red\">");
		out.println("<tr align=\"center\">");
		out.println("<td>ID</td>");
		out.println("<td>NAME</td>");
		out.println("<td>PASSWORD</td>");
		out.println("</tr>");
		
		try{
			
			Iterator it = studentList.iterator();
			
			while(it.hasNext()){
				
				Student student = (Student) it.next();
				out.println("<tr align=\"center\">");
				out.println("<td>"+student.getId()+"</td>");
				out.println("<td>"+student.getName()+"</td>");
				out.println("<td>"+(student.getPassword()==null||"".equals(student.getPassword())?"&nbsp;":student.getPassword())+"</td>");
				out.println("</tr>");
			}
		}catch(Exception e){
			
			new RuntimeException("when query student error");
			
			e.printStackTrace();
		}
		out.println("</table>");
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









