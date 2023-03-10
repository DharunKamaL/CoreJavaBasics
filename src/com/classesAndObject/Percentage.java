package com.classesAndObject;

import java.text.NumberFormat;

public class Percentage 
{

	public static void main(String[] args)
	{
		
		Double percent = new Double (0.75);
		NumberFormat percentFormatter; 
		percentFormatter = NumberFormat.getPercentInstance(); 
		String percentout;
		percentout = percentFormatter.format(percent);
		System.out.println(percentout);
	}

}