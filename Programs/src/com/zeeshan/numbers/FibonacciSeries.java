package com.zeeshan.numbers;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num1 = 0, num2 = 1, sum = 0;
		int range = 0;

		Scanner scn = null;
		System.out.println("Enter the range: ");
		scn = new Scanner(System.in);
		range = scn.nextInt();
		if (range == 0) {
			num2 = num1 - 1;
			System.out.println("Fibonacci Series for 0 is:" + 0);
		} else {
			System.out.print("Fibonacci Series: ");
			for (int i = 1; i <= range; i++) {
				System.out.print(num1+" ");
				sum = num1 + num2;
				num2 = num1;
				num1 = sum;
			}

		}

	}

}
