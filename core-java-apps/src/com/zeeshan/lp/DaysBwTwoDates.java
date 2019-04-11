package com.zeeshan.lp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DaysBwTwoDates {

	public static Long countDays(String date1, String date2) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date d1 = sdf.parse(date1);
		Date d2 = sdf.parse(date2);

		Long diff = ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
		System.out.println(diff);
		return diff;
	}

	public static void main(String[] args) throws Exception {

		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter start date in 'dd-MM-yyyy' Format: ");
		String s1 = scn.nextLine();
		System.out.println("\nPlease enter end date in 'dd-MM-yyyy' Format: ");
		String s2 = scn.nextLine();
		System.out.println("The Days between Dates " + s1 + " and " + s2 + " is: " + countDays(s1, s2));
		System.out.println("The Years between Dates " + s1 + " and " + s2 + " is: " + (countDays(s1, s2))/365);
		scn.close();
	}

}
