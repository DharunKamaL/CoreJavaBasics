package com.controlLoopSamples;

import java.util.Scanner;

public class IfElse 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the mark:");
		int testScore = input.nextInt();
		input.close();
//		int testScore = 76;
		char grade;
		if(testScore>=90)
			grade = 'A';
		else if(testScore>=80)
			grade = 'B';
		else if(testScore>=70)
			grade = 'C';
		else if(testScore>=60)
			grade = 'D';
		else
			grade = 'F';
		System.out.println("Grade "+grade);
	}
}
