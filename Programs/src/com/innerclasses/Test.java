package com.innerclasses;

class Outer {
	public void methodOne() {
		System.out.println("Outer.methodOne()");
	}

	class Inner {
		public void methodTwo() {
			System.out.println("Outer.Inner.methodTwo()");
		}
	}
}

public class Test {

	public static void main(String[] args) {
		new Outer().methodOne();
		new Outer().new Inner().methodTwo();
	}

}
