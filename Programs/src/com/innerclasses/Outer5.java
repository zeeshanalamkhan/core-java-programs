package com.innerclasses;

public class Outer5 {

	public void methodOne() {
		System.out.println("Outer5.methodOne()");
		
		class Inner {
			public void methodTwo(int x, int y) {
				System.out.println("x+y ---> " + (x + y));
			}
			
		}
		Inner i  = new Inner();
		i.methodTwo(50,90);
	}
	public static void main(String[] args) {
		new Outer5().methodOne();
	}
}
