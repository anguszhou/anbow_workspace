package com.ambow.jdbc.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCUtil {

	
		public static Connection getConnection() throws Exception{
			//生成properties
	/*		Properties pro = new Properties();
			//load(InputStream)
			
			InputStream in = null;
			
			in = ClassLoader.getSystemResourceAsStream("dbinfo.properties");
			
			//inputstream 加载加配到properties
			
			pro.load(in);
			*/
			Connection conn = null;
			
			//Class.forName(pro.getProperty("db_driver"));
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2：获得连接
			//conn = DriverManager.getConnection(pro.getProperty("db_url"), 
			//		pro.getProperty("db_user"), pro.getProperty("db_password"));
			//3:create statement（创建statment）
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", 
					"system", "123456");
			return conn;
		}
		
		public static void main(String[] args) {
			try {
				
				System.out.println(JDBCUtil.getConnection());
			
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
		
}
