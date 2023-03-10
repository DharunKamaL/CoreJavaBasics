package com.oopsSample;

public abstract class Student 
{
	String name;
	String address;
	float gpa;
	
//	public Student(String name)
//	{
//		this.name = name;
//	}
//	
//	public Student(String name, float gpa)
//	{
//		this.name = name;
//		this.gpa = gpa;
//	}
	
	public Student()
	{
		
	}
	public final void CalculateGPA()
	{
		System.out.println("CalculateGPA");
	}
	public abstract void goToClass();
/* 
	abstract is keyword which we can make as a declaration,insisting our subclasses
	to implement some operations...
*/
	public void printMarksheet()
	{
		
	}
	
}
