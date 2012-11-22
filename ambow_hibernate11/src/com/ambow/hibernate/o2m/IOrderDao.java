package com.ambow.hibernate.o2m;

public interface IOrderDao {

		void addOrder(Order order);
		
		Order  findById(int id);
		
		void removeOrder(Order order);
}
