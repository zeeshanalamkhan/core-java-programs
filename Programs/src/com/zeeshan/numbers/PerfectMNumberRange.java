package com.zeeshan.numbers;

import java.util.Scanner;

public class PerfectMNumberRange {

	public static void main(String[] args) {
		int n = 0, j = 0;

		int num = 0;

		Scanner scn = null;
		System.out.println("Eneter value of range n: ");
		scn = new Scanner(System.in);
		n = scn.nextInt();

		for (num = 1; num <= n; num++) {
			int sum = 1;
			for (j = 2; j <= num / 2; j++) {

				if (num % j == 0) {
					sum += j;
				}
			}

			if (sum == num) {
				System.out.println(num + " is a perfect number");
			}
		}

		System.out.println("==========END==========");

		scn.close();
	}

}
