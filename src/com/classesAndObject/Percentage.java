package com.classesAndObject;

import java.text.NumberFormat;

public class Percentage {
	
	static void percentFormat(double n) {
		Double percent = new Double(n);
		NumberFormat percentFormatter = NumberFormat.getPercentInstance();
		String percentout = percentFormatter.format(percent);
		System.out.println(percentout);
	}
	
	public static void main(String[] args) {
		percentFormat(0.75);
	}
}