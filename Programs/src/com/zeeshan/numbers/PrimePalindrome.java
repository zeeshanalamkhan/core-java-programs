package com.zeeshan.numbers;

import java.util.Scanner;

public class PrimePalindrome {

	private static boolean isPrime(int x) {
		boolean flag = false;
		int y = 0;
		for (y = 2; y <= x; y++) {
			if (x % y == 0) {
				flag = false;
				break;
			}
		}
		if (x == y) {
			flag = true;
		}
		return flag;
	}

	private static boolean revNumber(int x) {
		boolean flag = false;
		int revNum = 0;
		int t = x;
		while (x != 0) {
			revNum = revNum * 10 + (x % 10);
			x = x / 10;
		}
		if (revNum == t) {
			flag = true;
		}
		return flag;
	}

	public static void main(String[] args) {
		int num = 0;
		System.out.println("Eneter Number: ");
		Scanner scn = new Scanner(System.in);
		num = scn.nextInt();
		if (isPrime(num) && revNumber(num)) {
			System.out.println("Number " + num + " is PrimePalindrome");
		} else {
			System.out.println("Number " + num + " is not PrimePalindrome");
		}
	}

}