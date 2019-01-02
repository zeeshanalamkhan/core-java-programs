package com.zeeshan.numbers;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		Scanner scn = null;
		int n = 0;
		int fact = 1;
		System.out.println("Please enter the value of n: ");
		scn = new Scanner(System.in);
		n = scn.nextInt();
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println("The Factorial of " + n + " is: " + fact);
	}

}
