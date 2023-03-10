package com.controlLoopSamples;

public class BranchingStatements 
{

	public static void main(String[] args) 
	{
		int[] arr = {32,87,3,589,12,1076,2000,8,622,127};
		int searchFor = 12;
		boolean foundIt = false;
		int i =0;
		for(;i<arr.length;i++)
		{
			if(arr[i]==searchFor)
			{	
				foundIt = true;
				break;
			}
		}
		if(foundIt) 
		{
			System.out.println("Found "+searchFor+" at index "+i);
		}
		else
			System.out.println("Not Found");
				
	}
}


