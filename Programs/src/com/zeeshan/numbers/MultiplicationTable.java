package com.zeeshan.numbers;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int n = 0;

		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter value of n ");
		n = scn.nextInt();
		System.out.println("\n====================Multiplication Table====================\n");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " :    " + i * j+"\t");
			}
			System.out.println("\t");
		}

	}

}
