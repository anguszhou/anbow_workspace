package com.ambow.servlet.day3.mvc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.ambow.servlet.day3.mvc.Student;
import com.ambow.servlet.day3.mvc.dao.IStudentDao;
import com.ambow.servlet.day3.mvc.util.ConnectionFactory;

public class StudentDaoImpl implements IStudentDao {

	public List findAllStudents() {

		Connection conn = null;

		PreparedStatement pst = null;

		ResultSet rs = null;

		List studentList = new ArrayList();

		Student student = null;

		try {

			conn = ConnectionFactory.getConnection();

			String sql = "select * from student";

			pst = conn.prepareStatement(sql);

			rs = pst.executeQuery(sql);

			while (rs.next()) {

				student = new Student();

				student.setId(Integer.parseInt(rs.getString("id")));

				student.setName(rs.getString("name"));

				student.setPassword(rs.getString("password"));

				studentList.add(student);
			}

		} catch (Exception e) {

			e.printStackTrace();

			throw new RuntimeException("when query students error");

		} finally {

			ConnectionFactory.close(rs, pst, conn);
		}

		return studentList;
	}

}
