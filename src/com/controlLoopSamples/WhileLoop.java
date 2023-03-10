package com.controlLoopSamples;

import java.util.Scanner;

public class WhileLoop 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = input.nextInt();
		int sum =0;
		while(n>=0)
		{
			sum +=n;
			System.out.println("Enter the number:");
			n = input.nextInt();		
		}
		System.out.println("Sum: "+sum);
		input.close();
	}
}
