package com.controlLoopSamples;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no:");
		int n = input.nextInt();
		input.close();
		int a = -1;
		int b = 1;
		int c;
		for(int i = 0;i<n;i++)
		{
			c = a+b;
			a = b;
			b = c;
			System.out.print(c);
		}
	}
}
