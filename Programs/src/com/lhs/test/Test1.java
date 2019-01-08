package com.lhs.test;

import java.util.LinkedHashSet;

public class Test1 {

	public static void main(String[] args) {

		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
		lhs.add("a");
		lhs.add("a");
		lhs.add(new String("a"));
		lhs.add("b");
		lhs.add(98);

		System.out.println(lhs);
	}

}
