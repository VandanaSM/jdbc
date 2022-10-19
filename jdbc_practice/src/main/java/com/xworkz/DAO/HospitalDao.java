package com.xworkz.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HospitalDao {


	Connection connection = JDBCConnectionUtil.getConnection();
	public void saveHospitalInfo() {
		
		HospitalDTO dto=new HospitalDTO();
		dto.setId(8799);
		dto.setPatientName("Manjunath");
		dto.setGender("Female");
		dto.setWardNo(12);
		dto.setPatientContactNo("890877654");
		dto.setPatientAddress("jayanagar");
		dto.setDoctorName("Dr Sana");
		dto.setPatientAge(36);
		dto.setHospitalName("CloudNine");
		dto.setHospitalAddress("Bangalore");
		

		String insertQuery = "insert into xworkz.hospital values(?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pstmt = connection.prepareStatement(insertQuery);
			pstmt.setInt(1, dto.getId()); // give these fields as
			pstmt.setString(2, dto.getPatientName());
			pstmt.setString(3, dto.getGender());
			pstmt.setInt(4, dto.getWardNo());
			pstmt.setString(5, dto.getPatientContactNo());
			pstmt.setString(6, dto.getPatientAddress());
			pstmt.setString(7, dto.getDoctorName());
			pstmt.setInt(8, dto.getPatientAge());
			pstmt.setString(9, dto.getHospitalName());
			pstmt.setString(10, dto.getHospitalAddress());

			int count = pstmt.executeUpdate();
			System.out.println("--------record inserted---------" + count);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  

	}  

	public void getHospitalInfo() {
		System.out.println("Start of getHospitalInfo");
		String sql = "SELECT * FROM hospital";
	
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
	    	ResultSet rs=statement.executeQuery();
			System.out.println("all patient details is as below : ");

			while (rs.next()) {
				HospitalDTO dto = new HospitalDTO();
				dto.setId(rs.getInt(1));
				dto.setPatientName(rs.getString(2));
				dto.setGender(rs.getString(3));
				dto.setWardNo(rs.getInt(4));
				dto.setPatientContactNo(rs.getString(5));
				dto.setPatientAddress(rs.getString(6));
				dto.setDoctorName(rs.getString(7));
				dto.setPatientAge(rs.getInt(8));
				dto.setHospitalName(rs.getString(9));
				dto.setHospitalAddress(rs.getString(10));
				
				
				System.out.println("-------------all data--------------"+dto.toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateHospitalInfo() {
		String sql = "UPDATE hospital SET patientContactNo=?, patientAddress=? WHERE id=?";
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, "7897897890");
			statement.setString(2, "Jayanagar");
			statement.setInt(3, 401);
			int updated = statement.executeUpdate();
			if (updated > 0) {
			    System.out.println("An existing user was updated successfully!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteHospitalInfo() {
		String sql = "DELETE FROM hospital WHERE id=?";
		try {
		PreparedStatement statement= connection.prepareStatement(sql);
		statement.setString(1, "bill");
		 
		int rowsDeleted = statement.executeUpdate();
		if (rowsDeleted > 0) {
		    System.out.println("A user was deleted successfully!");
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
