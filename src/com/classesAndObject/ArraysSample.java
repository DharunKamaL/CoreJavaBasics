package com.classesAndObject;

public class ArraysSample 
{

	public static void main(String[] args) 
	{
		int[] age = new int[5];
//		int[] age = {1, 2, 3, 4, 5};//We can also declare array like this...
		
		age[0] = 1;
		age[1] = 2;
	    age[2] = 3;
		age[3] = 4;
		age[4] = 5;
		
		System.out.println("Accessing with normal mode");
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		System.out.println(age[3]);
		System.out.println(age[4]);
		
		System.out.println("Accessing with for loop");
		for(int i=0;i<age.length;i++)
		{
			System.out.println(age[i]);
		}
		
		System.out.println("Accessing with enhanced for loop");
		for(int a:age)
		{
			System.out.println(a);
		}

	
		int sum = 0;
		float avg = 0f;
		for(int i=0;i<age.length;i++)
		{
			sum+=age[i];
		}
		System.out.println("Sum of an array:"+sum);
		avg = (sum/age.length);
		System.out.println("Average of an array:"+avg);
	}
}
