package com.basicSamples;

import java.util.Scanner;

public class ConsoleInSample 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		int num = input.nextInt();
		System.out.println("Entered int value:"+num);
		
		System.out.println("Enter the float:");
		float myFloat = input.nextFloat();
		System.out.println("Entered float value:"+myFloat);
		
		System.out.println("Enter the String:");
		String myString = input.nextLine();
		System.out.println("Entered String value:"+myString);
		
		System.out.println("Enter the Double value:");
		double myDouble = input.nextDouble();
		System.out.println("Entered doubled value:"+myDouble);

		input.close();
	}

}
