package com.demo.example;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int n = sc.nextInt();

		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
//			System.out.println("Factorial is " + fact);
		}
		System.out.println("Factorial of " + n + " is " + fact + ".");
		sc.close();
	}
}
