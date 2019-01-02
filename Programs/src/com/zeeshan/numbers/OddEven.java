package com.zeeshan.numbers;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = 0;
		System.out.println("Please Enter the number: ");
		n = scn.nextInt();
		if(n!=0 && n%2 == 0){
			System.out.println("Number "+n+" is Even");
		}
		else if (n!=0 && n%2 != 0) {
			System.out.println("Number "+n+" is Odd");
		}
		else
			System.out.println("You entered Number  is Zero");
	}
}
