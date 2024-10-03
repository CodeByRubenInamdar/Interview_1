package com.demo.example;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int num = sc.nextInt();

		if (isPrime(num)) {
			System.out.println(num + " Number is prime");
		} else {
			System.out.println(num + " Number is not prime");
		}
		sc.close();
	}

	public static boolean isPrime(int num) {
		if (num == 0)
			return false;
		for (int i = 2; i <= num; i++) {
			if (num % 2 == 0)
				return false;
		}
		return true;
	}

}
