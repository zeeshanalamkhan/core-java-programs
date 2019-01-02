package com.zeeshan.numbers;

import java.util.Scanner;

public class StrongNumberRange {

	private static int factorial(int n) {
		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	static boolean isStrong(int j) {
		int sum = 0;
		int k = j;
		while (j != 0) {
			sum = sum + factorial(j % 10);
			j = j / 10;
		}
		if (sum == k) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int num = 0;

		System.out.println("Please enter number: ");
		Scanner scn = new Scanner(System.in);
		num = scn.nextInt();
		boolean flag = false;
		for (int i = 1; i <= num; i++) {
			flag = isStrong(i);
			if (flag == true) {
				System.out.println("Number " + i + " is a Strong number");
			} else {
				System.out.println("Number " + i + " is not a Strong number");
			}
		}
	}

}
