package com.classesAndObject;

public class StringImmutableSample 
{

	public static void main(String[] args) 
	{
		String strOne = "Java";
		System.out.println("Address:"+strOne.hashCode());
		strOne.concat(" Programming");
		System.out.println("Before assigning:"+strOne);
		System.out.println("Address:"+strOne.hashCode());
		strOne = strOne.concat(" Programming");
		System.out.println("After assigning:"+strOne);
		System.out.println("Address:"+strOne.hashCode());
	}
}
