package com.bridgelabz.user_registration_problem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstName {

	public static void main(String[] args) {

		String namePattern = "^[A-Z]{1}[a-z]{3,9}$";
		Pattern regex = Pattern.compile(namePattern);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first name : ");
		String fNameinputString = scanner.nextLine();
		Matcher firstNameMatcher = regex.matcher(fNameinputString);
		scanner.close();
		if (firstNameMatcher.matches()) {
			System.out.println(fNameinputString + " is valid First Name.");
		} else {
			System.out.println(fNameinputString + " is invalid First Name.Kindly input the right one.");
		}
	}
}