package com.deepanshu.core.javaPractice;

import java.util.Scanner;

//find the minimum of two number
public class TernaryAndSwitchCaseTask {

	public static void main(String[] args) {

		int[] userIP = getUserInput(2);
		checkMinimum(userIP);
	}

	
	// check the minimum number between two given number by ternary operator
	public static void checkMinimum(int[] userIP) {
		// TODO Auto-generated method stub
		// simple value added dynamically
		// using ternary operator
		int minimumOP= userIP[0] < userIP[1]? userIP[0]: userIP[1];
		System.out.println(minimumOP + ": is the minimum number");
	}

	// normal method to get input from user
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

}
