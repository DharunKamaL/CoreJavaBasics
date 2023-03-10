package com.classesAndObject;

public class EncapsulatedKid 
{
	private String name;
	private int age;
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = (name.length()==0) ? "Noname": name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = (age > 1 && age < 13) ? age:2;
	}
}
