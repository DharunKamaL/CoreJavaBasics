package com.oopsSample;

import java.util.HashSet;
import java.util.*;

public class SetSample 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> evenNumber = new HashSet<>();
		evenNumber.add(4);
		evenNumber.add(2);
		evenNumber.add(8);
		evenNumber.add(6);
		evenNumber.add(8);
		
		System.out.println("HashSet:"+evenNumber);
		
		Iterator<Integer> iterate = evenNumber.iterator();
		while(iterate.hasNext())
		{
			System.out.print(iterate.next());
			System.out.print(" ");
		}
		
		TreeSet<String> empList1 = new TreeSet<>();
		empList1.add("john");
		empList1.add("peter");
		empList1.add("andrew");
		System.out.println("\nList of employees(TreeSet):"+empList1);
		
		
		HashSet<String> empList = new HashSet<>();
		empList.add("john");
		empList.add("peter");
		empList.add("andrew");
		System.out.println("List of employees(HashSet):"+empList);
	}
}
