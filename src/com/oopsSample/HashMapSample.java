package com.oopsSample;

import java.util.HashMap;


public class HashMapSample
{

	public static void main(String[] args) 
	{
		HashMap<Integer,String> stud = new HashMap<>();
		
		stud.put(01,"Micheal");
		stud.put(02, "Raj");
		stud.put(03, "John");
		stud.put(04, "Robert");
		System.out.println("Students"+stud);
		
		System.out.println(stud.get(03));
		System.out.println(stud.keySet());
		
	}

}
