package com.ambow.servlet.day3.mvc.controll;

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
		
		if(path.equals("/servlet/mvc/showstudentlist")){
			
			//viewStudent(request,response);
			
			ShowStudentListHandler hander = new ShowStudentListHandler();
			
			hander.viewStudent(request, response);
		}else{
			
			errorStudent(request,response);
		}
			
	}

	
	
	private void errorStudent(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

			request.setAttribute("message", "show students error");
		
			ServletContext context = getServletContext();
			
			//����ת����
			
			RequestDispatcher dispatcher = context.getRequestDispatcher("/servlet/mvc/errorStudent");
			
			//ת��
			
			dispatcher.forward(request, response);
	
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			doGet(request, response);
	}
	
	protected void viewStudent(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		IStudentDao dao = new StudentDaoImpl();
		
		List studentList = dao.findAllStudents();
		
		//��ѧ���ŵ�request��Χ
		request.setAttribute("studentList", studentList);
		//���servlet��Ӧ��������
		
		ServletContext context = getServletContext();
		
		//����ת����
		
		RequestDispatcher dispatcher = context.getRequestDispatcher("/servlet/mvc/viewStudent");
		
		//ת��
		
		dispatcher.forward(request, response);
}

}









