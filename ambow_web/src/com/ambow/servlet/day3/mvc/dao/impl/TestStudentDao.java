package com.ambow.servlet.day3.mvc.dao.impl;

import java.util.Iterator;
import java.util.List;

import com.ambow.servlet.day3.mvc.dao.IStudentDao;

public class TestStudentDao {

		public static void main(String[] args) {
			
			IStudentDao dao = new StudentDaoImpl();
			
			List list = dao.findAllStudents();
			
			Iterator it = list.iterator();
			
			while(it.hasNext()){
				
				System.out.println(it.next());
			}
		}
}
