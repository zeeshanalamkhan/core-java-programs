package com.zeeshan.numbers;

import java.util.Scanner;

public class OneToNnumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = 0;
		System.out.println("Please enter value of N: ");
		n = Integer.parseInt(scn.next());
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}
}
