package com.ambow.hibernate.o2o;

public interface ICarDao {
	
			void addCar(Car car);

			Car findById(int id);
}
