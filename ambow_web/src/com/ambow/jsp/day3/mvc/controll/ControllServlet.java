package com.ambow.jsp.day3.mvc.controll;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ambow.servlet.day3.mvc.Student;
import com.ambow.servlet.day3.mvc.dao.IStudentDao;
import com.ambow.servlet.day3.mvc.dao.impl.StudentDaoImpl;
import com.ambow.servlet.day3.mvc.util.ConnectionFactory;

public class ControllServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String path = request.getServletPath();
		
		path = path.substring(0, path.lastIndexOf("."));
		
		if(path.equals("/jsp/studentview")){
			
			ShowStudentListHandler hander = new ShowStudentListHandler();
			
			hander.viewStudent(request, response);
		}else if(path.equals("/student/login")){
			
			ShowStudentListHandler hander = new ShowStudentListHandler();
			
			System.out.println("========");
			hander.login(request, response);
		}
			
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			doGet(request, response);
	}
	

}









