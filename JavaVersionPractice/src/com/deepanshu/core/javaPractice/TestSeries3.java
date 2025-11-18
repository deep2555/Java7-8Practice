package com.deepanshu.core.javaPractice;

import java.util.Scanner;

public class TestSeries3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pass;
		String presentPass = "deep";
		do {
			System.out.println("enter the password to check :");
			pass = sc.next();
		} while (passwordEncoder(pass, presentPass));

	}

	// password checker until valid password is enter (DO-WHILE)
	public static boolean passwordEncoder(String password, String presentPass) {
		// using the do while loop

		System.out.println("inside the do loop ");
		if (password.equalsIgnoreCase(presentPass)) {
			return true;
		}
		return false;

	}
}
