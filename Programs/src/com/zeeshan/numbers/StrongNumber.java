/*A Strong Number is that whose sum of factorial of digits is equal to that number itself*/
package com.zeeshan.numbers;

import java.util.Scanner;

public class StrongNumber {

	private static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int n = 0;
		int t = 0;
		int sum = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		n = scn.nextInt();
		t = n;
		while (n != 0) {
			sum += factorial(n % 10);
			n = n / 10;
		}
		System.out.println(sum);
		if (t == sum) {
			System.out.println("Number " + t + " is a STRONG number");
		} else {
			System.out.println("Number " + t + " is not a STRONG number");
		}
	}

}
