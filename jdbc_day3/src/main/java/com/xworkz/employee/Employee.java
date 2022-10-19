package com.xworkz.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Employee {

	Vandana_EmployeeDTO dto;
	static String companyName="TCS";
	
	public void insertEmployeeDetails(Vandana_EmployeeDTO emp) {
		Connection connection=JDBCConnectionUtil.getConnection();
		
		try {
			PreparedStatement pstmt=connection.prepareStatement("insert into xworkz.employee1 values(?,?,?,?,?)");
		    pstmt.setInt(1, emp.getId());
		    pstmt.setString(2, emp.getEmployeename());
		    pstmt.setString(3, emp.getEmployeeId());
		    pstmt.setDouble(4, emp.getSalary());
		    pstmt.setString(5, emp.getDesignation());
		    
		    int count=pstmt.executeUpdate();
		    System.out.println("-------------record updated--------------" +count);
		    connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
