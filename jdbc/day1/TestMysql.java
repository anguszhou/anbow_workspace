package com.ambow.jdbc.day1;

import java.sql.*;

public class TestMysql {

	public static void main(String[] args) {

		try {

			//1:加载mysql的驱动
			//Class.forName("com.mysql.jdbc.Driver");
			//2:获得连接
			//Driver driver = new com.mysql.jdbc.Driver();

			//DriverManager.registerDriver(driver);

			/*Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/ects", "root", "1234");*/
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection
			("jdbc:oracle:thin:@127.0.0.1:1521:XE", 
					"system", "123456");
			
			System.out.println("conn=========>" + conn);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
