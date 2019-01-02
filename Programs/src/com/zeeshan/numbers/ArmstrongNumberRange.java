package com.zeeshan.numbers;

import java.util.Scanner;

public class ArmstrongNumberRange {

	public static int power(int p, int n) {
		int pw = 1;
		while (p > 0) {
			pw = pw * n;
			p--;
		}
		System.out.println("p= " + p + " n= " + n + " pw=" + pw);
		return pw;
	}

	public static int countDigit(int x) {
		int count = 0;
		while (x != 0) {
			count++;
			x = x / 10;
		}
		return count;
	}

	public static boolean isArmstrong(int x) {
		boolean flag = false;
		int nd = 0;
		int t = x;
		int revNum = 0;
		nd = countDigit(x);

		while (x != 0) {
			revNum = revNum + power(x % 10, nd);
			x = x / 10;
		}
		System.out.println("Rev NUm" + revNum);
		if (revNum == t) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {

		int num = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		num = scn.nextInt();

		for (int range = 1; range <= num; range++) {

			if (isArmstrong(range) == true) {
				System.out.println("Number " + range + " is Armstrong Number");
			}

		}
		scn.close();
	}

}
