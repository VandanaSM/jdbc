package com.xworkz.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.xworkz.DAO.JDBCConnectionUtil;

public class Student {

	Vandana_StudentDTO dto;
	static String collegeName = "AMC COLLEGE OF ENGINERRING";

	public void insertStudentInfo(Vandana_StudentDTO dto) {
		Connection connection = JDBCConnectionUtil.getConnection();

		try {
			PreparedStatement pstmt = connection.prepareStatement("insert into xworkz.student1 values(?,?,?,?,?)");
			pstmt.setInt(1, dto.getId());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getRollNo());
			pstmt.setInt(4, dto.getAge());
			pstmt.setInt(5, dto.getMarks());

			int count = pstmt.executeUpdate();
			System.out.println("--------record inserted---------" + count);
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
