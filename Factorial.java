package org.recursion;

public class Factorial {

	private int factorialRecursive(int n) {
		if (n == 2) return 2;
		else return n * factorialIterative(n - 1);
	}

	private int factorialIterative(int n) {
		int f = 1;

		for (int i = n; i > 1; i--) {
			f *= i;
		}

		return f;
	}

	public static void main(String [] args) {
		Factorial f = new Factorial();

		System.out.println("factorialIterative: " + f.factorialIterative(10));
		System.out.println("factorialRecursive: " + f.factorialRecursive(10));
	}

}
