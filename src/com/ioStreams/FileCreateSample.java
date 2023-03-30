package com.ioStreams;

import java.io.File;

public class FileCreateSample {

	public static void main(String[] args) {
		File dir = new File("F:\\newFile1");
		boolean value = false;
		try {
			boolean isDir = dir.mkdir();
			String path = dir.getAbsolutePath();
			boolean isExists = dir.exists();
			File a = dir.getAbsoluteFile();

			if (isDir) {
				File file = new File(path + "\\newFile1.txt");
				value = file.createNewFile();
			}
			if (isExists)
				System.out.println(path);
			if (value) {
				System.out.println("New file is created" + a);
			} else
				System.out.println("No file was created");
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}