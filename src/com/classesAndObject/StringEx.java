package com.classesAndObject;

import java.util.Arrays;
import java.util.Scanner;

public class StringEx 
{

	public static void main(String[] args)
	{
		System.out.println("Problem1:");
		String hi = "Hi, ";
		String mom = "mom.";
		String joined = hi+mom;
		System.out.println(joined);
		
		String join = hi.concat(mom);
		System.out.println(join);
		
		System.out.println("Problem2:");
		String name = "Dharun Kumar C";
		String[] words = name.split(" ");
//		String j = "";
		for(int i=0;i<words.length;i++) 
		{
			System.out.print(words[i].charAt(0));	
		}
//		System.out.println(j);
		
		System.out.println("\nProblem3:");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first name:");
		String name1 = input.nextLine();
		System.out.println("Enter the second name:");
		String name2 = input.nextLine();
		input.close();
		int temp = 0;
		
		name1 = name1.toLowerCase().replace(" ", "");
		name2 = name2.toLowerCase().replace(" ", "");
		char[] n1 = name1.toCharArray();
		char[] n2 = name2.toCharArray();
		Arrays.sort(n1);
		Arrays.sort(n2);
		if(name1.length()!=name2.length())
			System.out.println("Not an anagram");
		else
		{
			for(int i=0;i<name1.length();i++)
			{
				if(n1[i]==n2[i])
				{
					temp++;
				}
			}
		}
		if(temp>0)
			System.out.println("Anagram");
		else
			System.out.println("Not an anagram");
	}
}