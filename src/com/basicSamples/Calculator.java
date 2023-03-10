package com.basicSamples;

public class Calculator 
{
	//instant variable
	int number;
	
	//class variable
	static int c;
	
	final double pi = 3.14;
	
	
	//a and b are parameters
	public void add(int a,int b)
	{
		//local variable
		a++;//evaluating and incrementing...
		++b;//incrementing and evaluating...
		int sum;
		sum = a+b;
		System.out.println("sum:"+sum);
	}
	public void area(double radius )
	{
//		pi = 5.23;(final keyword pi)-->it cannot be initialised again
		double area = pi*radius*radius;
	}

	public static void main(String[] args) 
	{
		Calculator Calcobj = new Calculator();
		Calcobj.add(10, 25);
		Calcobj.number = 10;
		c=15;
	}

}
