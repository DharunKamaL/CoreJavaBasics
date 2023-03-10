package com.oopsSample;

public class PayingStudent extends Student implements  PrintStudent 
{
	boolean madePayment;
	
	public PayingStudent(String name, float gpa)
	{
		this.name = name;
		this.gpa = gpa;
	}
	public void goToClass()
	{
		System.out.println("PayingStudent goto next class "+this.name);
	}
	public String toString()
	{
		String obj = "PayingStudent name is "+this.name;
		return obj;
	}
//	public void CalculateGPA() //->cannot override the final method from student //
//	{
//		
//	}
	public void printMarksheet()
	{
		System.out.println(this.name+" Marksheet "+"PayingStudent");
	}
}
