package com.controlLoopSamples;

public class LargestArray 
{
	    public static void average() {
	        int[] salary = {4000,3000,2000,1000};
	        int max = salary[0];
	        for(int i=0;i<salary.length;i++){
	            if(salary[i]>=max){
	                max = salary[i];
	            }
	        }
	        int min = salary[0];
	        for(int j=0;j<salary.length;j++){
	            if(salary[j]<=min){
	                min = salary[j];
	            }
	        }
	        double avg = (max+min)/2;
	        System.out.println(avg);

	    }

	    public static void main(String args[]){
	        average();
	    }
	}

//	public static void main(String[] args) 
//	{
//		int[] arr = {10,25,100,125,99,560,2,11};
//		int max = arr[0];
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>max)
//				max = arr[i];
//		}
//		System.out.println(max);
//	}

