package com.basicSamples;

import java.util.Scanner;

public class Sample {

	static void convertTime() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the time:");
		int tym = input.nextInt();
		System.out.println("Enter the AM (OR) PM:");
		String amOrpm = input.next();
		if (amOrpm.equalsIgnoreCase("am")) {
			if (tym == 12) {
				System.out.println("0:00");
			} else {
				for (int i = 1; i <= 11; i++) {
					if (tym == i) {
						System.out.println(i);
					}
				}
			}
		} else if (amOrpm.equalsIgnoreCase("pm")) {
			if (tym == 12) {
				System.out.println("12:00");
			} else {
				int count = 12;
				for (int i = 1; i <= 11; i++) {
					count++;
					if (tym == i) {
						System.out.println(count);
					}
				}
			}
		}
		input.close();
	}

	public static void main(String[] args) {
		convertTime();
	}
}