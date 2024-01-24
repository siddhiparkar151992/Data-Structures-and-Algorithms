package main.java.amazon;


import main.java.algorithms.linkedlist.LinkedList;
import main.java.algorithms.linkedlist.Node;

public class MaximumSumLinkedListTwoSortedList {

	public Node getMaxSumLL(LinkedList l1, LinkedList l2) {
		if (l1 == null)
			return l2.head;
		if (l2 == null)
			return l1.head;
		Node currentPointer1 = l1.head;
		Node currentPointer2 = l2.head;

		Node pre1 = l1.head;
		Node pre2 = l2.head;

		Node resultNode = null;

		while (currentPointer1 != null || currentPointer2 != null) {
			int currentSuml1 = 0;
			int currentSuml2 = 0;

			while (currentPointer1 != null && currentPointer2 != null && currentPointer1.data != currentPointer2.data) {
				if (currentPointer1.data > currentPointer2.data) {
					currentSuml2 += currentPointer2.data;
					currentPointer2 = currentPointer2.next;
				} else {
					currentSuml1 += currentPointer1.data;
					currentPointer1 = currentPointer1.next;
				}

			}

			if (currentPointer1 == null) {
				while (currentPointer2 != null) {
					currentSuml2 += currentPointer2.data;
					currentPointer2 = currentPointer2.next;
				}
			}
			if (currentPointer2 == null) {
				while (currentPointer1 != null) {
					currentSuml1 += currentPointer1.data;
					currentPointer1 = currentPointer1.next;
				}
			}
			if (pre1 == l1.head && pre2 == l2.head) {
				resultNode = (currentSuml1 > currentSuml2) ? pre1 : pre2;
			} else {
				if (currentSuml1 > currentSuml2) {
					pre2.next = pre1.next;
				} else {
					pre1.next = pre2.next;
				}
			}

			pre1 = currentPointer1;
			pre2 = currentPointer2;

			if (currentPointer1 != null)
				currentPointer1 = currentPointer1.next;
			if (currentPointer2 != null)
				currentPointer2 = currentPointer2.next;

		}
		return resultNode;
	}

	public static void main(String[] args) {
		LinkedList llist1 = new LinkedList();
		LinkedList llist2 = new LinkedList();

		// Linked List 1 : 1->3->30->90->110->120->NULL
		// Linked List 2 : 0->3->12->32->90->100->120->130->NULL

		llist1.insertNode(120, -1);
		llist1.insertNode(110, -1);
		llist1.insertNode(90, -1);
		llist1.insertNode(30, -1);
		llist1.insertNode(3, -1);
		llist1.insertNode(1, -1);

		llist2.insertNode(130, -1);
		llist2.insertNode(120, -1);
		llist2.insertNode(100, -1);
		llist2.insertNode(90, -1);
		llist2.insertNode(32, -1);
		llist2.insertNode(12, -1);
		llist2.insertNode(3, -1);
		llist2.insertNode(0, -1);
		MaximumSumLinkedListTwoSortedList m = new MaximumSumLinkedListTwoSortedList();
		Node n = m.getMaxSumLL(llist1, llist2);
		LinkedList l = new LinkedList();
		l.head = n;
		l.print();
	}

}
