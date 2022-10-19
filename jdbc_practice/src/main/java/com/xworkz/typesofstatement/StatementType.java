package com.xworkz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementType {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306";
		String username="root";
		String password="Xworkzodc@123";
		String selectsql="select name,relation from xworkz.familyinfo";
		Connection conn=null;
		try {
			 conn=DriverManager.getConnection(url, username, password);
			Statement st=conn.createStatement();
			/*st.execute("insert into xworkz.familyinfo values(1,'annu','mother')");  (OR)
			boolean value=st.execute("insert into xworkz.familyinfo values(3,'vatsu','bro')");
			System.out.println("--------data inserted succesfully--------" +value);  */
			
			/*st.execute("update xworkz.familyinfo set relation='bro' where id=3");  (OR) 
			int value=st.executeUpdate("update xworkz.familyinfo set relation='sis' where id=3");
			System.out.println("------DATA UPDATED-------" +value); */
			
			//st.execute("delete from xworkz.familyinfo where id=3");
			
	    /*	ResultSet rs=st.executeQuery("select * from xworkz.familyinfo");
			while(rs.next()) {
				System.out.println("id: "+ rs.getInt(1));
				System.out.println("name:" +rs.getString("name"));
				System.out.println("relation:" +rs.getString(3));
			} */
			
		/*	boolean rs=st.execute(selectsql);
			if(rs==true) {
				ResultSet res=st.getResultSet();
				while(res.next()) {
				//System.out.println("id: "+ res.getInt(1));
				System.out.println("name:" + res.getString("name"));
				System.out.println("relation:" + res.getString("relation"));
				}
			}else {
				System.out.println("---------dml query----------");
			}  */
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();       
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
