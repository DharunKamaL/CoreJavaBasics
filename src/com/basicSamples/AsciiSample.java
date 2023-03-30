package com.basicSamples;

import java.util.Scanner;

public class AsciiSample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a2 = input.nextLine();
		input.close();
		char a = a2.charAt(0);
		int a1 = a;
		System.out.println("ASCII:" + a1);

	}

}
