package com.ambow.jdbc.day2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.ambow.jdbc.util.ConnectionFactory;

public class TestPre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

			Connection conn = null;
			
			PreparedStatement pst = null;
			
			try{
				
				conn = ConnectionFactory.getConnection();
				
				String sql = "insert into ambow_test values (?,?,?)";
				
				pst = conn.prepareStatement(sql);
				
				pst.setInt(1, 3);
				
				pst.setString(2, "testpre");
				
				pst.setString(3, "testpre");
				
				int i = pst.executeUpdate();
				
				System.out.println(i+"条记录被影响");
			}catch(Exception e){
				
				e.printStackTrace();
				
			}finally{
				
				ConnectionFactory.close(null, pst, conn);
			}

			
	}

}
