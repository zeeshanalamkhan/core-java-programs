package com.zeeshan.numbers;

import java.util.Scanner;

public class GCDOfTwoNUmbes {

	static int gcd(int m, int n) {
		if (m < n) {
			return gcd(n, m);
		}
		if (n == 0) {
			return m;
		}
		return gcd(n, m % n);
	}

	public static void main(String[] args) {
		int num1, num2;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enetr number1: ");
		num1 = scn.nextInt();
		System.out.println("Enetr number2: ");
		num2 = scn.nextInt();
		System.out.println("GCD OF " + num1 + " , And " + num2 + " is: " + gcd(num1, num2));
		scn.close();
	}

}
