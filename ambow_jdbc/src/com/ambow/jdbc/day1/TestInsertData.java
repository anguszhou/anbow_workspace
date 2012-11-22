package com.ambow.jdbc.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestInsertData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Connection conn = null;
		
		Statement st = null;
		
		try{
			//1：加载驱动
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2：获得连接
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", 
					"system", "123456");
			//3:create statement（创建statment）
			
			st = conn.createStatement();
			
			//4：执行sql语句
			
			String sql = "insert into ambow_test values(2,'allandou','8888')";
			
			int i = st.executeUpdate(sql);
			
			//5:有结果集的时候要处理结果集
			System.out.println(i+"条记录被影响");
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}finally{
			//6:关闭资源
			try {
				if (st != null)
					st.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				
			}
		}

	}

}
