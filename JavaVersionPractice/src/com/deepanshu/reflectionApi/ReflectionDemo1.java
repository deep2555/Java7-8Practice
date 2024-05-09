package com.deepanshu.reflectionApi;

import java.lang.reflect.Method;

public class ReflectionDemo1 {
	public static void main(String[] args) {
		
		
		try {
			Class c = Class.forName(args[0]);
			Method [] method =c.getDeclaredMethods();
			
			System.out.println("methods are ");
			for(Method mm: method) {
				System.out.println(mm);
			}
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
