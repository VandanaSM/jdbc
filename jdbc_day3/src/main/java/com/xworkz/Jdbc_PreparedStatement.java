package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc_PreparedStatement {

	public static void main(String[] args) {
		try(Connection con=DriverManager.getConnection(JdbcInfo_Util.URL, JdbcInfo_Util.USERNAME, JdbcInfo_Util.PASSWORD)){
//			PreparedStatement pstmt=con.prepareStatement("insert into xworkz.student values(?,?,?,?)");
//			pstmt.setInt(1, 5);
//			pstmt.setString(2, "Sana");
//			pstmt.setInt(3, 106);
//			pstmt.setString(4, "Rajajinagar");
//			int count=pstmt.executeUpdate();
			//System.out.println("----------count------------" +count);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}
