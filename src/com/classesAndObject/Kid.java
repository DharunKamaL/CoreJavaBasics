package com.classesAndObject;

public class Kid 
{
	
    String name;
	int age;

	public Kid(String name, int age)
    {
    	this.name = name;
    	this.age = age;
    }
    
	public void play()
	{
		System.out.println(this.name+" is playing");
	}
}
