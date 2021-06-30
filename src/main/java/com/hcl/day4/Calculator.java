package com.hcl.day4;

public class Calculator {
	public static int add(int a, int b) {
		return Math.addExact(a, b);
	}

	// Overload add method to support both ints and doubles
	public static double add(double a, double b) {
		return Double.sum(a, b);
	}

	public static int subtract(int a, int b) {
		return Math.subtractExact(a, b);
	}

	public static int multiply(int a, int b) {
		return Math.multiplyExact(a, b);
	}
}
