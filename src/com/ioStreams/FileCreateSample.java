package com.ioStreams;

import java.io.File;

public class FileCreateSample 
{

	public static void main(String[] args) 
	{
		File dir = new File("F:\\newFileDirectory");
		boolean value = false;
		try
		{
			boolean isDir = dir.mkdir();
			dir.getAbsolutePath();
			dir.exists();
			dir.getAbsoluteFile();
			
			if(isDir)
			{
				File file = new File(dir.getAbsolutePath()+"\\newFileDirectory.txt");
				value = file.createNewFile();
			}
			if(dir.exists())
				System.out.println(dir.getAbsolutePath());
			if(value)
			{
				System.out.println("New file is created");
			}
			else
				System.out.println("No file was created");
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
}
