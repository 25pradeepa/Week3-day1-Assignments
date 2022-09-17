package org.bank;

public class Student {
public void getStudentInfo(int id, String Name)
{
	System.out.println("Student Id is  "+ id);
	System.out.println("Student Name is  "+ Name);
}
public void getStudentInfo(int id)
{
	System.out.println("Student new Id is  "+ id);
	
}
public void getStudentInfo(String mailid, int phnum)
{
	System.out.println("Student email Id is  "+ mailid);
	System.out.println("Student Phone Number is  "+ phnum);
}
public static void main(String[] args)
{
	Student det = new Student();
	det.getStudentInfo(23,"Tarun");
	det.getStudentInfo(11);
	det.getStudentInfo("tarun@gmail.com", 897632332);
}

}
