package com.basicSamples;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatSample {

	public static void main(String[] args) {
		Date date = new Date ();
		System.out.println(date);
		
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
		System.out.println(time.format(date));
		
		SimpleDateFormat date1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(date1.format(date));
	}

}
