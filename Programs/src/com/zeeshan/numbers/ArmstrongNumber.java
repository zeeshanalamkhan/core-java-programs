package com.zeeshan.numbers;

/*An Armstrong number is an integer such that the sum of the power of its digits is
equal to the number itself.*/

public class ArmstrongNumber {

	static int countDigit(int x) {
		int count = 0;
		while (x > 0) {
			count++;
			x = x / 10;
		}
		return count;
	}

	static int power(int n, int p) {
		int pw = 1;
		while (p > 0) {
			pw = pw * n;
			p--;
		}
		return pw;
	}

	static boolean isArmstrongNumber(int x) {
		boolean flag = false;
		int sum = 0;
		int nd = 0;
		nd = countDigit(x);
		int t = x;
		while (x > 0) {
			sum = sum + power(x % 10, nd);
			x = x / 10;
		}
		if (sum == t) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {
		System.out.println(isArmstrongNumber(1634));
	}

}
