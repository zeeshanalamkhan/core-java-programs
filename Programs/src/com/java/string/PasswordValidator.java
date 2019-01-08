package com.java.string;

import java.util.Scanner;

public class PasswordValidator {
	public static void main(String[] args) {
		boolean upper, lower, digit, splChar;
		upper = false;
		lower = false;
		digit = false;
		splChar = false;
		while (true) {
			System.out.println("Enter pasword: ");
			Scanner scn = new Scanner(System.in);

			String password = scn.nextLine();
			int len = password.length();
			if (len < 8 || len > 16) {
				System.out.println("Password should be in the range of 8 - 16");
			} else {
				for (int i = 0; i < len; i++) {
					char ch = password.charAt(i);
					if (Character.isLetter(ch)) {
						if (Character.isUpperCase(ch)) {
							upper = true;
						} else if (Character.isLowerCase(ch)) {
							lower = true;
						} else if (Character.isDigit(ch)) {
							digit = true;
						} else {
							splChar = true;
						}
					}
				}
				if (upper && lower && digit && splChar) {
					System.out.println("Password is Registered Successfully ...!!");
				} else {
					System.out.println(
							"Password should contain at least:\n1 - Upper Case\n1 - LowerCase\n1 - Digit\n1 - SpecialCharacter");
				}

			}
		}
	}
}
