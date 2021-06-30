package com.hcl.day4;

public class App {
	public static void main(String[] args) {
		System.out.println("============= 1. =============");
		System.out.println("Exercise 1 tested with JUnit.\n"
				+ "To run unit tests in eclipse, right click the project and select Run As > JUnit Test");
		System.out.println("============= 3. =============");
		MiddleCharacter.displayMidChar("This string has middle character i.");
		MiddleCharacter.displayMidChar("This string has two characters in the middle");
		System.out.println("============= 4. =============");
		int vowelCount = VowelCounter.countVowels("Please COUNT the VOWELS in this string! (11)");
		System.out.printf("Number of vowels: %d\n", vowelCount);
		System.out.println("============= 5. =============");
		System.out.printf("5 + 3 = %d\n" + "5.4 + 3.25 = %.2f\n" + "5 - 3 = %d\n" + "5 * 3 = %d\n",
				Calculator.add(5, 3), Calculator.add(5.4, 3.25), Calculator.subtract(5, 3), Calculator.multiply(5, 3));
	}

}