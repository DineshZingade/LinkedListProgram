package com.bridgelabz;

public class Operations {

	public static void addDataAtStart() {

		LinkedList linkedList = new LinkedList();
		linkedList.push(70);
		linkedList.push(30);
		linkedList.push(56);
		linkedList.print();
	}

	public static void append() {
		LinkedList linkedList = new LinkedList();
		linkedList.append(56);
		linkedList.append(30);
		linkedList.append(70);
		linkedList.print();
	}

	public static void insertInBetween() {
		LinkedList linkedList = new LinkedList();
		Node secondNode = linkedList.push(70);
		Node firstNode = linkedList.push(56);
		Node newNode = new Node(30);
		System.out.println("Before: ");
		linkedList.print();
		linkedList.insertInBetween(firstNode, newNode);
		System.out.println("\nAfter: ");
		linkedList.print();
	}
}