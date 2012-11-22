package com.ambow.hibernate.o2m;

import java.util.HashSet;
import java.util.Set;

public class Order {

		private int id;
		
		private String name;
		
		private Set items =  new HashSet();

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Set getItems() {
			return items;
		}

		public void setItems(Set items) {
			this.items = items;
		}
}
