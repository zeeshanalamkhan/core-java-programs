/**
 * 
 */
package com.zeeshan.lp;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author ZEESHAN KHAN
 *
 */
public class DuplicateInString {

	/**
	 * @param args
	 */

	public static void duplicateInString(String str) {

		char[] ch = str.toLowerCase().toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println("Counting Duplicate in: " + str);
		Set<Character> charsInStr = map.keySet();
		System.out.println("SET====>" + charsInStr);
		for (Character c : charsInStr) {
			if (map.get(c) > 1) {
				System.out.println(c + "  " + map.get(c));
			}
		}
	}

	public static void main(String[] args) {

		duplicateInString("Zeeshan Alam Khan");
		duplicateInString("India");
	}

}
