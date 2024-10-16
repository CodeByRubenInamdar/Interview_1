package com.collection.Queqe;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeqe {

	public static void main(String[] args) {
		Deque<String> dq1 = new LinkedList<>();
		dq1.add("Ruben");
		dq1.add("Shivani");
		dq1.add("Mayur");
		dq1.add("Aditya");
		dq1.add("Chutan");

		System.out.println("Queqe: " + dq1 + "\nSize: " + dq1.size());

		String First = dq1.peek();
		String Last = dq1.peek();
		System.out.println("First: " + First);
		System.out.println("Last: " + Last);

		String ref = dq1.removeFirst();
		String rel = dq1.removeLast();

		System.out.println("Remove First: " + ref);
		System.out.println("Remove Last: " + rel);

		System.out.println("After Removeing The Queqe: " + dq1);

		System.out.println(
				"First Peek: " + dq1.peek() + "\nknow First Element: " + dq1.peekFirst() + "\nLast: " + dq1.peekLast());
	}

}
