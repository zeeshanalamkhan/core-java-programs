package com.innerclasses;

public class ThreadMain {

	public static void main(String[] args) {

		Thread t = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(i + " :child-thread");
				}
			}
		};
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " :main-thread");
		}
	}
}
