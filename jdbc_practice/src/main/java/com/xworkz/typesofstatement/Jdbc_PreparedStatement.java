package com.xworkz.typesofstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc_PreparedStatement {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/xworkz";
		String username="root";
		String password="Xworkzodc@123";
		String q="Update familyinfo set relation=? where id=?";
		String getResult="select * from familyinfo ";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection(url, username, password);
	  /*	PreparedStatement pstmt=connection.prepareStatement("insert into familyinfo (id,name,relation) values (?,?,?)");
			pstmt.setInt(1, 4);
			pstmt.setString(2, "om");
			pstmt.setString(3, "bro");
			boolean count=pstmt.execute();
			System.out.println("--------count-------" +count);  
			
			pstmt.setInt(1, 5);
			pstmt.setString(2, "Sharanayya");
			pstmt.setString(3, "tata");
			boolean count=pstmt.execute();
			System.out.println("--------count-------" +count); 
			
			PreparedStatement pstmt=connection.prepareStatement(q);
			pstmt.setString(1,"brother");
			pstmt.setInt(2, 4);
			int count =pstmt.executeUpdate();
			System.out.println("-------count-------" +count); */
			
			PreparedStatement pstmt=connection.prepareStatement(getResult);
			ResultSet rs=pstmt.executeQuery();
			while (rs.next()) {
				System.out.print("id : " +rs.getInt(1));
				System.out.print("  name :" +rs.getString(2));
				System.out.print("  relation : " +rs.getString(3));
				System.out.println();
				
			}
			System.out.println("the data is as above");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}
}
