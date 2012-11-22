package com.ambow.ects.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ambow.ects.dao.IProductDao;
import com.ambow.ects.dao.impl.ProductDaoImp;
import com.ambow.ects.entity.Product;
import com.ambow.ects.util.HibernateUtils;

public class ProductAction extends MappingDispatchAction
{
	public ActionForward viewProduct(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception 
	{
		
		ActionForward forward = null;
		
		IProductDao dao = new ProductDaoImp();
		List productList;
		
		try
		{
			productList = (List) dao.findAll();
			request.setAttribute("productList", productList);
			forward = mapping.findForward("productList");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

		
		return forward;
	}
	
	
	public ActionForward findById(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception
	{
		ActionForward forward = null;
		
		IProductDao dao = new ProductDaoImp();
		Product product = new Product();
		Integer id = Integer.parseInt(request.getParameter("pid"));
		System.out.println(id);
		try
		{
			product = dao.findById(id);
			request.setAttribute("productdetails", product);
			forward = mapping.findForward("productdetails");
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return forward;
	}
}