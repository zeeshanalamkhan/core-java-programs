package com.zeeshan.numbers;

public class SumOfNumber_Recursion {

	static int sum = 0;

	public static int sumOfNumber(int x) {
		if (x == 0) {
			return sum;
		} else {
			int lastDigit = x % 10;
			sum += lastDigit;
			sumOfNumber(x / 10);
		}
		return sum;
	}

	public static void main(String[] args) {

		System.out.println(sumOfNumber(180396));
	}
}
