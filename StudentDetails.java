package com.elc.exa;

public class StudentDetails {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.setStudentDetails("ABC",101,85.5);
		String res = stu.getStudentDetails();
		System.out.println(res);
	}
	

}
