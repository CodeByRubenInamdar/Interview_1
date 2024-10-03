package com.demo.example;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = scanner.nextInt();
		
		int a=0,b=1;
		System.out.println(a+" "+b);
		for(int i=1;i<num;i++) {
			int c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
		scanner.close();
	}

}
