package main.java.amazon;

import main.java.algorithms.linkedlist.LinkedList;
import main.java.algorithms.linkedlist.Node;

public class AddNumInTwoLInkedList {

	public int getSize(LinkedList l) {
		Node current = l.head;
		int size = 0;
		while (current != null) {
			size += 1;
			current = current.next;
		}
		return size;
	}

	LinkedList result = new LinkedList();
	int carry;

	public void add(Node n1, Node n2) {
		addSameList(n1, n2);
		if (carry != 0) {
			result.insertNode(carry, -1);
		}

	}

	public void propogateCarry(LinkedList list1) {
		list1.head.data = carry;
	}

	public void addSameList(Node n1, Node n2) {
		if (n1 == null)
			return;
		addSameList(n1.next, n2.next);
		int sum = n1.data + n2.data + carry;
		carry = sum / 10;
		result.insertNode(sum % 10, -1);
	}

	public void addList(LinkedList list1, LinkedList list2) {
		int size1 = getSize(list1);
		int size2 = getSize(list2);
		if (size1 == size2) {
			int carry = 0;
			add(list1.head, list2.head);
			result.print();
		} else if (size1 < size2) {
			int toAdd = size2 - size1;
			for (int i = 0; i < toAdd; i++) {
				list1.insertNode(0, -1);
			}
			add(list1.head, list2.head);
			propogateCarry(list1);
			result.print();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();
		l1.insertNode(3, -1);
		l1.insertNode(6, -1);
		l1.insertNode(5, -1);

		LinkedList l2 = new LinkedList();
		l2.insertNode(2, -1);
		l2.insertNode(4, -1);
		l2.insertNode(8, -1);
		l2.insertNode(3, -1);
		l2.insertNode(11, -1);
		AddNumInTwoLInkedList a = new AddNumInTwoLInkedList();
		a.addList(l1, l2);
	}
}
