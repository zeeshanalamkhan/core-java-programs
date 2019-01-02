package com.zeeshan.numbers;

import java.util.Scanner;

public class FactorialRangeOfNumber {

	static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int n = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter value of n: ");
		n = scn.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("The Factorial of " + i + " is: " + factorial(i));
		}
	}

}
