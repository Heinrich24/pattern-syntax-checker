package com.heinrich24;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MyMain {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while (testCases > 0) {
			String pattern = in.nextLine();
			testCases--;
			try {
				Pattern validate = Pattern.compile(pattern);
				System.out.println("Valid");

			} catch (Exception e) {
				System.out.println("Invalid");
			}
		}

	}

}
