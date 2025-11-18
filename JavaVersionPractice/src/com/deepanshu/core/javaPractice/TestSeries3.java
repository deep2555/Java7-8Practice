package com.deepanshu.core.javaPractice;

import java.util.Scanner;
import java.util.stream.IntStream;

public class TestSeries3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		final String presentPass = "deep";
//		checkPP(sc, presentPass);
//		int[] arr = { 1, 23, 5, 6, 78 };
//		searchArray(arr);
		// here i am sending the number by position 
//		int count =8;
//		for(int i= 1; i<=count; i++) {
//			System.out.println(fibonaccRecc(i));
//		}
		System.out.println(checkPalin("nitin"));
		System.out.println(isPalin("yuu"));
		

	}

	// password checker until valid password is enter (DO-WHILE)
	public static void checkPP(Scanner sc, String presentPass) {
		String pass;
		do {
			System.out.println("enter the password to check :");
			pass = sc.next();
		} while (!passwordEncoder(pass, presentPass));
		System.out.println("access grated");
	}

	public static boolean passwordEncoder(String password, String presentPass) {
		// using the do while loop
		return password.equals(presentPass);

	}
	
	// fibonacci using normal 
	public static void fibonacc(int number) {
		int a =0;
		int b=1;
		System.out.println(b);
		for(int i=0;i<number;i++) {
			int next = a+b;
			a=b;
			b= next;
			
			System.out.println(next);
		}
		
	}
	// fibonacci using recursion 
		public static int fibonaccRecc(int number) {
			// base case
			if(number ==1) {
				return 0;
			}
			if(number ==2) {
				return 1;
			}
			
			//call function
			return fibonaccRecc(number-1) 
					+ fibonaccRecc(number-2);
		}
	
	
	// find the maximum array using for each loop
	public static void searchArray(int[] arr) {
		int max = 0;
		for (int num : arr) {
			// System.out.println("num:"+ num);
			// maximum element algorithm
			if (num > max) {
				max = num;
			}
		}
		System.out.println("the maximum number is :" + max);
	}
	//check string palindrome using normal 	
	public static boolean checkPalin(String str) {
		int left =0;
		int right = str.length()-1; // here get the index of the string
		
		while(left<right) {
			if(str.charAt(left)!= str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
		
	}
	//check string palindrome using recursion
	public static boolean isPalin(String str) {
		// base case;
		if(str.length()<=1) {
			return true;
		}
		if(str.charAt(0)!= str.charAt(str.length()-1)) {
			return false;
		}
		String sub = str.substring(1,str.length()-1);
		return isPalin(sub);
	}

}
