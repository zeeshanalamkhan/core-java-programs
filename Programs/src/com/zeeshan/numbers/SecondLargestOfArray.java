package com.zeeshan.numbers;

import java.util.Arrays;

public class SecondLargestOfArray {

	public static void main(String[] args) {

		int[] array = { -222, -555, -555, -666, -777, -333, -578 };
		int max;
		int secondMax;
		if (array[0] > array[1]) {
			max = array[0];
			secondMax = array[1];
		} else {
			max = array[1];
			secondMax = array[0];
		}
		for (int i = 2; i < array.length; i++) {
			if (array[i] > max) {
				secondMax = max;
				max = array[i];
			} else if (array[i] < max && array[i] > secondMax) {
				secondMax = array[i];
			}
		}
		System.out.println("MAX: " + max + "\n" + "SecondMax: " + secondMax);
		/*
		 * Arrays.sort(array);
		 * System.out.println(Arrays.toString(array)+"\n Second Max: "+array[
		 * array.length-2]);
		 */
	}
}
