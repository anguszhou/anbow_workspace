package day6;

import java.sql.*;

public class Update 
{

	public static void main(String[] args) 
	{
		Connection conn=null;
		
		Statement sql=null;
		
		ResultSet rs=null;
		
		try
		{
			Driver driver = new com.mysql.jdbc.Driver();
			
			conn=DriverManager.getConnection
			("jdbc:mysql://localhost:3306/ects", "root", "1234");
			
			sql=conn.createStatement();
			
			String str="update text set username='lili' where id=2";
			
			sql.executeUpdate(str);
			
			rs=sql.executeQuery("select * from text");
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}finally
		{
			
		
		}
	
      }
}
