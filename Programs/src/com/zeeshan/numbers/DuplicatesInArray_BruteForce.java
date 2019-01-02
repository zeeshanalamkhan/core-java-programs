package com.zeeshan.numbers;

public class DuplicatesInArray_BruteForce {

	public static void main(String[] args) {

		String[] strArray = { "abc", "xyz", "zeeshan", "faizan", "zeeshan", "xyz", "uvw", "abc", "123" };
		for (int i = 0; i < strArray.length - 1; i++) {
			for (int j = i; j < strArray.length; j++) {
				if (strArray[i].equals(strArray[j]) && (i != j)) {
					System.out.println("Duplicate element is: " + strArray[j]);
				}
			}
		}
	}
}
