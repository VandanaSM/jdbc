package com.xworkz.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcApp {

	static final String USERNAME="root";  //IF USED FINAL VAR HAS TO BE IN UPPERCASE
	static final String PASSWORD="root";
	static final String URL="jdbc:mysql://localhost:3306"; //"jdbc:oracle://ip address or hostname:port"
	public static void main(String[] args) {
		System.out.println("Main method started");
		JdbcApp.createJdbc();
		System.out.println("main method ended");
	}
	
	public static void createJdbc() {
		//STEP 1:load vendor driver-mysql driver
		try {
			Class.forName("com.mysql.jdbc.Driver");  //we need mysql driver jar   --gives classnotfoundexception
			
		//STEP 2:create connection
			Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);  //Connection-java.sql (I)---gives sqlexception
		} catch (Exception e) {     //Exception has both classnotfound and sql exception 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} 
}


