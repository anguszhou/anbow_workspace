package com.ambow.ects.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import com.ambow.ecport.exception.ManagerUserException;
import com.ambow.ects.dao.IUserDao;
import com.ambow.ects.dao.impl.UserDaoHibernateImp;
import com.ambow.ects.dao.impl.UserDaoImpl;
import com.ambow.ects.entity.ContcatInfo;
import com.ambow.ects.entity.Country;
import com.ambow.ects.entity.Province;
import com.ambow.ects.entity.ShopCart;
import com.ambow.ects.entity.User;
import com.ambow.ects.util.HibernateUtil;

public class AddUserServlet 
{


	public  void addUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		response.setContentType("text/html");
		request.setCharacterEncoding("GBK");
		response.setCharacterEncoding("GBK");
				
		ContcatInfo con = new ContcatInfo();		
		User user=new User();						
		IUserDao dao = new UserDaoHibernateImp();
							
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
	    System.out.println(user.getName());
	    try
		{
	    	if("".equals(request.getParameter("username"))
	    		||request.getParameter("username")==null
	    		||"".equals(request.getParameter("password"))
	    		||request.getParameter("password")==null
	    		||!request.getParameter("password").equals(request.getParameter("enter")))
	    	{
	    		request.getSession().getServletContext().getRequestDispatcher("/register.jsp").forward(request, response);
	    		
	    	}else
	    	{
	    		dao.add(user);
	    		request.getSession().setAttribute("user", user);
	    		request.getSession().getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	    	}
			
		}
		catch (ManagerUserException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
		
		public void toRegister(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException
		{
			request.getSession().getServletContext().getRequestDispatcher("/register.jsp").forward(request, response);
		}
		
		public void toLogin(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException
		{
			request.getSession().getServletContext().getRequestDispatcher("/myaccount.jsp").forward(request, response);
		}
		public void Login(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException
		{
			response.setContentType("text/html");
			request.setCharacterEncoding("GBK");
			response.setCharacterEncoding("GBK");									
			User user=new User();
							
			IUserDao dao = new UserDaoHibernateImp();
			
			String name    = request.getParameter("username");
			String passwd  = request.getParameter("password");

			
				try
				{
					user = dao.login(name, passwd);
					if(user==null)
					{
						request.getSession().getServletContext().getRequestDispatcher("/myaccount.jsp").forward(request, response);
					}
					else
					{
						ShopCart shopcart = new ShopCart();
						
						request.getSession().setAttribute("user", user);
						
						request.getSession().setAttribute("info", user.getInfo());

                        //request.getSession().setAttribute("shopcart", shopcart);
                        
						request.getSession().getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
					}
					
				}
				catch (ManagerUserException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
		
			
		}
		
	public void UpdateUser(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		response.setContentType("text/html");
		request.setCharacterEncoding("GBK");
		response.setCharacterEncoding("GBK");
		
				
		ContcatInfo con = new ContcatInfo();
		
		User user=(User)request.getSession().getAttribute("user");
		con.setId(user.getId());
						
		IUserDao dao = new UserDaoHibernateImp();
							
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
	    	if("".equals(request.getParameter("username"))
		    		||request.getParameter("username")==null
		    		||"".equals(request.getParameter("password"))
		    		||request.getParameter("password")==null
		    		||!request.getParameter("password").equals(request.getParameter("enter")))
	    	{
	    		request.getSession().getServletContext().getRequestDispatcher("/account.jsp").forward(request, response);
	    	}else
	    	{
	    		dao.update(user);
	    		request.getSession().getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	    	}
		}
		catch (ManagerUserException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void toModify(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException
	{
		//System.out.println(((User)request.getSession().getAttribute("user")).getInfo().getStreet1());
		
		try{
		User user = (User) request.getSession().getAttribute("user");
		
		request.getSession().getServletContext().getRequestDispatcher("/account.jsp").forward(request, response);
		}catch(Exception e){
			
			e.printStackTrace();
		}
		
		
	}
}


	


