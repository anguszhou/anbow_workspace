package com.ambow.hibenate.m2m;

public interface StudentDao {

		void addCourse(AmbowCourse course);
		
		void addStudent(AmbowStudent student);
		
		void registerStudentCourse(int studentid ,int courseid);
}
