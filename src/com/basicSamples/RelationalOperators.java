package com.basicSamples;

public class RelationalOperators 
{

	public static void main(String[] args) 
	{
		int a = 7 ;
		int b = 11;
		
		System.out.println("a value is:"+a+" and b value is:"+b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(5 > 3 && 8 > 5);
		System.out.println(5 > 3 && 8 < 5);
		System.out.println(5 < 3 || 8 > 5);
		System.out.println(5 > 3 || 8 < 5);
		System.out.println(5 < 3 || 8 < 5);
		System.out.println(!(5==3));
		System.out.println(!(5>3));
	}
}