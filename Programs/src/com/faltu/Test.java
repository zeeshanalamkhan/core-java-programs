package com.faltu;

public class Test {

	int x = 20;
	static int y = 30;
	
	public int getX() {
		return x;
	}

	public void methodOne(){
		System.out.println("x->" + x + " y->" + y);
	}
	
	public static void main(String[] args) {
		System.out.println("x->" + new Test().getX() + " y->" + y);
		new Test().methodOne();
	}
}
