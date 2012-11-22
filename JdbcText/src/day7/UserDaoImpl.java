package day7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import jdbc.util.ConnectionFactory;




public class UserDaoImpl implements IUserDao
{

	public void addUser(User user)
	{
		
      Connection conn=null;
      
      PreparedStatement pst=null;
      
      try
      {
    	 
    	  conn=ConnectionFactory.getConnection();
    	  System.out.println("..234234..");
    	  String sql="insert into text values(?,?,?)";
    	  
    	  pst=conn.prepareStatement(sql);
    	  
    	  pst.setInt(1, user.getId());
    	 
    	  pst.setString(2,user.getUsername());
    	  
    	  pst.setString(3, user.getPassword());
    	  
    	  int i=pst.executeUpdate();
    	  
    	 
    	  
    	  System.out.println(i+"条记录被影响");
    	  
      }catch(Exception e)
      {
    	  
      }finally
      {
    	  ConnectionFactory.close(null, pst, conn);
      }
	}

	
	public void updateStudent(User user)
	{
		
		
	}


	

}
