package com.zeeshan.lp;

import java.util.HashMap;
import java.util.Map;

public class AnagramProgramHashMap {

	public static String isAnagram(String s1, String s2) {
		String status = null;
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		char[] s3 = s1.toLowerCase().replaceAll("\\s", "").toCharArray();
		char[] s4 = s2.toLowerCase().replaceAll("\\s", "").toCharArray();
		if (s3.length == s4.length) {
			for (char c1 : s3) {
				if (map1.containsKey(c1)) {
					map1.put(c1, map1.get(c1) + 1);
				} else {
					map1.put(c1, 1);
				}
			}
			for (char c2 : s4) {
				if (map2.containsKey(c2)) {
					map2.put(c2, map2.get(c2) + 1);
				} else {
					map2.put(c2, 1);
				}
			}
			if (map1.equals(map2)) {
				status = "anagram";
			} else {
				status = "not anagram";
			}

		} else {
			status = "not anagram";
		}
		return status;
	}
	//main method
	public static void main(String[] args) {
		System.out.println(isAnagram("Kerala", "KARELA"));
	}
}
