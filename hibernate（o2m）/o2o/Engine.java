package com.ambow.hibernate.o2o;

public class Engine {

		private int id;
		
		private int nu;
		
		private Car car;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

	

		public int getNu() {
			return nu;
		}

		public void setNu(int nu) {
			this.nu = nu;
		}

		public Car getCar() {
			return car;
		}

		public void setCar(Car car) {
			this.car = car;
		}
		
}
