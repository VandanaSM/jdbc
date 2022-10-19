package com.xworkz.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionUtil {   //MADE CONNECTION AS COMMON CLASS TO USE IT COMMONLY FOR ALL THE CRUD OPERATIONS

	//private JDBCConnectionUtil connectionUtil;
	private static Connection connection;
	private JDBCConnectionUtil(){
		
	}
	static {
		try {
			//STEP 1:load and register driver auto loading
			//STEP 2:connection
			 connection=DriverManager.getConnection(JDBCUtil.URL, JDBCUtil.USERNAME, JDBCUtil.PASSWORD);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return connection=(connection!=null)?connection:null;  //check for connection null or not
		
	}
	
	
}
