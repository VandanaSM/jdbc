package com.xworkz.DAO;

public class TestMain {

	public static void main(String[] args) {
		
		HospitalDao dao= new HospitalDao();
		//dao.saveHospitalInfo();
		dao.getHospitalInfo();
		dao.updateHospitalInfo();
		dao.deleteHospitalInfo();
		
	}
}
