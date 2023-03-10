package com.basicSamples;

public class OperatorsSample 
{

	public static void main(String[] args) 
	{
		int ac=4;
		int var;
		
		var = ac;
		System.out.println("using (=) :"+var);
		
		var+=ac;
		System.out.println("using (+=) :"+var);
		
		var*=ac;
		System.out.println("using (*=) :"+var);
		
		var/=ac;
		System.out.println("using (/=) :"+var);
	}
}
