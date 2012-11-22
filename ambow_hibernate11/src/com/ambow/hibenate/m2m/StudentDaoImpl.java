package com.ambow.hibenate.m2m;

import org.hibernate.Session;

import com.ambow.hibernate.util.HibernateUtil;

public class StudentDaoImpl implements StudentDao{


	public void addCourse(AmbowCourse course) {
	Session session = null;
		
		try{
			session = HibernateUtil.getSession();
			
			session.getTransaction().begin();
			
			session.save(course);
			
			session.getTransaction().commit();
			
		}catch(Exception e){
			
			e.printStackTrace();
			
			session.getTransaction().rollback();
		}finally{
			
			session.close();
		}
		
	}


	public void addStudent(AmbowStudent student) {
	Session session = null;
		
		try{
			session = HibernateUtil.getSession();
			
			session.getTransaction().begin();
			
			session.save(student);
			
			session.getTransaction().commit();
			
		}catch(Exception e){
			
			e.printStackTrace();
			
			session.getTransaction().rollback();
		}finally{
			
			session.close();
		}
		
	}


	public void registerStudentCourse(int studentid, int courseid) {
		
		Session session = null;
		
		AmbowStudent student = null;
		
		AmbowCourse course = null;
		try{
			session = HibernateUtil.getSession();
			
			session.getTransaction().begin();
			
			String hql ="from AmbowStudent student left join fetch student.courses where student.id=:id";
			
			student = (AmbowStudent)session.createQuery(hql).setInteger("id", studentid).uniqueResult();
			
			hql = "from AmbowCourse course left join fetch course.students where course.id=:id";
			
			course = (AmbowCourse)session.createQuery(hql).setInteger("id", courseid).uniqueResult();

			student.getCourses().add(course);
			
			course.getStudents().add(student);
			
			session.getTransaction().commit();
			
		}catch(Exception e){
			
			e.printStackTrace();
			
			session.getTransaction().rollback();
		}finally{
			
			session.close();
		}
		
		
	}

}
