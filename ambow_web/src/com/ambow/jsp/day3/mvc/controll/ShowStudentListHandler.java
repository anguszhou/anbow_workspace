package com.ambow.jsp.day3.mvc.controll;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ambow.jsp.day1.mvc.Student;
import com.ambow.jsp.day1.mvc.dao.IStudentDao;
import com.ambow.jsp.day1.mvc.dao.impl.StudentDaoImpl;



public class ShowStudentListHandler {


	public void viewStudent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		IStudentDao  dao = new StudentDaoImpl();
		
		List studentList = dao.findAllStudents();
		
		request.setAttribute("studentList", studentList);
		
		request.getSession().getServletContext().getRequestDispatcher("/jsp/studentlist.jsp").forward(request, response);
		
	}

	public void login(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

	IStudentDao  dao = new StudentDaoImpl();
	
	String name = request.getParameter("username");
	System.out.println(name);
	String password = request.getParameter("password");
	
	System.out.println(password);
	
	Student student = dao.findByNameAndPassword(name, password);
	
	request.setAttribute("student", student);
	
	System.out.println(student);
	
	request.getSession().getServletContext().getRequestDispatcher("/jsp/welcome.jsp").forward(request, response);

}

}









