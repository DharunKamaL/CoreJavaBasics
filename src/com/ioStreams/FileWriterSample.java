package com.ioStreams;

import java.io.FileWriter;

public class FileWriterSample 
{

	public static void main(String[] args) 
	{
		String data = "This is the data in the output text file";
		try
		{
			FileWriter output = new FileWriter("output.txt");//creates filewriter
			output.write(data);//writes data 
			output.flush();
			output.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
			System.out.println(e.toString());
		}
	}
}
