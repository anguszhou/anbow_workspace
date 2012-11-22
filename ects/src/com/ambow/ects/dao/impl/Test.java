package com.ambow.ects.dao.impl;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.ambow.ecport.exception.ManagerOrderException;
import com.ambow.ecport.exception.ManagerProductException;
import com.ambow.ecport.exception.ManagerUserException;
import com.ambow.ects.dao.IOrderDao;
import com.ambow.ects.dao.IProductDao;
import com.ambow.ects.dao.IUserDao;
import com.ambow.ects.entity.Category;
import com.ambow.ects.entity.ContcatInfo;
import com.ambow.ects.entity.Country;
import com.ambow.ects.entity.Order;
import com.ambow.ects.entity.OrderLine;
import com.ambow.ects.entity.OrderStatus;
import com.ambow.ects.entity.PayWay;
import com.ambow.ects.entity.Product;
import com.ambow.ects.entity.Province;
import com.ambow.ects.entity.User;
import com.ambow.ects.util.HibernateUtil;
import java.util.*;

public class Test
{	
	public static void main(String[] args)
	{
		IUserDao dao = new UserDaoImpl() ;
	
		//User user1 = new User(2,"nibingyu","zhou");
	
	
		
		/*Category category =new Category();
		category.setId(1);
		category.setName("�����");
		category.setDescriptions("��������������");
		
		Product product = new Product();
		product.setId(6);
		product.setAuthor("��� ������ ����");
		product.setBasePrice(59);
		product.setCategory(category);
		product.setDescriptions("�����ɻ�������Ӱ��㷺�Ŀ����ĵ�OpenDocϵ�����������׷��ĵ���Hibernate����ָ�ϡ���չ�������ڱ�д�����У����������¹�˼����֯��ͬʱ�����ݵ�������Ƚ������ص�ǿ��������ӳ־ò����֣���������/��ϵ���ݿ�ӳ����������������۽���Ŀǰ�����ơ���ǿ����ORM��Ʒ���� Hibernate����һ�������������֣�����Hibernate�Ļ����﷨�����ã��������ߵ����桢�ӳټ��صȸ߼����ԡ�������������ǳ�����Ƚ����־ò������ORM������Hibernate������Hibernate����Hibernate�߼�����˳��չ����ֱ��Hibernateʵս���ص㽲���� Hibernate�Ļ����﷨���������á�O/Rӳ�䡢���ݹ��������ݼ�����HQLʵ�ü������Զ���־û�ʵ�֡�Hibernate�ص������ء� Hibernate��ҳ��ʵ�ü�����Hibernateʵս��������һ����ʵ��̳�Ĵ�����ʾ��Hibernate��ǿ���ܡ������зḻ�ĸ�¼�����ڸ�¼�н�����Hibernate���õ�ӳ�����ã�Hibernate���ߡ�XDocletģ�������Լ�Hibernate������iBatis�÷������Կ�Ƭ����ʽ�г��˱��������õĹ��߼��������¼���һ�����ǡ������������롱�������߶Ա���ο���Ҳ����ѧ���ṩ��һ������𲽵Ļ����������ʺ���Hibernate�ĸ����ײ�Ķ��ߡ�");
		product.setImages("images/product/zcover6.gif");
		product.setName("����ǳ��Hibernate");
		product.setPages(512);
		product.setPublish("���ӹ�ҵ������");
		
		Country c = new Country();
		c.setId(1);
		c.setName("�й�");
		
		Province p = new Province();
		p.setId(10);
		p.setCountry(c);
		p.setName("����");
							
		ContcatInfo con = new ContcatInfo("15877480915","xi'an",c,"zhoucong07@qq","159","136",p,"xianning","dongdajie",user1,"710049");
							
		OrderLine orderline1= new OrderLine();
		orderline1.setId(1);
		orderline1.setAmount(123);
		orderline1.setProduct(product);
		Set orderlines = new HashSet();
		orderlines.add(orderline1);
									
		PayWay payway = new PayWay();
		payway.setId(2);
		payway.setPayStyle("��������");
		
		OrderStatus orderstatus = new OrderStatus();
		orderstatus.setId(2);
		orderstatus.setName("�ɹ�״̬");
		orderstatus.setDescriptions("�����Ѿ��ɹ����ͻ���");
		
		Order order = new Order();
		order.setCost(234234);
		order.setName("yelei");
		order.setOrderlines(orderlines);
		order.setPayWay(payway);
		order.setStatus(orderstatus);
		order.setUser(user1);
		
		try
		{
			dao.addOrder(order);
		}
		catch (ManagerOrderException e)
		{			
			e.printStackTrace();
		}*/
		
		/*Collection c = null;
    
		 try
		{
			c = dao.findAll();
		}
		catch (ManagerProductException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	
	Product o =null;
	for (Object object : c)
	{
		o = (Product)object;
		System.out.println(o);
	}*/
	
		
		/*	try
			{
				System.out.println(dao.getTotal());
			}
			catch (ManagerProductException e)
			{				
				e.printStackTrace();
			};*/
		
     /*    try
		{
	//		dao.update(user1);
		}
		catch (ManagerUserException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	
		
	}
		

}
