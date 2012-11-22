package com.ambow.struts.dao.impl;

import com.ambow.struts.dao.IStudentDao;
import com.ambow.struts.pojo.Student;




public class TestStudentDao {

		public static void main(String[] args) {
			
			IStudentDao dao = new StudentDaoImpl();
			
			/*List list = dao.findAllStudents();
			
			Iterator it = list.iterator();
			
			while(it.hasNext()){
				
				System.out.println(it.next());
			}*/
			
			Student student = dao.findByNameAndPassword("icexu", "444");
			
			System.out.println(student);
		}
}










