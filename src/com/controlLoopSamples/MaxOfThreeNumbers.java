package com.controlLoopSamples;

public class MaxOfThreeNumbers 
{
	
	static void maxOfThreeNum() {
		int a = 23;
		int b = 34;
		int c = 54;
		if(a>b && a>c)
			System.out.println("a is largest");
		else if(b>a && b>c)
			System.out.println("b is largest");
		else
			System.out.println("c is largest");
	}
	
	
	
	public static void main(String[] args) 
	{
		maxOfThreeNum();
	}

	

}
