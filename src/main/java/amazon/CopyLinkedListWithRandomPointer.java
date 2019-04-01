package main.java.amazon;

public class CopyLinkedListWithRandomPointer {
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
				System.out.print(current.data + " " + current.arbitary);
				System.out.println();
				current = current.next;
			}
		}

	}

	public void copyLinkedList(LinkedList list) {
		Node current = list.head;
		while (current != null) {
			Node temp = current.next;
			current.next = new Node(temp.data);
			current.next.next = temp;
			current = temp;
		}

		current = list.head;

		while (current != null) {
			current.next.arbitary = current.arbitary.next;
			current = current.next != null ? current.next.next : current.next;
		}
		Node original = list.head;
		Node copy = list.head.next;
		Node temp = copy;
		while (original != null && copy != null) {
			original.next = original.next != null ? original.next.next : original.next;
			copy.next = copy.next!=null ? copy.next.next : copy.next;
			original = original.next;
			copy = copy.next;
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
