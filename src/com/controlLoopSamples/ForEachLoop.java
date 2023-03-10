package com.controlLoopSamples;

public class ForEachLoop 
{
	public static void main(String[] args) 
	{
		int[] arr = {23,132,76,98,56,67};
		int sum = 0;
		for(int num:arr)
		{
			sum+=num;
		}
		System.out.println("Sum of an array:"+sum);
	}
}
