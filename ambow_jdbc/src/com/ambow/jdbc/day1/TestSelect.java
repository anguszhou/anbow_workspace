package com.ambow.jdbc.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ambow.jdbc.util.JDBCUtil;

public class TestSelect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Connection conn = null;
		
		Statement st = null;
		
		 ResultSet rs = null;
		
		try{
		/*	Class.forName("oracle.jdbc.driver.OracleDriver");
			//2���������
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", 
					"system", "123456");
			//3:create statement������statment��
*/			
			conn = JDBCUtil.getConnection();
			
			st = conn.createStatement();
			
			//4��ִ��sql���
			
			String sql = "select * from ambow_test";
			//5:��������
			rs = st.executeQuery(sql);
			
			while(rs.next()){
				
				/*System.out.println("id="+rs.getString("id"));
				System.out.println("name="+rs.getString("name"));
				System.out.println("password="+rs.getString("password"));*/
				//jdbc�����д�1��ʼ
				System.out.println("id="+rs.getString(1));
				System.out.println("name="+rs.getString(2));
				System.out.println("password="+rs.getString(3));
			
			}
		}catch(Exception e){
			
			
		}finally{
			
			try {
				if (rs != null)
					rs.close();
				if (st != null)
					st.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				
			}
			
		}

	}

}
