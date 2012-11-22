package com.ambow.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {
		
		private static String  DB_URL;
		
		private static String  DB_USER;
		
		private static String  DB_DRIVER;
		
		private static String  DB_PWD;
		//静态代码块给变量赋值
		static{
			
			DB_URL = DBConfig.getInstance().getValue("db_url");
			
			DB_DRIVER = DBConfig.getInstance().getValue("db_driver");
			
			DB_USER = DBConfig.getInstance().getValue("db_user");
			
			DB_PWD = DBConfig.getInstance().getValue("db_password");
			
		}
		public static Connection getConnection() throws Exception{
			
			Class.forName(DB_DRIVER);
			
			return DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);
		}
		
	public static  void close(ResultSet rs ,Statement st, Connection conn){
			
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
		
	public static  void close(Object obj){
	
			try {
				if (obj instanceof ResultSet) {
					((ResultSet) obj).close();

				}
				if (obj instanceof Statement) {
					((Statement) obj).close();

				}
				if (obj instanceof Connection) {
					((Connection) obj).close();

				}
			} catch (Exception e) {

					e.printStackTrace();
			}
	
	}
		public static void main(String[] args) {
			
			try {
				System.out.println(ConnectionFactory.getConnection());
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}

}





