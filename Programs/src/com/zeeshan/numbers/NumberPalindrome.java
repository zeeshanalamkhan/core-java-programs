package com.zeeshan.numbers;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {

		int num = 0;
		int revNum = 0;
		int n = 0;
		Scanner scn = null;
		System.out.println("Please enter number: ");
		scn = new Scanner(System.in);
		num = scn.nextInt();
		n = num;
		while (num != 0) {
			revNum = revNum * 10 + (num % 10);
			num = num / 10;
		}
		if (n == revNum) {
			System.out.println("Number " + n + " is a Palindrome Number");
		} else {
			System.out.println("Number " + n + " is not a Palindrome Number");
		}
	}
}
