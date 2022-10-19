package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.time.Instant;

public class insert_PreparedStatement {

	public static void main(String[] args) {
		insert_PreparedStatement.preparedStatement();
		insert_PreparedStatement.statement();
		
	}
	
    static void preparedStatement() {
    	String url="jdbc:mysql://localhost:3306";
		String userName="root";
		String password="Xworkzodc@123";
		String insertSQL=String.format("insert into xworkz.employee values(?,?)"); 
		System.out.println(insertSQL);
		
		try(Connection conn=DriverManager.getConnection(url, userName, password)) {  
			PreparedStatement pstmt=conn.prepareStatement(insertSQL);
			pstmt.setInt(1, 129);
			pstmt.setString(2, "Vishwa");
			Instant startTime=Instant.now();
			System.out.println("------------START TIME--------------" +startTime);
			Instant endTime=Instant.now();
			System.out.println("------------END TIME------------------------"+endTime);
			int val=pstmt.executeUpdate();
			System.out.println("Successfully updated the Values into the table" +val);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
    
    static void statement() {
    	String url="jdbc:mysql://localhost:3306";
		String userName="root";
		String password="Xworkzodc@123";
		String insertSQL=String.format("insert into xworkz.employee values(130,'Somu')"); 
		System.out.println(insertSQL);
		
		try(Connection conn=DriverManager.getConnection(url, userName, password)) {  
			Statement st=conn.createStatement();
			Instant startTime=Instant.now();
			System.out.println("------------START TIME--------------"+startTime);
			Instant endTime=Instant.now();
			System.out.println("------------END TIME------------------------"+endTime);
			int val=st.executeUpdate(insertSQL);
			System.out.println("Successfully updated the Values into the table" +val);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
    }
}
