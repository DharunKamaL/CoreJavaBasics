package com.ioStreams;

import java.io.FileWriter;

public class FileWriterSample 
{

	public static void main(String[] args) 
	{
		String data = "This is the data in the output2 text file";
		try
		{
			FileWriter output = new FileWriter("output2.txt");//creates filewriter
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