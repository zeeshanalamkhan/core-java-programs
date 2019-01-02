package com.faltu;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Character, Integer>charHashMap=new HashMap<Character, Integer>();
			charHashMap.put('a', 5);
			charHashMap.put('b', 6);
			charHashMap.put('c', 4);
			charHashMap.put('d', 8);
			System.out.println(charHashMap);
			System.out.println(charHashMap.get('b')+8);
	}
}
