package com.ambow.ects.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ambow.ects.dao.IUserDao;
import com.ambow.ects.dao.impl.UserDaoHibernateImp;
import com.ambow.ects.entity.ContcatInfo;
import com.ambow.ects.entity.Country;
import com.ambow.ects.entity.Province;
import com.ambow.ects.entity.ShopCart;
import com.ambow.ects.entity.User;
import com.ambow.ects.util.HibernateUtils;


public class UserAction  extends MappingDispatchAction{

	
	public ActionForward login(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		
		ActionForward forward = null;
		
		IUserDao dao = new UserDaoHibernateImp();
		User user = new User();
		
		ShopCart shopCart = (ShopCart) request.getSession().getAttribute("shopCart");
		if (shopCart == null)
		{
			shopCart = new ShopCart();
		}
		String name = request.getParameter("username");
		String passwd = request.getParameter("password");
		
		try
		{
			user = dao.login(name, passwd);
			if (user != null)
			{
				request.getSession().setAttribute("user", user);
				request.getSession().setAttribute("shopCart", shopCart);
				forward = mapping.findForward("success");
			}
			else
			{
				request.setAttribute("message", "The User Not found From DB");
				
				forward = mapping.findForward("error");
			}

		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return forward;
	}
	
	
	public ActionForward logout(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{
		ActionForward forward = null;
		
		HttpSession session = request.getSession();
		
		session.removeAttribute("user");
		session.removeAttribute("shopCart");
		
		session.invalidate();		
		forward = mapping.findForward("login");
		
		return forward;
	}

	public ActionForward register(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		ActionForward forward = null;
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		Session session = null;
		Transaction tran = null;
		IUserDao userDao = new UserDaoHibernateImp();

		String name = request.getParameter("username");
		String passwd = request.getParameter("password");
		Country country = new Country("中国");
		country.setId(1);
		Province province = null;
		int province_id = Integer.parseInt(request.getParameter("province"));
		User user = null;

		session = HibernateUtils.getSession();
		tran = session.beginTransaction();
		String hql = "from Province province where province.id=:id";
		province = (Province) session.createQuery(hql).setInteger("id",
				province_id).uniqueResult();

		tran.commit();

		province.setCountry(country);
		user = null;
		ContcatInfo contact = null;

		user = new User(name, passwd);

		contact = new ContcatInfo(request.getParameter("cellphone"), request.getParameter("city"), country, request.getParameter("email"),
				request.getParameter("homephone"), request.getParameter("officephone"), province, request.getParameter("street1"), 
				request.getParameter("street2"), user, request.getParameter("zip"));
		
		contact.setUser(user);
		user.setInfo((contact));

		try
		{
			userDao.add(user);
			ShopCart shopCart = new ShopCart();
			request.getSession().setAttribute("shopCart", shopCart);
			request.getSession().setAttribute("user", user);
			forward = mapping.findForward("success");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return forward;
	}
	
	public ActionForward updateUser(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		ActionForward forward = null;
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		Session session = null;
		Transaction tran = null;
		IUserDao userDao = new UserDaoHibernateImp();

		String name = request.getParameter("username");
		String passwd = request.getParameter("password");
		
		Country country = new Country("中国");
		country.setId(1);
		Province province = null;
		int province_id = Integer.parseInt(request.getParameter("province"));
		User user = null;

		session = HibernateUtils.getSession();
		tran = session.beginTransaction();
		String hql = "from Province province where province.id=:id";
		province = (Province) session.createQuery(hql).setInteger("id",
				province_id).uniqueResult();

		tran.commit();

		province.setCountry(country);
		user = (User) request.getSession().getAttribute("user");

		System.out.println(user.getId());
		user.setName(name);
		user.setPasswd(passwd);
		ContcatInfo contact = user.getInfo();

		contact.setCellPhone(request.getParameter("cellphone"));
		contact.setCity(request.getParameter("city"));
		contact.setEmail(request.getParameter("email"));
		contact.setHomePhone(request.getParameter("homephone"));
		contact.setOfficePhone(request.getParameter("officephone"));
		contact.setProvince(province);
		contact.setStreet1(request.getParameter("street1"));
		contact.setStreet2(request.getParameter("street2"));
		contact.setZip(request.getParameter("zip"));
		contact.setUser(user);
		contact.setCountry(country);
		user.setInfo((contact));

		try
		{
			userDao.update(user);
			request.getSession().setAttribute("user", user);
			forward = mapping.findForward("success");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return forward;
	}
	

}
