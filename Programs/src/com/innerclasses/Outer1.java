package com.innerclasses;

public class Outer1 {
	
	private int x = 10;
	static int y=20;
	class Inner{
		public void methodOne(){
			System.out.println("x->"+x+"\ny->"+y);
		}
	}
	public static void main(String[] args) {
		new Outer1().new Inner().methodOne();
	}
}
