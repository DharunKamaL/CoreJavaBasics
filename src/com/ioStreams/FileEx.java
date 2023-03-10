package com.ioStreams;

import java.io.File;
import java.io.FileWriter;



public class FileEx
{
	public static void main(String[] args) 
	{
		File dir = new File("F:\\Worksp");
		boolean value = false;
		String data = "This is a sample file...";
	
		try
		{
			boolean isDir = dir.mkdir();
			dir.getAbsolutePath();
			boolean isExist = dir.exists();
			
			if(isDir)
			{
				File file = new File(dir.getAbsolutePath()+"\\file1.txt");
				value = file.createNewFile();
			}
			if(isExist)
				System.out.println(dir.getAbsolutePath());
			if(value)
			{
				System.out.println("File was created...");
			}
			else
				System.out.println("No File was created...");
			FileWriter file1 = new FileWriter("F:\\WorkSp\\"+"file1.txt");


				file1.write(data);
				file1.flush();
				file1.close();

		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
}
