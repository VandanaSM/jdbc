//AUTOlOADING DRIVER CLASS IN JDBC 
package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AutoLoadingDriverClass {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306";
		String userName="root";
		String password="Xworkzodc@123";
		Connection conn=null;
		
		//STEP 1: JVM will look for file called java.sql.Driver inside META-INF in mysql jar
		
		try {
			conn = DriverManager.getConnection(url, userName, password);
			System.out.println("----------DB-----------" + conn.getMetaData().getDatabaseProductName());
			System.out.println("----------DB-----------" + conn.getMetaData().getDatabaseProductVersion());
			System.out.println(conn.getMetaData().getClass());
			//MetaData means to get information of tables
			//to get additional information about database then we use conn.getMetaData() method
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
	}
}
