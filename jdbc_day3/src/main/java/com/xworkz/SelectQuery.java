//WRITE A CLASS USING SELECT QUERY
package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306";
		String userName="root";
		String password="Xworkzodc@123";
		String selectSql="SELECT * FROM xworkz.employee";
		Connection con=null;
		
	    try {
			con=DriverManager.getConnection(url,userName,password);
			 Statement st=con.createStatement();
			 //STEP 4:ALWAYS USE EXECUTEQUERY FOR NON-DML QUERY(I.E., DQL- SELECT QUERY)
			 //executeQuery will return ResultSet interface
			 //ResultSet interface holds table data
			 //to check whether table holds record or not we use resultSet.next() will return true else false
			 //to get the column data we use resultSet.getX()(index number or column name);  X represent datatype
		     ResultSet resultSet= st.executeQuery(selectSql);
		     while(resultSet.next()){      //next() is boolean type which return true if records are present else return false
		    	System.out.print("ID:" + resultSet.getInt(1));  
		    	System.out.print("--- Name:" + resultSet.getString("name"));
		    	System.out.println();
		     }
		     
			    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
		
		
		
	}
}
