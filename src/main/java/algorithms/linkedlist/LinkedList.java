package main.java.algorithms.linkedlist;

public class LinkedList {
	public Node head;

	
	private void insert(Node toInsert) {
		toInsert.next = head;
		head = toInsert;
	}

	public void insertAfter(int toInsert, int after, int data2) {
		insertAfter(head, toInsert, after,data2);
	}

	private void insertAfter(Node current, int after, int toInsert, int data2) {
		if(current.data == after){

			Node insert = new Node(toInsert);
			insert.next = current.next;
			current.next = insert;
			return;
		}
		
		insertAfter(current.next, after, toInsert, data2);
		
	}
	
	public void insertAtEnd(int d, int d2){
		insertAtEnd(d, head, d2);
	}
	private void insertAtEnd(int data, Node currentNode, int data2) {
		if (currentNode.next == null) {
			Node toInsert = new Node(data);
			currentNode.next = toInsert;
			return;
		}
		insertAtEnd(data, currentNode.next, data2);
	}

	public void insertNode(int data, int data2) {
		Node n = new Node(data);
		insert(n);
	}

	public void print() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " " +current.data2);
			System.out.println();
			current = current.next;
		}
	}

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.insertNode(1, 0);
		l.insertNode(2, 0);
		l.insertNode(3, 0);
		l.insertNode(4, 0);
		l.print();
		System.out.println("----------------------------------");
		l.insertAfter(3,70, 0);
		l.print();
		System.out.println("----------------------------------");
		l.insertAtEnd(56, 0);
		l.print();
	}

	public void insertNode(int i) {
	}
}
