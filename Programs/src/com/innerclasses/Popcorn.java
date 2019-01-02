package com.innerclasses;

public class Popcorn {

	public void taste() {
		System.out.println("Popcorn.taste()");
	}

	public static void main(String[] args) {

		Popcorn p = new Popcorn() {

			public void taste() {
				methodTwo();
				System.out.println("Popcorn.main(...).new Popcorn() {...}.methodOne()");
			}

			public void methodTwo() {
				System.out.println("Popcorn.main(...).new Popcorn() {...}.methodTwo()");
			}

		};

		p.taste();
		Popcorn p1 = new Popcorn();
		p1.taste();
	}
}
