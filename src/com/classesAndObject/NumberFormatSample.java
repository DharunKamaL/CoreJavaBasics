package com.classesAndObject;


import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatSample
{
	public static void main(String[] args) 
	{

		Double currency = new Double (9876543.21); 
		Locale currentLocale = Locale.US;
		NumberFormat currencyFormatter;  
		currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
		String currencyOut; 
		currencyOut = currencyFormatter.format(currency);
		System.out.println(currencyOut + " " +currentLocale);
	}
}