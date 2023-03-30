package com.oopsSample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayListHashMapHashSet {

	public static void main(String[] args) {
//		Student stud2 = new Student();
		ArrayList<Student> stud = new ArrayList<>();
		Student s1 = new PayingStudent("John", 9.5f);
		Student s2 = new CompanyStudent("Raj", "Zuci");
		Student s3 = new PayingStudent("Micheal", 8.7f);
		Student s4 = new CompanyStudent("Robert", "Zuci");
		Student s5 = new PayingStudent("tamil", 7.9f);

		stud.add(s1);
		stud.add(s2);
		stud.add(s3);
		stud.add(s4);
		stud.add(s5);
		stud.remove(1);

//		for(Student s:stud)
//		{
//			System.out.println(s);
//		}

		System.out.println("ArrayList:" + stud);

		HashMap<Integer, Student> stud1 = new HashMap<>();
		stud1.put(01, s1);
		stud1.put(02, s2);
		stud1.put(03, s3);
		stud1.put(04, s4);
		stud1.put(05, s5);

//		for(Student c:stud1)-->Does not iterate over HashMap, only iterate over array...
//		{
//			System.out.println(c);
//		}

		System.out.println("HashMap:" + stud1);
		System.out.println("KeySet:" + stud1.keySet());

		HashSet<Student> stud2 = new HashSet<>();
		stud2.add(s1);
		stud2.add(s2);
		stud2.add(s3);
		stud2.add(s4);
		stud2.add(s5);

		System.out.println("HashSet:" + stud2);

	}
}
