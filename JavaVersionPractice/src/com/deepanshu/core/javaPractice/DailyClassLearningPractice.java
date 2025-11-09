package com.deepanshu.core.javaPractice;

import java.util.Scanner;

public class DailyClassLearningPractice {
	public static void main(String[] args) {
		
		
//		int count = 2;
//		int[] getInput = TernaryOperators.getUserInput(count);
//
//		for (int i = 0; i < getInput.length; i++) {
//			System.out.println("get input is: " + getInput[i]);
//		}
//
//		getMaximumNumber(getInput);
		
	}

	public static void getMaximumNumber(int[] arr) {

		// get the maximum number
		// by using if else statement
		/*
		 * if (arr[0] > arr[1]) { System.out.println("number 1 is greater"); } else {
		 * System.out.println("number 2 is greater"); }
		 */
		
		// with ternary operator
		int maxNumber = arr[0]> arr[1]? arr[0] : arr[1];
		System.out.println(maxNumber+ " is the greates number");

	}

}

// Control statements
//  1) Ternary operators

class TernaryOperators {

	// normal method to get input
	public static int[] getUserInput(int user) {

		Scanner sc = new Scanner(System.in);
		int[] number = new int[user];

		for (int i = 0; i < user; i++) {
			System.out.println("enter your number: ");
			number[i] = sc.nextInt();
		}
		return number;

	}

}
class SwitchCaseStatementPractice{
	// what to do 
	// get the number form user and will print the number of days 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers here:");
		int number = sc.nextInt();
		sc.close();
		
		
		switch(number) {
		case 1: 
			System.out.println("Monday");
			break;
		case 2: 
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		case 4: 
			System.out.println("Thursday");
			break;
		case 5: 
			System.out.println("Friday");
			break;
		case 6: 
			System.out.println("Saturday");
			break;
		case 7: 
			System.out.println("Sunday");
			break;
			
			default:
				System.out.println("invalid daysa");
				break;
		}
	}
	
	
	
}
