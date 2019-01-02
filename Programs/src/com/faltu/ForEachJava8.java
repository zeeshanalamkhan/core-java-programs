package com.faltu;

import java.util.ArrayList;
import java.util.List;

public class ForEachJava8 {

	public static void main(String[] args) {

		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		items.forEach(item -> {
			
		System.out.println(item);
				});

}}
