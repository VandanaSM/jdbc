package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDay3 {

	public static void main(String[] args) {
		//url to connect mysql database-
		//jdbc----->main protocol
		//mysql---->sub protocol
		//://localhost---->system name-if we are connecting remote system then in place of ://localhost we need to give IP address of the remote system
		//port---->mysql port number
		
		String url="jdbc:mysql://localhost:3306";   //"jdbc:oracle://ip address or hostname:port"
		String userName="root";                     //IF USED FINAL VAR HAS TO BE IN UPPERCASE
		String password="Xworkzodc@123";   //mysql password
		
	//JDBC STEPS
	//STEP 1:LOAD DRIVER AND REGISTER DRIVER
		
		try {
			Class.forName("com.mysql.jdbc.Driver");  //Driver present in jar,we need mysql driver jar   --gives classnotfoundexception
			//
			
	//STEP 2:TO CREATE CONNECTION
			//Connection-java.mysql (I)---gives sqlexception,DriverManager(Factory/helper Class) in java.mysql
			//getConnection -an overloaded method-it creates a connection type object only as it is factory methods
			//we have 3 overloaded methods :
			// 1.getConnection(String fullurl);
			// 2.getConnection(String url,String username,String password);
			// 3.getConnection(String url,Property props); 
			Connection con=DriverManager.getConnection(url, userName, password);
			System.out.println("con object-- "+con.getClass().getName());  
	//STEP 3:CREATE A STATEMENT
			 //Statement(I) in java.mysql package,createStatement(c), //createStatement(class)
			//it is used to create platform to communicate with a database using sql query
			Statement st=con.createStatement();   
	//STEP 4:EXECUTE A STATEMENT
			//execute just executes the sql query,execute only dml query
			st.execute("insert into xworkz.employee values(123,'Shri')");
	//STEP 5:CLOSING A Connection
			con.close();
		} catch (Exception e) { //Class.forname gives classNotFoundException and DriverManager.getConnection-sqlExceprion sobothunderException
			e.printStackTrace();
		}
		
		
	}
}
  