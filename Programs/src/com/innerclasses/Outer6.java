package com.innerclasses;

public class Outer6 {

	public void taste() {
		System.out.println("Outer6.taste()");
	}

	public static void main(String[] args) {
		Outer6 o = new Outer6() {
			public void taste() {
				System.out.println("Outer6.main(...).new Outer6() {...}.taste()");
			}
		};
		o.taste();
		Outer6 o1 = new Outer6();
		o1.taste();
	}
}