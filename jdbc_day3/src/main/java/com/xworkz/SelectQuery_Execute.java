package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery_Execute {
	
   public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306";
		String userName = "root";
		String password = "Xworkzodc@123";
		String selectSql = "SELECT Name,Address,RollNo from xworkz.student";
		Connection con = null;

			try {
				con = DriverManager.getConnection(url, userName, password);
				Statement st = con.createStatement();
				boolean res = st.execute(selectSql);
				System.out.println("----------BOOLEAN VALUE----------------");
				if(res==true) {
					ResultSet resultSet= st.getResultSet();
					while (resultSet.next()) {
						System.out.print("Name:" + resultSet.getString(1));  //getString("name" or 1)--index of resultset
						System.out.print("---Address:" +resultSet.getString("Address"));//column name
						System.out.print("---RollNo:" + resultSet.getInt(3));//column name
						System.out.println();
					}
				}else {
					System.out.println("-------------DML QUERY----------------");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
   }
}

/*Scanner sc =new Scanner(System.in);
 * string name=sc.nextLine();
 * ----
 * ---
 * 
 */
			

