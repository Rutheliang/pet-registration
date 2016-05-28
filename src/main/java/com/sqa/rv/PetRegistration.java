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
	static String[] petNames, petAddresses, petCities, petStates, petRegPrices, petDOBs;
	static int petCount;

	public static void registerPets() {
		initApplication();
		retrieveUserName();
		displayNumberOfDetails();
		initPetDetailArrays();
		retrieveAllPetDetails();
		displayPetDetails();
		exitApplication();

		// char [] myLettersA;
		// myLetters = new char [5]

	}

	/**
	 * 
	 */

	private static void displayPetDetails() {
		displayPetDetails();
	}

	private static void displayPetDetails(int petIndex) {
		System.out.println("\nPet Details");
		System.out.println("-------------------------------");
		System.out.println("Name: + petNames(petIndex)");
		System.out.println("XXXXX(petIndex)");
		System.out.println("XXXXX(petIndex)");
		System.out.println("XXXXX(petIndex)");
		System.out.println("XXXXX(petIndex)");
		System.out.println("XXXXX(petIndex)");
	}

	private static void exitApplication() {
		System.out.println("Thank you for using the Pet Registration Application");
		System.out.println("Good bye " + name);
	}

	private static void initApplication() {
		scanner = new Scanner(System.in);
		System.out.println("Welcome to the Pet Registration Application");
	}

	private static void initPetDetailArrays() {
		petNames = new String[petCount];
		petAddresses = new String[petCount];
	}

	private static int obtainString(String question) {
		boolean validData = false;
		String input;
		int value = 0;
		while (!validData) {
			System.out.print(question);
			input = scanner.nextLine();
			value = Integer.parseInt(input);
			validData = true;
		} catch (NumberFormatException e) {
			System.out.print("You must supply a valid number character. (" + input + ")");
		}
			return input;
	}

	private static void retrieveNumberOfPets() {
		petCount = obtainInt("How many pets would you like to register?");
	}

	/**
	 * 
	 */
	private static void retrieveAllPetDetails() {
		retrievePetDetails(2);
	}

	private static void retrievePetDetails(int pet index) {
		petNames = obtainString("What is your pets name:");
		petAddresses = obtainString("What is you address:");
		petCities = obtainString("XXXX");
		petStates = obtainString("XXXX");
		petRegPrices = obtainString("XXXX");
		petDOBs = obtainString("XXXX");
	}

	private static void retrieveUserName() {
		System.out.println("Could you please give me your name:");
		name = scanner.nextLine();
	}
}