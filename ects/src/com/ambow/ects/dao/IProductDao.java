package com.ambow.ects.dao;

import java.util.Collection;

import com.ambow.ecport.exception.ManagerProductException;
import com.ambow.ects.entity.Product;



public interface IProductDao {

	public  Product  findById(Integer  id )throws ManagerProductException;
	public  Collection   findAll( )throws ManagerProductException;
	
	//以下为分页方法的接口
	public  Collection   find(int start, int max)throws  ManagerProductException;
	public  int   getTotal()throws  ManagerProductException;
   
	//此方法用于根据条件动态查询商品信息
	public  Collection   find(Product product)throws ManagerProductException;

}
