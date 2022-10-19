package com.xworkz.DAO;

public class HospitalDTO {

	private int id;
	private String patientName;
	private String gender;
	private int wardNo;
	private String patientContactNo;
	private String patientAddress;
	private String doctorName;
	private int patientAge;
	private String hospitalName;
	private String hospitalAddress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getWardNo() {
		return wardNo;
	}

	public void setWardNo(int wardNo) {
		this.wardNo = wardNo;
	}

	public String getPatientContactNo() {
		return patientContactNo;
	}

	public void setPatientContactNo(String patientContactNo) {
		this.patientContactNo = patientContactNo;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int age) {
		this.patientAge = age;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalAddress() {
		return hospitalAddress;
	}

	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

	@Override
	public String toString() {
		return "HospitalDTO [id=" + id + ", patientName=" + patientName + ", gender=" + gender + ", wardNo=" + wardNo
				+ ", patientContactNo=" + patientContactNo + ", patientAddress=" + patientAddress + ", doctorName="
				+ doctorName + ", patientAge=" + patientAge + ", hospitalName=" + hospitalName + ", hospitalAddress="
				+ hospitalAddress + "]";
	}

}
