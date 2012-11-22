package com.ambow.hibernate.day2;

import java.util.List;

public interface IStudentDao {
	
		void addStudent(Student student);
		
		void updateStudent(Student student);
		
		void deleteStudent(Student student);
		
		List findAll();
		
		Student findByNameAndPassword(String name , String password);

		Student findById(int id);
}
