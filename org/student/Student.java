package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName()
	{
		System.out.println("Student Name is Tarun");
	}
	public void studentDept()
	{
		System.out.println("Student Department is CSIT");
	}
	public void studentId()
	{
		System.out.println("Student ID is Tarun12345");
	}
	
	public static void main(String[] args)
	{
		Student stud = new Student();
		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();
		stud.deptName();
		stud.studentName();
		stud.studentId();
		stud.studentDept();
	}
}
