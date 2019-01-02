package com.zeeshan.numbers;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 0;

		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the value of n: ");
		n = scn.nextInt();
		for (int i = 2; i <= n; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println("n " + i + " is a Prime Number ");
			}
		}

	}

}
