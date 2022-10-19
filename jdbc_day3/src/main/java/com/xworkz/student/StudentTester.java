package com.xworkz.student;

public class StudentTester {

	public static void main(String[] args) {
		
		Student stu =new Student();

		Vandana_StudentDTO dto=new Vandana_StudentDTO();
		dto.setId(101);
		dto.setName("Shreya");
		dto.setRollNo("AMC20140025");
		dto.setAge(20);
		dto.setMarks(450);

		stu.insertStudentInfo(dto);
	}
}
