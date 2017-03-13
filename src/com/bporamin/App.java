package com.bporamin;

public class App {

	public static void main(String[] args) {
		
		System.out.println(stringE("Hello"));
		System.out.println(stringE("Heelle"));
		System.out.println(stringE("Heelele"));

		int all = 10;
		System.out.print("prime number :");
		for (int i = 1; i < all; i++) {
			if (isPrimeNumber(i))
				System.out.print(" " + i);
		}
		System.out.print("\nfibo number :");
		for (int i = 1; i < all; i++) {
			System.out.print(" " + fibo(i));
		}
		
		System.out.print("\nfact number :");
		for (int i = 1; i < all; i++) {
			System.out.print(" " + factorial(i));
		}

		
	}

	public static boolean stringE(String str) {
		int count = str.split("e", -1).length-1;
		System.out.println("String: "+str+", Count: "+count);
		if (count <= 3)
			return true;
		else
			return false;
	}

	public static boolean isPrimeNumber(int num) {

		if (num == 1 || num == 2)
			return true;
		if (num % 2 == 0)
			return false;

		for (int i = 3; i < num; i += 2) {
			if (num % i == 0)
				return false;
		}

		return true;

	}

	public static int fibo(int n) {
		if (n <= 1)
			return n;
		else
			return fibo(n - 1) + fibo(n - 2);
	}

	public static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return n * (factorial(n - 1));
	}
}
