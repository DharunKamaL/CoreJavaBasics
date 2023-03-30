package com.oopsSample;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

	public static void main(String[] args) {
		Map<Integer, String> stud = new HashMap<>();
		stud.put(01, "Micheal");
		stud.put(02, "Raj");
		stud.put(03, "John");
		stud.put(04, "Robert");
		System.out.println("Students" + stud);
		System.out.println(stud.get(03));
		System.out.println(stud.keySet());
		System.out.println(stud.remove(03, "John"));
		System.out.println("After removing-->" + stud);
		stud.replace(04, "John");
		System.out.println("After replacing-->" + stud);
		System.out.println(stud.isEmpty());
		System.out.println(stud.entrySet());
		stud.clear();
		System.out.println("After clearing-->" + stud);
	}
}