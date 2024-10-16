package com.demo.example;

import java.util.Scanner;

public class Armstrong {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter The Number ");
//		int num = scanner.nextInt();
//		int b = num, c = 0;
//		while (b > 0) {
//			int d = b % 10;
//			c += d * d * d;
//			b = b / 10;
//		}
//		if (c == num) {
//			System.out.println("Armstrong");
//		} else {
//			System.out.println("Not Armstrong");
//		}
//		scanner.close();
//	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = scanner.nextInt();
		int b = a, c = 0;
		while (b > 0) {
			int d = b % 10;
			c += d * d * d;
			b = b / 10;
		}
		if (c == a) {
			System.out.println("Number is Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}
		scanner.close();
	}
}
