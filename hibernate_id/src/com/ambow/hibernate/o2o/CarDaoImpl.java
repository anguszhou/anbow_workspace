package com.ambow.hibernate.o2o;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ambow.hibernate.day2.Student;
import com.ambow.hibernate.util.HibernateUtil;

public class CarDaoImpl implements ICarDao {

	
	public void addCar(Car car) {

			Session session = null;
			
			Transaction tran = null;
			
			try{
				
				session = HibernateUtil.getSession();
				
				tran = session.beginTransaction();
				
				session.save(car);
				
				tran.commit();
				
			}catch(Exception e){
				
				e.printStackTrace();
				
				tran.rollback();
			}finally{
				
				session.close();
			}
	}


	public Car findById(int id) {
		
		Car car = null;
		
		Session session = null;
		
		Transaction tran = null;
		
		try{
			//获得session
			session = HibernateUtil.getSession();
			
			//开始事务
			tran = session.beginTransaction();
		
			car = (Car) session.get(Car.class, id);
			
			tran.commit();
		}catch(Exception e){
			
			e.printStackTrace();
			
			tran.rollback();
			
		}finally{
			
			session.close();
		}
		return car;
	}
	}


