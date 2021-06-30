package com.hcl.day4;

public class MiddleCharacter {
	static void displayMidChar(String s) {
		if (s.length() % 2 == 1) {
			System.out.printf("Middle character of the string: %c\n", s.charAt(s.length() / 2));
		} else {
			System.out.printf("Middle characters of the string: %c%c\n", s.charAt(s.length() / 2),
					s.charAt(s.length() / 2 + 1));
		}
	}
}
