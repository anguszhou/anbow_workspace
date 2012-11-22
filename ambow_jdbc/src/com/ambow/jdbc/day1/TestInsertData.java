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
			//1����������
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2���������
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", 
					"system", "123456");
			//3:create statement������statment��
			
			st = conn.createStatement();
			
			//4��ִ��sql���
			
			String sql = "insert into ambow_test values(2,'allandou','8888')";
			
			int i = st.executeUpdate(sql);
			
			//5:�н������ʱ��Ҫ��������
			System.out.println(i+"����¼��Ӱ��");
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}finally{
			//6:�ر���Դ
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
