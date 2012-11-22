package com.ambow.hibernate.day2;

import java.util.Iterator;
import java.util.List;

public class TestStudentDao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

			IStudentDao dao = new StudentDaoImpl();
			
			Student student = new Student();
			
			student.setName("allan");
			
			student.setPassword("16");
			
			dao.addStudent(student);
			
			/*List list = dao.findAll();
			
			Iterator it = list.iterator();
			
			while(it.hasNext()){
				
				System.out.println(it.next());
			}*/
			
		/*	Student student = dao.findByNameAndPassword("icexu", "4444");
			
			System.out.println(student);*/
			
			/*Student student = dao.findById(2);
			
			System.out.println(student);*/
			
	}

}






