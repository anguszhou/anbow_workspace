package day9;

import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class MaleDaoImpl implements IMaleDao
{

	public void addMale(Male male)
	{
		Session ss=null;
		
		Transaction tran=null;
		
		try
		{
			ss=HibernateUtil.getSesstion();
			
			tran=ss.beginTransaction();
									
			ss.save(male);
								
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

	public Male fingById(int i)
	{
		Session ss=null;
		
		Transaction tran=null;
		
		Male male=null;
		
		try
		{
			ss=HibernateUtil.getSesstion();
			
			tran=ss.beginTransaction();
			
		    male=(Male) ss.get(Male.class, i);
		    
			tran.commit();
		    
		}catch(Exception e)
		{
			e.printStackTrace();
			
			tran.rollback();
			
		}finally
		{
			ss.close();
		}
		return male;
	}

	public void deleteMaleById(int i)
	{
        Session ss=null;
		
		Transaction tran=null;
		
		Male male=null;
		
		try
		{
			ss=HibernateUtil.getSesstion();
			
			tran=ss.beginTransaction();
			
		    male=(Male) ss.get(Male.class, i);
		    
		    ss.delete(male);
		    
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
