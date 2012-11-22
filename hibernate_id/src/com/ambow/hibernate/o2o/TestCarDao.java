package com.ambow.hibernate.o2o;

public class TestCarDao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	/*		Car car = new Car();
			
			car.setName("qq");
			
			Engine engine = new Engine();
			
			engine.setNu(555);
			
			car.setEngine(engine);
			
			engine.setCar(car);*/
			
			ICarDao dao = new CarDaoImpl();
			
			//dao.addCar(car);
			
			Car car = dao.findById(6);
			
			System.out.println(car.getEngine());

	}

}
