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
		category.setName("计算机");
		category.setDescriptions("软件与程序设计相关");
		
		Product product = new Product();
		product.setId(6);
		product.setAuthor("夏昕 曹晓钢 唐勇");
		product.setBasePrice(59);
		product.setCategory(category);
		product.setDescriptions("本书由互联网上影响广泛的开放文档OpenDoc系列自由文献首份文档“Hibernate开发指南”发展而来。在编写过程中，进行了重新构思与组织，同时对内容的深度与广度进行了重点强化。本书从持久层入手，引出对象/关系数据库映射的由来，接下来聚焦于目前最完善、最强悍的ORM产品—— Hibernate。从一个基础程序入手，讲述Hibernate的基本语法与配置，慢慢升高到缓存、延迟加载等高级特性。本书内容深入浅出，先讲述持久层设计与ORM，再由Hibernate概述、Hibernate基础Hibernate高级特性顺序展开，直至Hibernate实战，重点讲述了 Hibernate的基础语法、基础配置、O/R映射、数据关联、数据检索、HQL实用技术、自定义持久化实现、Hibernate回调与拦截、 Hibernate分页等实用技术，Hibernate实战部分则用一个真实论坛的创建演示了Hibernate的强大功能。本书有丰富的附录部，在附录中讲述了Hibernate常用的映射配置，Hibernate工具、XDoclet模板配置以及Hibernate的益友iBatis用法，还以卡片的形式列出了本书中所用的工具及软件，附录最后一部分是“快速启动代码”，供读者对比与参考，也给初学者提供了一个快带起步的基础。本书适合于Hibernate的各个阶层的读者。");
		product.setImages("images/product/zcover6.gif");
		product.setName("深入浅出Hibernate");
		product.setPages(512);
		product.setPublish("电子工业出版社");
		
		Country c = new Country();
		c.setId(1);
		c.setName("中国");
		
		Province p = new Province();
		p.setId(10);
		p.setCountry(c);
		p.setName("湖北");
							
		ContcatInfo con = new ContcatInfo("15877480915","xi'an",c,"zhoucong07@qq","159","136",p,"xianning","dongdajie",user1,"710049");
							
		OrderLine orderline1= new OrderLine();
		orderline1.setId(1);
		orderline1.setAmount(123);
		orderline1.setProduct(product);
		Set orderlines = new HashSet();
		orderlines.add(orderline1);
									
		PayWay payway = new PayWay();
		payway.setId(2);
		payway.setPayStyle("网银付款");
		
		OrderStatus orderstatus = new OrderStatus();
		orderstatus.setId(2);
		orderstatus.setName("成功状态");
		orderstatus.setDescriptions("订单已经成功发送货物");
		
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
