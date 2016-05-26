/**
 *   File Name: PetRegistration.java<br>
 *
 *   Villaespin, Ruthel<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: May 25, 2016
 *   
 */

package com.sqa.rv;

import java.util.*;

/**
 * PetRegistration //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author Villaespin, Ruthel
 * @version 1.0.0
 * @since 1.0
 *
 */
public class PetRegistration {
	static String name;
	static Scanner scanner;
	static String petName, petAddress, petCity, petState, petRegPrice, petDOB;

	public static void registerPet() {
		initApplication();
		retrieveUserName();
		retrievePetDetails();
		displayPetDetails();
		exitApplication();

	}

	private static void displayPetDetails() {
		System.out.println("\nPet Details");
		System.out.println("-------------------------------");
		System.out.println("Name: + petName");
	}

	private static void exitApplication() {
		System.out.println("Thank you for using the Pet Registration Application");
		System.out.println("Good bye " + name);
	}

	private static void initApplication() {
		scanner = new Scanner(System.in);
		System.out.println("Welcome to the Pet Registration Application");
	}

	private static String obtainString(String question) {
		String input;
		System.out.print(question);
		input = scanner.nextLine();
		return input;
	}

	private static void retrievePetDetails() {
		petName = obtainString("What is your pets name:");
		petAddress = obtainString("What is you address:");
		petCity = obtainString("XXXX");
		petState = obtainString("XXXX");
		petRegPrice = obtainString("XXXX");
		petDOB = obtainString("XXXX");
	}

	private static void retrieveUserName() {
		System.out.println("Could you please give me your name:");
		name = scanner.nextLine();
	}
}