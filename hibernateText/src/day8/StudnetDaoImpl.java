package day8;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class StudnetDaoImpl implements IStudentDao
{
	private static SessionFactory  sf;
	
	static{
		
		sf=new Configuration().configure().buildSessionFactory();
	}

	/*
	 * 添加Student对象到数据库
	 * @see day8.IStudentDao#addStudent(day8.Student)
	 */
	public void addStudent(Student student)
	{
		Session ss=null;
		
		Transaction tran=null;
		
		try
		{
			ss=sf.openSession();
			
			tran=ss.beginTransaction();
			
			ss.save(student);
			
			tran.commit();
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
			tran.rollback();
			
		}finally
		{
			ss.close();
		}

	}

	/*
	 * 删除与Student对象匹配的记录
	 * @see day8.IStudentDao
	 */
	public void deleteStudent(Student student)
	{
		Session ss=null;
		
		Transaction tran=null;
		
		try
		{
			ss=sf.openSession();
			
			tran=ss.beginTransaction();
			
			ss.delete(student);
			
			tran.commit();
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
			tran.rollback();
			
		}finally
		{
			ss.close();
		}

	}

	/*
	 * 删除与所给id匹配的数据库记录
	 * @see day8.IStudentDao
	 */
	public void deleteStudentById(int id)
	{
		Session ss=null;
		
		Transaction tran=null;
		
		try
		{
			ss=sf.openSession();
			
			tran=ss.beginTransaction();
			
			String hql="delete from Student student where student.id=?"/*+id*/;
			
			Query query=ss.createQuery(hql);
			
			query.setInteger(0, id);
			
			
			query.executeUpdate();
			
			tran.commit();
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
			tran.rollback();
			
		}finally
		{
			ss.close();
		}

	}

	/*
	 * 找出表中所有记录
	 * @see day8.IStudentDao
	 */
	public List findAll()
	{
		Session ss=null;
		
		Transaction tran=null;
		
		List list=null;	
				
		try
		{
			ss=sf.openSession();
			
			String hql="from Student ";
			
			tran=ss.beginTransaction();
			
			Query query=ss.createQuery(hql);
			
			
			list=query.list();
			
			tran.commit();
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
			tran.rollback();
		} finally
		{
			ss.close();
		}
		
		return list;
	}

	/*
	 * 根据id找到表中匹配的记录
	 * @see day8.IStudentDao
	 */
	public Student findById(int id)
	{
		
        Session ss=null;
		
		Transaction tran=null;
		
		List list=null;	
		
		Student student=null;
		
				
		try
		{
			ss=sf.openSession();
			
			String hql="from Student where id="+id;
			
			tran=ss.beginTransaction();
			
			Query query=ss.createQuery(hql);
			
			list=query.list();
			
			tran.commit();
			
			if(list==null)
			{
				System.out.println("未在数据库中匹配到记录！");
			}
			else
			{
				for (Object object : list)
				{
					student=(Student)object;
					
					System.out.println("匹配到的数据是："+student);
										
				}
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
			
			tran.rollback();
		} finally
		{
			ss.close();
		}
		
		return student;
	}

	/*
	 * 根据名字和密码匹配表中的记录
	 * @see day8.IStudentDao
	 */
	public Student findByNameAndPassword(String name, String password)
	{
        Session ss=null;
		
		Transaction tran=null;
		
		List list=null;	
		
		Student student=null;
				
		try
		{
			ss=sf.openSession();
			
			String hql="from Student where name='"+name+"'and password='"+password+"'";
			
			tran=ss.beginTransaction();
			
			Query query=ss.createQuery(hql);
			
			list=query.list();
			
			tran.commit();
			
			if(list==null)
			{
				System.out.println("未在数据库中匹配到记录！");
			}
			else
			{
				for (Object object : list)
				{
					student=(Student)object;
					
					System.out.println("匹配到的数据是："+student);
										
				}
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
			
			tran.rollback();
		} finally
		{
			ss.close();
		}
		
		return null;
	}

	/*
	 * 更新表中的记录
	 * @see day8.IStudentDao
	 */
	public void updataStudent(Student student)
	{
		Session ss=null;
		
		Transaction tran=null;
		
		try
		{
			ss=sf.openSession();
			
			tran=ss.beginTransaction();
			
			ss.update(student);
			
			tran.commit();
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
			tran.rollback();
			
		}finally
		{
			ss.close();
		}
		
		
	}

}
