package com.ambow.jsp.day1.mvc.dao;

import java.util.List;

import com.ambow.jsp.day1.mvc.Student;

public interface IStudentDao {
	
		List findAllStudents();

		Student findByNameAndPassword(String name ,String password);
}
