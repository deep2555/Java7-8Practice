package com.deepanshu.core.javaPractice.testSeries;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.util.Scanner;
import java.io.IOException;

// file reading and writing challenge
public class TestSeries8 {

	public static void main(String[] args) {
		try {
			String fileGet = readFileFromUser();
			readFile(fileGet);
		} catch (FileNotFoundException e) {
			System.out.println("file not found at this location: ");
			e.printStackTrace();
		}

	}

	public static void readFile(String fileGet) {
		try(FileReader file = new FileReader(fileGet)){
			int read;
			while((read = file.read())!=-1) {
				System.out.print((char)read);
			}
		}catch(IOException exception) {
			System.out.print("nooot able to read the file");
		}
	}

	public static String readFileFromUser() throws FileNotFoundException {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("enter the file name to read: ");
		 * System.out.println("Working directory: " + System.getProperty("user.dir"));
		 * String fileGet = sc.next(); System.out.println("Working directory: " +
		 * System.getProperty(fileGet));
		 */
		String fileGet = "D:\\eclipse practice\\Java7-8Practice\\JavaVersionPractice\\javaTest.txt";
		File file = new File(fileGet);
		
		if(!file.exists() || !file.isFile()) {
			throw new FileNotFoundException(
					"file not found" + file.getAbsolutePath()
					);
		}else {
			System.out.println("file found");
		}

		return fileGet;

	}

}
