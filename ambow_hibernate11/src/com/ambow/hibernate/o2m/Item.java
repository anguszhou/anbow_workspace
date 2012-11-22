package com.ambow.hibernate.o2m;

public class Item {

		private int id;
		
		private String product;
		
		private Order order;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getProduct() {
			return product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public Order getOrder() {
			return order;
		}

		public void setOrder(Order order) {
			this.order = order;
		}
}
