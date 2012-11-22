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
public class UpdateUserServlet 
{


	public  void UpdateUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html");
		request.setCharacterEncoding("GBK");
		response.setCharacterEncoding("GBK");
		PrintWriter out = response.getWriter();
				
		ContcatInfo con = new ContcatInfo();
		
		User user=new User();
						
		IUserDao dao = new UserDaoImpl ();
							
		String name      = request.getParameter("username");
		String passwd    = request.getParameter("password");
		String country   = request.getParameter("country");
		String province  = request.getParameter("province"); 
		String city      = request.getParameter("city");
		String street1   = request.getParameter("street1");
		String street2   = request.getParameter("street2");
		String zip       = request.getParameter("zip");
		String officePhone  = request.getParameter("officePhone");
		String cellphone    = request.getParameter("cellphone");
		String homePhone    = request.getParameter("homePhone");
		String email        = request.getParameter("email");
		user.setName(name);
		user.setPasswd(passwd);
		Session session = null;
		int country_id=Integer.parseInt(country);
		Country coun = new Country();			
		Province p1 = new Province();		
		int p3=Integer.parseInt(province);
		
		try
		{
			session = HibernateUtil.getSesstion();
			session.getTransaction().begin();
			String hql1 = "from Country country where country.id =:country_id ";
			String hql2= "from Province province where province.id =:p3 ";
			coun = (Country) session.createQuery(hql1).setInteger("country_id", country_id).uniqueResult();
			p1=(Province)session.createQuery(hql2).setInteger("p3", p3).uniqueResult();
			
		}catch(Exception e)
		{
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally
		{
			session.close();
		}
	    con.setStreet1(street1);
	    con.setStreet2(street2);
	    con.setCity(city);
	    con.setZip(zip);
	    con.setEmail(email);
	    con.setHomePhone(homePhone);
	    con.setCellPhone(cellphone);
	    con.setOfficePhone(officePhone);
	    con.setCountry(coun);
	    con.setProvince(p1);
	    con.setUser(user);
	    user.setInfo(con);
	    try
		{
			dao.add(user);
		}
		catch (ManagerUserException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}


	


