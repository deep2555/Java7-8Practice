package com.deepanshu.core.javaPractice;

import java.util.Scanner;

//find the minimum of two number
public class TernaryAndSwitchCaseTask {

	public static void main(String[] args) {

		// int[] userIP = getUserInput(2);
		// checkMinimum(userIP);

		int usrIP = getInput();
		checkOddEven(usrIP);
	}

	// Task 1 ) check the minimum number between two given number by ternary
	// operator
	public static void checkMinimum(int[] userIP) {
		// TODO Auto-generated method stub
		// simple value added dynamically
		// using ternary operator
		int minimumOP = userIP[0] < userIP[1] ? userIP[0] : userIP[1];
		System.out.println(minimumOP + ": is the minimum number");
	}

	// Task 2) program to find if the given number is even or odd using ternary
	// operator
	public static void checkOddEven(int number) {
		String checkODEV = number % 2 == 0 ? "even" : "Odd";
		System.out.println("the given number is : " + checkODEV);

	}

	// normal method to get input from user using loop
	public static int[] getUserInput(int user) {

		Scanner sc = new Scanner(System.in);
		int[] number = new int[user];

		for (int i = 0; i < user; i++) {
			System.out.println("enter your number: ");
			number[i] = sc.nextInt();
		}
		sc.close();
		return number;

	}

	// normal method to get input from user without using loop
	public static int getInput() {

		Scanner sc = new Scanner(System.in);
		int number = 0;

		System.out.println("enter your number: ");
		number = sc.nextInt();
		sc.close();
		return number;

	}

}
