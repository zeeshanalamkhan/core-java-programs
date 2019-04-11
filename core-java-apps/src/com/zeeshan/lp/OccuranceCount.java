/**
 * 
 */
package com.zeeshan.lp;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZEESHAN KHAN
 *
 */
public class OccuranceCount {

	/**
	 * @param args
	 */
	public static void countOccurance(String str) {

		Map<Character, Integer> map = new HashMap<>();
		char[] ch = str.toLowerCase().toCharArray();

		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {

		countOccurance("ZEESHAN ALAM KHAN");
		countOccurance("Warsi Clinic Sahawar");
	}

}
