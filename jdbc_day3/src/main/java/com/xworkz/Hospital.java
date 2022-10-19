package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Hospital {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306";
		String userName="root";
		String password="Xworkzodc@123";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection(url, userName, password);
			PreparedStatement pstmt =connection.prepareStatement("insert into xworkz.hospital values(?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, 3);
			pstmt.setString(2,"Rama");
			pstmt.setString(3,"Gynecology");
			pstmt.setString(4,"Aishwarya");
			pstmt.setInt(5,8500);
			pstmt.setInt(6,8500);
			pstmt.setString(7,"8908890678");
			pstmt.setString(8,"Rajajinagar");
			pstmt.setInt(9,51);
			int count=pstmt.executeUpdate();
			System.out.println("------count--------" +count);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
