package com.ambow.ects.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.ambow.ecport.exception.ManagerUserException;
import com.ambow.ects.dao.IUserDao;
import com.ambow.ects.dao.impl.UserDaoImpl;
import com.ambow.ects.entity.ContcatInfo;
import com.ambow.ects.entity.Country;
import com.ambow.ects.entity.Province;
import com.ambow.ects.entity.User;
import com.ambow.ects.util.HibernateUtil;
import javax.servlet.ServletContext;
public class LoginUserServlet 
{


	public  void Login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html");
		request.setCharacterEncoding("GBK");
		response.setCharacterEncoding("GBK");
		PrintWriter out = response.getWriter();
						
		User user=new User();
						
		IUserDao dao = new UserDaoImpl ();
		out.println("<html>");
		out.println("<head>");
		out.println("	<title>Params</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h2 align=\"center\">My Account</h2>");
		out.println("<hr/>");
		out.println("<table align=\"center\" border=\"1\" width=\"500\" height=\"50\">");
		out.println("<tr>");
		out.println("<td>id</td>");
		out.println("<td>name</td>");
		out.println("<td>password</td>");
		
		out.println("</tr>");
		
				
		String name    = request.getParameter("username");
		String passwd  = request.getParameter("password");
	
					
		System.out.println(name);
		System.out.println(passwd);
		try
		{
			user = dao.login(name, passwd);
		}
		catch (ManagerUserException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(user);
		out.println("<tr>");
		out.println("<td>"+user.getId()+"</td>");
		out.println("<td>"+user.getName()+"</td>");
		out.println("<td>"+user.getPasswd()+"</td>");
		
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");

}
	
}

