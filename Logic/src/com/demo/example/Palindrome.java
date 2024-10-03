package com.demo.example;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scanner.nextInt();
		int b = 0, c = num;
		while (num != 0) {
			int d = num % 10;
			b = b * 10 + d;
			num /= 10;
		}
		System.out.println(c == b ? "Palindrome" : "Not Palindrome");
		scanner.close();
	}
}
