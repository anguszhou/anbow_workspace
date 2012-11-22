package com.ambow.ects.dao;

import java.util.Collection;
import com.ambow.ecport.exception.ManagerProductException;
import com.ambow.ects.entity.Product;



public interface IProductDao {

	public  Product  findById(Integer  id )throws ManagerProductException;
	public  Collection   findAll( )throws ManagerProductException;
	
	//����Ϊ��ҳ�����Ľӿ�
	public  Collection   find(int start, int max)throws  ManagerProductException;
	public  int   getTotal()throws  ManagerProductException;
   
	//�˷������ڸ���������̬��ѯ��Ʒ��Ϣ
	public  Collection   find(Product product)throws ManagerProductException;

}