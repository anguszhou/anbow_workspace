package com.ambow.struts.dao;

import java.util.List;

import com.ambow.struts.pojo.Student;



public interface IStudentDao {
	
		List findAllStudents();

		Student findByNameAndPassword(String name ,String password);
}
