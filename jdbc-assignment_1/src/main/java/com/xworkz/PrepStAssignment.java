package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepStAssignment {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/xworkz";
		String userName="root";
		String password="Xworkzodc@123";
		Connection conn=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		    conn=DriverManager.getConnection(url, userName, password);
			PreparedStatement pst=conn.prepareStatement("INSERT INTO employee values(?,?)");
			pst.setInt(1,122);
			pst.setString(2,"Sri");
			pst.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
}
