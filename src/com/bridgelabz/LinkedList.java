package com.bridgelabz;

public class LinkedList {

	Node head;
	Node tail;

	public Node push(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			this.head = newNode;
			newNode.next = temp;
		}
		return newNode;
	}

	public void print() {

		if (head == null) {
			System.out.println("Linked List is Empty");
		} else {
			Node temp = head;

			while (temp != null) {
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
		}
	}

	public void append(int data) {
		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			this.tail.next = newNode;
			tail = newNode;
		}
	}

	public void insertInBetween(Node previousNode, Node newNode) {
		Node tempNode = previousNode.next;
		previousNode.next = newNode;
		newNode.next = tempNode;
	}
}