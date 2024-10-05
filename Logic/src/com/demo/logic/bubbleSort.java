package com.demo.logic;

import java.util.Scanner;

public class bubbleSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number Of Element: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter " + n + " Elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted Array: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
