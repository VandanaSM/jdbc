package com.xworkz.image;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.imageio.IIOImage;

public class Image {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/xworkz";
		String userName="root";
		String password="Xworkzodc@123";
		String q="insert into images values(?,?)";
		try {
			Connection conn=DriverManager.getConnection(url, userName, password);
			PreparedStatement pstmt=conn.prepareStatement(q);
			FileInputStream file=new FileInputStream("img.jfif");
			pstmt.setInt(1, 1);
			pstmt.setBinaryStream(2, file, file.available());
			pstmt.executeUpdate();
			System.out.println("----done---------");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
