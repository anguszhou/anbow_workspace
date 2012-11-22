package com.ambow.hibenate.m2m;

public class TestStudentDao {

	public static void main(String[] args) {
		
		StudentDao dao = new StudentDaoImpl();
		
/*		AmbowStudent student1 = new AmbowStudent();
		
		student1.setName("allandou");
		
		AmbowStudent student2 = new AmbowStudent();
		
		student2.setName("icexu");
		
		
		AmbowCourse course1 = new AmbowCourse();
		
		course1.setCname("corejava");
		
		AmbowCourse course2 = new AmbowCourse();
				
		course2.setCname("oracle");
				
		AmbowCourse course3 = new AmbowCourse();
				
		course3.setCname("spring");
				
		AmbowCourse course4 = new AmbowCourse();
				
		course4.setCname("ooad");
		
		dao.addCourse(course1);
		
		dao.addCourse(course2);
		
		dao.addCourse(course3);
		
		dao.addCourse(course4);
		
		dao.addStudent(student1);
		
		dao.addStudent(student2);*/
		
		dao.registerStudentCourse(39, 35);
		dao.registerStudentCourse(39, 36);
		dao.registerStudentCourse(40, 35);
		dao.registerStudentCourse(40, 38);
		
	}
		
}
