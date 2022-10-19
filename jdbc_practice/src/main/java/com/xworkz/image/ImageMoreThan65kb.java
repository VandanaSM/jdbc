package com.xworkz.image;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ImageMoreThan65kb  {

	public static void main(String[] args) {
		Connection c=ConnectionProvider.getConnection();
		String q="insert into images (id,name) values (?,?)";
		try {
			PreparedStatement pstmt=c.prepareStatement(q);
			//provide Dialogue box to choose file-JFilechooser
			JFileChooser jfc=new JFileChooser();
			jfc.showOpenDialog(null);  //null-at entry itself dialog box visible 
			File file=jfc.getSelectedFile(); //to get selected file -getselectedfile()
			FileInputStream fis=new FileInputStream(file);  //give file to fis 
			pstmt.setInt(1, 1);
			pstmt.setBinaryStream(2, fis, fis.available());  
			pstmt.executeUpdate();  //insert so data got so use update 
			JOptionPane.showMessageDialog(null, "success");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
