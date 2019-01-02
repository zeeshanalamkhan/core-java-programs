package com.zeeshan.numbers;

import java.util.Scanner;

public class FibonacciSeriesRecursive {

	private static int fibonacci(int x) {

		if (x == 0) {
			return 0;
		}
		if (x == 1) {
			return 1;
		}
		return fibonacci(x - 1) + fibonacci(x - 2);
	}

	public static void main(String[] args) {
		int num = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number: ");
		int x = scn.nextInt();
		System.out.println("Fibonacci Number is: " + fibonacci(x));

	}

}
