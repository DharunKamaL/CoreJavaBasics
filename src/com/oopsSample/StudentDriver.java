package com.oopsSample;

import java.util.ArrayList;

public class StudentDriver
{

	public static void main(String[] args)
	{
		Student s1 = new PayingStudent("Peter",9.5f);
		Student s3 = new PayingStudent("Vicky", 8.7f);
		Student s2 = new CompanyStudent("John","Zuci");
		Student s4 = new CompanyStudent("Raj","Zuci");
		Student s5 = new AuditStudent("Karthik","auditorium");
		StudentList students = new StudentList();
		students.addStudents(s1);
		students.addStudents(s2);
		students.addStudents(s3);
		students.addStudents(s4);
		students.addStudents(s5);
		
		
//		System.out.println("Object of s5"+s5.toString());
		
		ArrayList<Student> studs = students.getStudents();
		for(Student stud:studs)
		{
			System.out.println(stud.toString());
			stud.goToClass();
			stud.printMarksheet();
		}
	}
}
