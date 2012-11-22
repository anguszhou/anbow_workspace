package com.ambow.ects.dao.impl;

import org.hibernate.Session;

import com.ambow.ecport.exception.ManagerUserException;
import com.ambow.ects.dao.IUserDao;
import com.ambow.ects.entity.User;
import com.ambow.ects.util.HibernateUtil;

public class UserDaoImpl implements IUserDao {

	public void add(User user) throws ManagerUserException {
		
		Session session=null;
		
		try{
			session=HibernateUtil.getSesstion();
			
			session.getTransaction().begin();
			
			session.save(user);
			
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

	public User findById(Integer id) throws ManagerUserException {

		Session session=null;
		
		User user = null;
		
		try{
			session=HibernateUtil.getSesstion();
			
			session.getTransaction().begin();
									
			user = (User)session.get(User.class, id);
			
			session.getTransaction().commit();
				    	  
		}catch(Exception e)
		{
			e.printStackTrace();
			
			session.getTransaction().rollback();
			
		}finally
		{
			session.close();
		}	
		return user;
	}

	public User login(String name, String passwd) throws ManagerUserException {
		
		Session session=null;
		
		User user = null;
		
		try{
			session=HibernateUtil.getSesstion();
			
			session.getTransaction().begin();
									
			String hql = "from User user where user.name =:name and user.passwd =:passwd";
			
			user = (User)session.createQuery(hql).setString("name", name).setString("passwd", passwd).uniqueResult();
			
			session.getTransaction().commit();
			
		 }catch(Exception e)
		{
			e.printStackTrace();
			
			session.getTransaction().rollback();
			
		}finally
		{
			session.close();
		}	
		
		if(user==null)
		{
			user.setId(null);
			user.setName("  ");
			user.setPasswd("  ");
			System.out.println("用户登录失败！");
			
			return user;
		}
		else
		{
			System.out.println("用户成功登录！");
			
			return user;
		}
}

     public void update(User user) throws ManagerUserException {
		
		Session session=null;
		
		try{
			session=HibernateUtil.getSesstion();
			
			session.getTransaction().begin();
			
			session.update(user);
			
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

}
