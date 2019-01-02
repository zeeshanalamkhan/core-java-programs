package com.zeeshan.numbers;

import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {

		int num = 0, t = 0, revNum = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter number: ");
		num = scn.nextInt();
		t = num;
		while (num != 0) {

			revNum = revNum * 10 + (num % 10);
			num = num / 10;
		}
		System.out.println("Reverse Number of " + t + " is " + revNum);
		scn.close();
	}

}
