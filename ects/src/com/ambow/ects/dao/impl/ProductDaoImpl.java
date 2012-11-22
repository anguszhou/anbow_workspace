package com.ambow.ects.dao.impl;

import java.util.Collection;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;

import com.ambow.ecport.exception.ManagerProductException;
import com.ambow.ects.dao.IProductDao;
import com.ambow.ects.entity.Product;
import com.ambow.ects.util.HibernateUtil;

public class ProductDaoImpl implements IProductDao {

	public Collection find(int start, int max) throws ManagerProductException {
		
		Session session = null ;
		
		Collection collection = null;
		
		try
		{
			session = HibernateUtil.getSesstion();
			
			session.getTransaction().begin();
			
			String hql="from Product";
			
			Query query = session.createQuery(hql);
			
			query.setFirstResult(start);
			
			query.setMaxResults(max);
			
			collection = query.list();
			
			session.getTransaction().commit();
		}catch(Exception e)
		{
			e.printStackTrace();
			
			session.getTransaction().rollback();
		}finally
		{
			session.close() ;
		}
		return collection;
	}

	public Collection find(Product product) throws ManagerProductException {
        
		
		return null;
	}

	public Collection findAll() throws ManagerProductException {
        
		Session session = null ;
		
		Collection collection = null;
		
		Product product = null;
		
		try
		{
			session = HibernateUtil.getSesstion();
			
			session.getTransaction().begin();
			
			String hql="from Product";
			
			collection  = session.createQuery(hql).list();	
			
			for (Object object : collection)
			{
				product = (Product) object ;
				
				Hibernate.initialize(product.getCategory());
			}
									
			session.getTransaction().commit();
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
			session.getTransaction().rollback();
		}finally
		{
			session.close() ;
		}
		return collection;
	}

	public Product findById(Integer id) throws ManagerProductException {
		
		Session session = null ;
				
		Product product = null;
		
		try
		{
			session = HibernateUtil.getSesstion();
			
			session.getTransaction().begin();
									
			product =(Product) session.get(Product.class, id);	
			
			Hibernate.initialize(product.getCategory());
			
			session.getTransaction().commit();
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
			session.getTransaction().rollback();
		}finally
		{
			session.close() ;
		}
		return product;
	}

	public int getTotal() throws ManagerProductException {
		
		/*Session session = null ;
		
		int total = 0;
		
		try
		{
			session = HibernateUtil.getSesstion();
			
			session.getTransaction().begin();
			
			String hql="select count(*) from Product product ";
			
			total  =((Integer) session.createQuery(hql).iterate().next()).intValue();	
									
			session.getTransaction().commit();
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
			session.getTransaction().rollback();
		}finally
		{
			session.close() ;
		}
		
		return total;
	*/
		
	    return findAll().size();

   }
}