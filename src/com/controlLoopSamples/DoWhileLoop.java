package com.controlLoopSamples;

import java.util.Scanner;

public class DoWhileLoop
{
	public static void main(String[] args)
	{
		
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no:");
		int n = input.nextInt();
		do 
		{
			sum +=n;
			System.out.println("enter the no:");
			n = input.nextInt();
		}
		while(n>=0);
		System.out.println("Sum:"+sum);
		input.close();
	}
}
