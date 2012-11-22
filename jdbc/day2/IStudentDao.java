package com.ambow.jdbc.day2;

import java.util.List;

public interface IStudentDao {
		
		/**
		 * 
		 * @param student
		 * insert data to db
		 */
		void addStudent(Student student);
		/**
		 * 
		 * @param student
		 * udapte data to db
		 */
		void updateStudent(Student student);
		/**
		 * 
		 * @param student
		 * delte data from db by id
		 */
		void deleteStudent(int id);
		/**
		 * 
		 * @param student
		 * @return Student
		 * find data from db by id
		 */
		Student findStudnetById(int id);
		/**
		 * 
		 * @param name age
		 * find data from db by name age
		 */
		Student findStudnetByNameAndAge(String name ,String age);
		
		/**
		 * 
		 * @param name age
		 * find all data from db
		 */
		List findAllStudents();
		
		
}
