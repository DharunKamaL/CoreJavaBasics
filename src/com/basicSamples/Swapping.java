package com.basicSamples;

import java.util.Scanner;

public class Swapping 
{
	static int temp;
	static void swap(int m, int n) {
		temp = m;
		m = n;
		n = temp;
		System.out.println("m:"+m+" n:"+n);
	}
	
	static void withoutThirdSwap(int x, int y) {
		x = x+y;
		y = x-y;
		x = x-y;
		System.out.println("x: "+x+" y: "+y);
	}

	public static void main(String[] args) 
	{
		swap(4,5);
		withoutThirdSwap(9,8);
	}

}
