package com.ambow.jdbc.day2;

import java.util.Iterator;
import java.util.List;

public class TestStudentDao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Student student = new Student(2,"allandou",18);
		
		IStudentDao dao = new StudentDaoImpl();
		
		//dao.addStudent(student);
		
		List studentList = dao.findAllStudents();
		
		Iterator it = studentList.iterator();
		
		while(it.hasNext()){
			
			System.out.println(it.next());
		}

	}

}
