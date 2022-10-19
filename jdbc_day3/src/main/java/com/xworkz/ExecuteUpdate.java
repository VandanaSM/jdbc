package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class ExecuteUpdate {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306";
		String userName="root";
		String password="Xworkzodc@123";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id");
		int empId=sc.nextInt();
		
		System.out.println("Enter the employee name");
		String empName=sc.next(); 
		String insertSQL=String.format("insert into xworkz.employee" + " values(%d,'%s')" + "" , empId,empName); //before values give space as syntax show space bet table name and values
		System.out.println(insertSQL);
		
		//try with resource -it will automatically close the Connection object
		try(Connection conn=DriverManager.getConnection(url, userName, password)) {  //convert compliance to java 1.7 as try with resource applicable from 1.7 version only
			Statement st=conn.createStatement();
			int val=st.executeUpdate(insertSQL);
			//int val=st.executeUpdate("INSERT INTO xworkz.employee(id,name)" + " values( "+empId+",'"+empName+"')");  --we donot use statement 
			//inteface as it shows data to the user so we use preparedStatement
			System.out.println("Successfully updated the Values into the table" +val);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	}
}
