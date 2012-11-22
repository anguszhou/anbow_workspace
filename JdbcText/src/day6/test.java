package day6;

import java.sql.*;

public class test {

	public static void main(String[] args) {
	
		Connection conn=null;
		
		Statement st=null;
		
		try		
		{
		//Class.forName("com.mysql.jdbc.Driver");
		
		Driver driver = new com.mysql.jdbc.Driver();
		
		conn=DriverManager.getConnection
		("jdbc:mysql://localhost:3306/ects", "root", "1234");
		
		st=conn.createStatement();
		
		String str="insert into text values(3,'yelei','2342')";
		
		int j=st.executeUpdate(str);
		
		System.out.println(j+"Ìõ¼ÇÂ¼");
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
}
}
