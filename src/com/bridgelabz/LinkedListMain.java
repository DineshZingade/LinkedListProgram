package com.bridgelabz;

import java.util.Scanner;

public class LinkedListMain {

	public static void main(String[] args) {

		System.out.println("Welcome to Linked List Program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the option: \n1. Add the data.\n2. Append the data.\n3. Insert in between.");

		switch (sc.nextInt()) {
		case 1:
			Operations.addDataAtStart();
			break;
		case 2:
			Operations.append();
			break;
		case 3:
			Operations.insertInBetween();
			break;
		}
	}
}