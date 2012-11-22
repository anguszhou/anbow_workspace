package day10;

import org.hibernate.Session;



import util.HibernateUtil;

public class ClassDaoImpl implements IClassDao
{

	public void addClass(Classes classid)
	{
		   Session ss=null;
		
		try
		{
			ss=HibernateUtil.getSesstion();
			
			ss.getTransaction().begin();
			
			ss.save(classid);
			
			ss.getTransaction().commit();
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
			ss.getTransaction().rollback();
			
		}finally
		{
			ss.close();
		}
	}

	public void deleteClass(Classes classid)
	{
		// TODO Auto-generated method stub

	}

	public Classes findById(int id)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public void addCourse(Course course)
	{
         Session session = null;
		
		try{
			session = HibernateUtil.getSesstion();
			
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

	public void addTeacher(Teacher teacher)
	{
        Session session = null;
		
		try{
			session = HibernateUtil.getSesstion();
			
			session.getTransaction().begin();
			
			session.save(teacher);
			
			session.getTransaction().commit();
			
		}catch(Exception e){
			
			e.printStackTrace();
			
			session.getTransaction().rollback();
		}finally{
			
			session.close();
		}
		
	}

	public void registerStudentCourse(int teacherid, int courseid)
	{
       Session session = null;
		
		Teacher teacher = null;
		
		Course course = null;
		try{
			session = HibernateUtil.getSesstion();
			
			session.getTransaction().begin();
			
			String hql ="from Teacher teacher left join fetch teacher.courses where teacher.id=:id";
			
			teacher= (Teacher)session.createQuery(hql).setInteger("id", teacherid).uniqueResult();
			
			hql = "from Course course left join fetch course.teachers where course.id=:id";
			
			course = (Course)session.createQuery(hql).setInteger("id", courseid).uniqueResult();

			teacher.getCourses().add(course);
			
			course.getTeachers().add(teacher);
			
			session.getTransaction().commit();
			
		}catch(Exception e){
			
			e.printStackTrace();
			
			session.getTransaction().rollback();
		}finally{
			
			session.close();
		}
		
		
	}

}
