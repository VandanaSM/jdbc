 package com.xworkz.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.DAO.JDBCUtil;

public class JDBCConnectionUtil {

	private static Connection connection;
	private JDBCConnectionUtil(){
		
	}
	static {
		try {
			connection=DriverManager.getConnection(JDBCUtil.URL, JDBCUtil.USERNAME, JDBCUtil.PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return connection=(connection!=null)?connection:null;
		
	}
}
