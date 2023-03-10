package com.classesAndObject;

public class StringSample 
{

	public static void main(String[] args) 
	{
		String first = "Java programming";
		String second = "Python programming";
		String third = "C # programming";
		

		String first1 = "java";
		String second1 = "PROGRAMMING";
		
		
		String[] word = first.split(" ");
		System.out.println(word[1]);
		
		boolean result1 = first.equals(second);
		System.out.println("String first and String second are equal:"+result1);
		
		boolean result2 = first.equals(third);
		System.out.println("String first and String third are equal:"+result2);

		System.out.println("String length for the first:"+first.length());
		
		String joinedString = first.concat(second);		
		System.out.println("joinedString:"+joinedString);
		
		String s1 = first1.toUpperCase();
		System.out.println(s1);
		
		String s2 = second1.toLowerCase();
		System.out.println(s2);
		
		
		String t1 = third.replace("#", "sharp");
		System.out.println(t1);
		
		char t2 = second.charAt(0);
		System.out.println(t2);
	}

	

}
