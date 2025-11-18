package com.deepanshu.core.javaPractice;

import java.util.Scanner;

public class TestSeries3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pass;
		final String presentPass = "deep";
		do {
			System.out.println("enter the password to check :");
			pass = sc.next();
		} while (!passwordEncoder(pass, presentPass));
		System.out.println("access grated");

	}

	// password checker until valid password is enter (DO-WHILE)
	public static boolean passwordEncoder(String password, String presentPass) {
		// using the do while loop
		return password.equals(presentPass);

	}
}
