package com.zeeshan.numbers;

public class SumOfNumber {

	public static void main(String[] args) {

		int num = 2563;
		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		System.out.println(sum);
	}

}
