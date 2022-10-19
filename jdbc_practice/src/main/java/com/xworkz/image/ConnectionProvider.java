package com.xworkz.image;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {   //Singleton class with factory method(getConnection)

	private static Connection connection; 
	
	
	public static Connection getConnection() {
		
		if(connection==null) { //first checks if connection is present if not it will create connection else return connection object
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/xworkz","root", "Xworkzodc@123");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return connection;
	}
}
