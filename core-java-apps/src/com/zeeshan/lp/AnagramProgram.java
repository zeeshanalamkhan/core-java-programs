package com.zeeshan.lp;

import java.util.Arrays;

public class AnagramProgram {

	public static String isAnagram(String s1, String s2) {
		boolean status = false;
		String newS1 = s1.replaceAll("\\s", "");
		String newS2 = s2.replaceAll("\\s", "");

		if (newS1.length() == newS2.length()) {

			char[] s3 = newS1.toLowerCase().toCharArray();
			char[] s4 = newS2.toLowerCase().toCharArray();

			Arrays.sort(s3);
			Arrays.sort(s4);
			status = Arrays.equals(s3, s4);
		}
		if (status) {
			return "anagram";
		} else {
			return "not anagram";
		}
	}

	public static void main(String[] args) {
		String a = isAnagram("india", "nidia");
		System.out.println(a);
		System.out.println(isAnagram("Keep", "Peek"));
	}

}
