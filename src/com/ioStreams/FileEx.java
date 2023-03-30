package com.ioStreams;

import java.io.File;
import java.io.FileWriter;

public class FileEx {
	public static void main(String[] args) {
		File dir = new File("F:\\Workspace1");
		boolean value = false;
		String data = "This is a sample file...";

		try {
			boolean isDir = dir.mkdir();
			String path = dir.getAbsolutePath();
			boolean isExist = dir.exists();

			if (isDir) {
				File file = new File(path + "\\file2.txt");
				value = file.createNewFile();
			}
			if (isExist)
				System.out.println(path);
			if (value) {
				System.out.println("File was created...");
			} else
				System.out.println("No File was created...");
			FileWriter file1 = new FileWriter(path + "\\file2.txt");
			file1.write(data);
			file1.flush();
			file1.close();

		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
