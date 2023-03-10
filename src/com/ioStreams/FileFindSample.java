package com.ioStreams;

import java.io.File;

public class FileFindSample 
{
	
	public static void main(String[] args) 
	{
		File dir = new File("F:\\Dharun\\TNPSC OTR&APPLICATION FORMS");
		insideFiles(dir);
	}
	public static void insideFiles(File filename)
	{
		boolean isDir = filename.isDirectory();//true
		File[] arr = filename.listFiles();
		if(isDir)
		{
			for(File f :arr )
			{
				System.out.println("Files "+f);
				insideFiles(f);
			}
		}
	}
}
