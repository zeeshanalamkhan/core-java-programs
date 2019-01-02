/*
 * a number will be said to be a perfect number 
 * if its proper dividers' sum is equal to that number
 * 
 */

package com.zeeshan.numbers;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		int num = 0;
		int sum = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number: ");
		num = scn.nextInt();
		for (int i = 1; i <= num / 2; i++) {
			if (num % i == 0) {
				//System.out.println(i);
				sum += i;
			}
		}
		if (num == sum) {
			System.out.println("Number " + num + " is Perfect number");
		} else {
			System.out.println("Number " + num + " is not a Perfect number");
		}

	}

}
