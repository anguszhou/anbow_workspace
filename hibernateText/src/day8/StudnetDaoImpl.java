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
	 * ���Student�������ݿ�
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
	 * ɾ����Student����ƥ��ļ�¼
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
	 * ɾ��������idƥ������ݿ��¼
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
	 * �ҳ��������м�¼
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
	 * ����id�ҵ�����ƥ��ļ�¼
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
				System.out.println("δ�����ݿ���ƥ�䵽��¼��");
			}
			else
			{
				for (Object object : list)
				{
					student=(Student)object;
					
					System.out.println("ƥ�䵽�������ǣ�"+student);
										
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
	 * �������ֺ�����ƥ����еļ�¼
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
				System.out.println("δ�����ݿ���ƥ�䵽��¼��");
			}
			else
			{
				for (Object object : list)
				{
					student=(Student)object;
					
					System.out.println("ƥ�䵽�������ǣ�"+student);
										
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
	 * ���±��еļ�¼
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
