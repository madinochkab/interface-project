/**
 *   File Name: EmployeeEntryApplication.java<br>
 *
 *   Siebenthal, Madina<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 31, 2016
 *
 */

package com.sqa.ms;

import java.util.*;

import com.sqa.ms.util.helpers.*;

/**
 * EmployeeEntryApplication //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Siebenthal, Madina
 * @version 1.0.0
 * @since 1.0
 *
 */
public class EmployeeEntryApplication {
	static int employeeCount;
	static String[] names, addresses, ages, cities, phoneNumbers, jobTitles;
	static int numOfEmployees;
	static Scanner scanner = new Scanner(System.in);
	static String userName;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		welcomeUser();

		requestUserCount();
		for (int i = 0; i < numOfEmployees; i++) {
			addEmployeeInfo(i);

		}
		displayEmployee();
		farewelUser();

	}

	/**
	 * @param i
	 */
	private static void addEmployeeInfo(int i) {
		System.out.println("can I get employee " + (i + 1) + " name:");
		names[i] = scanner.nextLine();

		System.out.println("can I get employee " + names[i] + " address:");
		addresses[i] = scanner.nextLine();

		System.out.println("can I get employee " + names[i] + " age:");
		ages[i] = scanner.nextLine();

		System.out.println("can I get employee " + names[i] + " city:");
		cities[i] = scanner.nextLine();

		System.out.println("can I get employee " + names[i] + " title:");
		jobTitles[i] = scanner.nextLine();
	}

	/**
	 *
	 */
	private static void displayEmployee() {
		// TODO Auto-generated method stub
		for (int i = 0; i < names.length; i++) {
			System.out.println("Employee " + (i + 1) + "'s Name: " + names[i]);
			System.out.println("Age: " + ages[i]);
			System.out.println("Address: " + addresses[i]);
			System.out.println("City: " + cities[i]);
			System.out.println("Job Title: " + jobTitles[i]);

		}

	}

	/**
	 *
	 */
	private static void farewelUser() {
		// TODO Auto-generated method stub
		System.out.println("thanks for using this app " + userName + "!");
		scanner.close();
		System.exit(0);
	}

	/**
	 *
	 */
	private static void getUserDetails() {
		// TODO Auto-generated method stub

	}

	/**
	 *
	 */
	private static void requestUserCount() {
		numOfEmployees = RequestInput.getInt("how many employees would you like to enter in to system", 1, 2, 3, 4, 5,
				6, 7, 8, 9);
		names = new String[numOfEmployees];
		ages = new String[numOfEmployees];
		cities = new String[numOfEmployees];
		jobTitles = new String[numOfEmployees];
		addresses = new String[numOfEmployees];
	}

	/**
	 *
	 */
	private static void welcomeUser() {
		System.out.println("welcome and whats your name");
		userName = scanner.nextLine();

	}

}
