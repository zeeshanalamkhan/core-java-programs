package com.zeeshan.numbers;

import java.util.HashMap;

public class DuplicateCharactersInString {

	public static void duplicateCharCount(String str) {
		
		HashMap<Character, Integer> charCountMap = new HashMap<Character,Integer>();
		char[] strArray = str.toCharArray();
		
		for(char c: strArray) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c)+1);
			}
		}
	}
}
