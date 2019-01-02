package com.zeeshan.numbers;

import java.util.Scanner;

public class Pyramid2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the number of roows, you want to print: ");
		int noOfRows = scn.nextInt();
		int rowCount=1;
		for(int i=noOfRows;i>0;i--){
			for(int j = 1; j<=i;j++){
				System.out.print(" ");
			}
			for(int j = 1; j<=rowCount;j++){
				System.out.print(rowCount+" ");
			}
			System.out.println(" ");
			rowCount++;
		}
	}
}
