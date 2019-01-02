package com.zeeshan.numbers;

import java.util.Scanner;

public class PrimeCheckGivenNumber {

	public static void main(String[] args) {
		int n = 0;
		int i = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Please Eneter the number: ");
		n = scn.nextInt();
		if (n == 1) {
			System.out.println("Prime will start from 2 ");
		} else {
			for (i = 2; i < n; i++) {
				if (n % i == 0) {
					System.out.println("Number " + n + "  is not a PRIME");
					break;
				}
			}
			if (n == i) {
				System.out.println("Number " + n + "  is  a PRIME");
			}
		}
	}

}
