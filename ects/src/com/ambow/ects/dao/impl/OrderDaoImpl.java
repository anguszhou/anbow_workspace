package com.ambow.ects.dao.impl;

import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;

import org.hibernate.Session;
import org.hibernate.Hibernate;

import com.ambow.ecport.exception.ManagerOrderException;
import com.ambow.ects.dao.IOrderDao;
import com.ambow.ects.entity.Order;
import com.ambow.ects.entity.User;
import com.ambow.ects.util.ConnectionFactory;
import com.ambow.ects.util.HibernateUtil;


public class OrderDaoImpl  implements IOrderDao{

	public void addOrder(Order order) throws ManagerOrderException {
		
			Session session=null;
					
		try{
			session=HibernateUtil.getSesstion();
			
			session.getTransaction().begin();
			
			session.save(order);
			
			session.getTransaction().commit();
				    	  
		}catch(Exception e)
		{
			e.printStackTrace();
			
			session.getTransaction().rollback();
			
		}finally
		{
			session.close();
		}				
	}

	public Collection findAll(String user_name) throws ManagerOrderException {
		
		Collection collection=null;
		
		Session session=null;
		
		Order order = null;
		
		User user = null;
		
		try
		{
			session=HibernateUtil.getSesstion();
			
			session.getTransaction().begin();
			
			String hql="from User user where user.name =:user_name";
								
			user = (User)session.createQuery(hql).setString("user_name", user_name).uniqueResult();
			
			hql="from Order order where order.user=:id";
			
			collection = (Collection)session.createQuery(hql).setInteger("id", user.getId()).list();
			
			for (Object object : collection)
			{
				order = (Order) object ; 
				
				Hibernate.initialize(order.getOrderlines());
				
				Hibernate.initialize(order.getPayWay());
				
				Hibernate.initialize(order.getStatus());
				
				Hibernate.initialize(order.getUser());
			}
			
			session.getTransaction().commit();
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
			session.getTransaction().rollback();
			
		}finally
		{
			session.close();
		}
		return collection;
		
	}

	public Order findById(Integer id) throws ManagerOrderException {
		
		Session session = null;
		
		Order order = null;
		
		try
		{
			session = HibernateUtil.getSesstion();
			
			session.getTransaction().begin();
			
			String hql="from Order order where order.id = :id";
			
			order = (Order)session.createQuery(hql).setInteger("id", id).uniqueResult();
								
			Hibernate.initialize(order.getOrderlines());
			
			Hibernate.initialize(order.getPayWay());
			
			Hibernate.initialize(order.getStatus());
			
			Hibernate.initialize(order.getUser());
				
		    session.getTransaction().commit();
		}catch (Exception e)
		{
			e.printStackTrace();
			
			session.getTransaction().rollback();
			
		}finally
		{
			session.close();
		}
		return order;
	}
   
}
