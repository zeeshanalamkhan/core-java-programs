package com.innerclasses;

public class Outer3 {

	private int x = 20;
	@SuppressWarnings("unused")
	private static int y = 30;

	class Inner {
		int x = 90;
		public void methodOne() {
			int x=10;
			System.out.println("Inner x->" + x);
			System.out.println("this.x->" + this.x);
			System.out.println("x->" + new Outer3().x);
		}
	}

	public static void main(String[] args) {
		System.out.println("Outer3.main()");
		new Outer3().new Inner().methodOne();
	}
}
