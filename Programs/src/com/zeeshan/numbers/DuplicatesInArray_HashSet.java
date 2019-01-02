package com.zeeshan.numbers;

import java.util.HashSet;

public class DuplicatesInArray_HashSet {

	public static void main(String[] args) {

		String[] strArray = { "abc", "xyz", "zeeshan", "xyz", "faizan", "zeeshan", "uvw", "abc", "123" };
		HashSet<String> hashSet = new HashSet<String>();

		for (String str : strArray) {

			if (!hashSet.add(str)) {
				System.out.println("Duplicate element is: " + str);
			}
		}
	}
}
