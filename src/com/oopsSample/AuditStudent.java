package com.oopsSample;

public class AuditStudent extends Student implements PrintStudent
{
	String classLocation;
	public AuditStudent(String name,String classLocation)
	{
		this.name = name;
		this.classLocation = classLocation;
	}
	
	public void goToClass()
	{
		System.out.println("go to "+this.classLocation+" "+this.name);
	}
	public String toString()
	{
		String obj = "AuditStudent name is "+this.name;
		return obj;
	}
	public void printMarksheet()
	{
		System.out.println(this.name+" Marksheet "+this.classLocation);
	}
}
