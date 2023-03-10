package com.controlLoopSamples;

public class Switch 
{
	public static void main(String[] args) 
	{
		int month = 12;
		int year = 2000;
		int numDays = 0;
		
		switch(month)
		{
		case 1:
			System.out.println("Jan Month");
			break;
		case 2:
			if((year%4 == 0) && !(year==100) || (year%400==0))
				numDays = 29;
			else 
				numDays =28;
			break;
		case 3:
			System.out.println("Mar Month");
			break;
		case 4:
			System.out.println("Apr Month");
			break;
		case 5:
			System.out.println("May Month");
		 	break;
		case 6:
			System.out.println("Jun Month");
			break;
		case 7:
			System.out.println("Jul Month");
			break;
		case 8:
			System.out.println("Aug Month");
			break;
		case 9:
			System.out.println("Sep Month");
			break;
		case 10:
			System.out.println("Oct Month");
			break;
		case 11:
			System.out.println("Nov Month");
			break;
		default:
			System.out.println("Dec Month");		
		}
		System.out.println("Number of Days:"+numDays);
	}
}
