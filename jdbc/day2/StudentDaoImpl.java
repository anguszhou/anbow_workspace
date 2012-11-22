package com.ambow.jdbc.day2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ambow.jdbc.util.ConnectionFactory;

public class StudentDaoImpl implements IStudentDao {

	@Override
	public void addStudent(Student student) {

		Connection conn = null;
		
		PreparedStatement pst = null;
		
		try{
			
			conn = ConnectionFactory.getConnection();
			
			String sql = "insert into student values (?,?,?)";
			
			pst = conn.prepareStatement(sql);
			
			pst.setInt(1, student.getId());
			
			pst.setString(2, student.getName());
			
			pst.setInt(3, student.getAge());
			
			int i = pst.executeUpdate();
			
			System.out.println(i+"条记录被影响");
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}finally{
			
			ConnectionFactory.close(null, pst, conn);
		}


	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List findAllStudents() {
		
		List studentList = new ArrayList();
		
		Connection conn = null;
		
		PreparedStatement pst = null;
		
		ResultSet rs = null;
		
		Student student = null;
		
		try{
			
			conn = ConnectionFactory.getConnection();
			
			String sql = "select * from student";
			
			pst = conn.prepareStatement(sql);
	
			rs = pst.executeQuery();
			
			while(rs.next()){
				
				student = new Student();
				
				student.setId(Integer.parseInt(rs.getString("id")));
				
				student.setName(rs.getString("name"));
				
				student.setAge(Integer.parseInt(rs.getString("age")));
				
				studentList.add(student);
			}
	
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}finally{
			
			ConnectionFactory.close(rs, pst, conn);
		}

			return studentList;
	}

	@Override
	public Student findStudnetById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findStudnetByNameAndAge(String name ,String age){
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub

	}

}
