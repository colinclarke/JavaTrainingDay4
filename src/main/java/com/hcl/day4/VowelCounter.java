package com.hcl.day4;

public class VowelCounter {
	static int countVowels(String s) {
		s = s.toLowerCase();
		int vcount = 0;
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vcount++;
			}
		}
		return vcount;
	}
}
