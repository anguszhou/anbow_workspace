package com.ambow.hibernate.o2m;

public class TestOrderDao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

			IOrderDao dao = new OrderDaoImpl();
			/*
			Order order =  new Order();
			
			order.setName("xubin");
			
			Item item1 =  new Item();
			
			item1.setProduct("wife1");
			
			Item item2 =  new Item();
			
			item2.setProduct("gf");
			
			item1.setOrder(order);
			
			item2.setOrder(order);
			
			order.getItems().add(item1);
			
			order.getItems().add(item2);
			
			dao.addOrder(order);*/
			
			Order order = dao.findById(23);
			
			dao.removeOrder(order);
			
			

	}

}







