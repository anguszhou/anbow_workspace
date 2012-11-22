package com.ambow.hibernate.o2m;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.ambow.hibernate.util.HibernateUtil;

public class OrderDaoImpl implements IOrderDao {


	public void addOrder(Order order) {
		
		Session session = null;
		
		try{
			session = HibernateUtil.getSession();
			
			session.getTransaction().begin();
			
			session.save(order);
			
			session.getTransaction().commit();
			
		}catch(Exception e){
			
			e.printStackTrace();
			
			session.getTransaction().rollback();
		}finally{
			
			session.close();
		}

	}

	
	public Order findById(int id) {
	
		Session session = null;
		
		Order order = null;
		try{
			session = HibernateUtil.getSession();
			
			session.getTransaction().begin();
			
			String hql = "from Order o where o.id=:id";

			order = (Order)session.createQuery(hql).setInteger("id", id).uniqueResult();
			//≥ı ºªØitem
			Hibernate.initialize(order.getItems());

			session.getTransaction().commit();
			
		}catch(Exception e){
			
			e.printStackTrace();
			
			session.getTransaction().rollback();
		}finally{
			
			session.close();
		}
		return order;
	}


	public void removeOrder(Order order) {
		Session session = null;
		
		try{
			session = HibernateUtil.getSession();
			
			session.getTransaction().begin();
			
			session.delete(order);
			
			session.getTransaction().commit();
			
		}catch(Exception e){
			
			e.printStackTrace();
			
			session.getTransaction().rollback();
		}finally{
			
			session.close();
		}

	}

}
