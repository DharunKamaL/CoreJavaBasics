package com.ioStreams;

import java.io.FileReader;


public class FileReaderSample 
{
	public static void main(String[] args)
	{
		char[] arr = new char[100];
		try
		{
			FileReader input = new FileReader("F:\\Dharun\\workspace\\SDETTrainingWS\\CoreJavaBasics\\src\\com\\IOStreams\\input.txt");//creates reader using filereader
			input.read(arr);//reads characters in a char array
			System.out.println("Data in this file:");
			System.out.println(arr);
			input.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
			System.out.println(e.toString());
		}
	} 
}
