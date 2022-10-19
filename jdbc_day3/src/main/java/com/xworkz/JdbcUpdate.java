package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306";
		String userName="root";
		String password="Xworkzodc@123";
		Connection connection=null;
		try {
		//STEP 1:LOAD AND REGISTER DRIVER
			Class.forName("com.mysql.jdbc.Driver");//---its not required as it loads directly from vendor DB JAR(mysql.jar)
		//STEP 2:CREATE A CONNECTION
			 connection=DriverManager.getConnection(url, userName, password);
		//STEP 3:CREATE A STATEMENT
			Statement statement=connection.createStatement();
		//STEP 4:EXECUTE SQL QUERY
			//statement.execute("UPDATE xworkz.employee set name='Raja Rao' where id=120");	
			statement.execute("DELETE FROM xworkz.employee where id=122");   //statement is static sql query
			System.out.println("--------------record updated----------------");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
}
