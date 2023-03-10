package com.oopsSample;

public class CompanyStudent extends Student implements PrintStudent
{
	String companyName;
	public CompanyStudent(String name, String companyName)
	{
		this.name = name;
		this.companyName = companyName;
	}
	public void goToClass()
	{
		System.out.println("goto class after evaluation "+ this.name);
	}
	public String toString()
	{
		String obj = "CompanyStudent name is "+this.name;
		return obj;
	}
	public void printMarksheet()
	{
		System.out.println(this.name+" Marksheet "+this.companyName);
	}
}
