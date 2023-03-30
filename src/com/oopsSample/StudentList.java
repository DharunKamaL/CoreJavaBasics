package com.oopsSample;

import java.util.ArrayList;

public class StudentList {
	ArrayList<Student> studList;

	public StudentList() {
		System.out.println("Creating Students list...");
		studList = new ArrayList<>();
	}

	public void addStudents(Student student) {
		System.out.println("Add student to the list...");
		studList.add(student);
	}

	public ArrayList getStudents() {
		return studList;
	}
}
