package main.java.amazon;

import java.util.HashMap;
import java.util.Map;

public class CloneLinkedlistWithRandomAndNextPointer {
	public class Node {
		Node next;
		Node arbitary;
		int data;

		public Node(int data) {
			this.data = data;
		}
	}

	public class LinkedList {

		public Node head;

		private void insert(Node toInsert) {
			toInsert.next = head;
			head = toInsert;
		}

		public void insertNode(int data) {
			Node n = new Node(data);
			insert(n);
		}

		public void print() {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + " "+current.arbitary);
				System.out.println();
				current = current.next;
			}
		}

	}

	public void cloneList() {
		LinkedList list = new LinkedList();
		list.insertNode(5);
		list.insertNode(4);
		list.insertNode(3);
		list.insertNode(2);
		list.insertNode(1);

		// Setting up random references.
		list.head.arbitary = list.head.next.next;
		list.head.next.arbitary = list.head.next.next.next;
		list.head.next.next.arbitary = list.head.next.next.next.next;
		list.head.next.next.next.arbitary = list.head.next.next.next.next.next;
		list.head.next.next.next.next.arbitary = list.head.next;
		Map<Node, Node> map = new HashMap<>();
		Node current = list.head;
		Node clonecurr = null;
		while (current != null) {
			clonecurr = new Node(current.data);
			map.put(current, clonecurr);
			current = current.next;
		}

		current = list.head;

		while (current != null) {
			clonecurr = map.get(current);
			clonecurr.next = map.get(current.next);
			clonecurr.arbitary = map.get(current.arbitary);
			current = current.next;

		}
		LinkedList l = new LinkedList();
		l.head = map.get(list.head);
		l.print();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CloneLinkedlistWithRandomAndNextPointer c = new CloneLinkedlistWithRandomAndNextPointer();
		c.cloneList();
	}

}
