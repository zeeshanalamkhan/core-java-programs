package com.innerclasses;

public class Outer4 {

	class Inner1 {

		class Inner2 {
			public void methodOne() {
				System.out.println("Outer4.Inner1.Inner2.methodOne()");
			}
		}
	}

	public static void main(String[] args) {
		new Outer4().new Inner1().new Inner2().methodOne();
	}
}