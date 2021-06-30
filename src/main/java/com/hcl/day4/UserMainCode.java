package com.hcl.day4;

public class UserMainCode {

	static int checkCharacters(String s) {
		if (s.charAt(0) == s.charAt(s.length() - 1)) {
			return 1;
		} else {
			return -1;
		}
	}
}
