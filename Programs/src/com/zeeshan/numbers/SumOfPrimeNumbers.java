package com.zeeshan.numbers;

import java.util.Scanner;

public class SumOfPrimeNumbers {

	public static boolean isPrime(int i) {

		int j;
		if (i == 1) {
			return true;
		} else {
			for (j = 2; j <= i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			if (i == j) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		int n;
		int sum = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter value of n: ");
		n = scn.nextInt();
		for (int i = 1; i < n; i++) {
			if (isPrime(i)) {
				// System.out.println(i);
				sum += i;
			}
		}
		/*
		 * if (isPrime(n)) { System.out.println(n + " is a Prime Nos"); } else {
		 * System.out.println(n + " is not a Prime Nos"); }
		 */
		System.out.println("Sum of First " + n + " Prime Numbers is " + sum);
		
	}
}
