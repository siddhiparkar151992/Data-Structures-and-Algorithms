package main.java.amazon;

import main.java.algorithms.linkedlist.LinkedList;
import main.java.algorithms.linkedlist.Node;

public class PointToNextHigherValueInLinkedList {

	public Node getMiddle(Node start, Node end) {
		Node slow = start;
		Node fast = start;
		if (start.next == end)
			return start;
		while (slow != null && fast != null && fast.next != null) {
			if (end != null && fast == end) {
				break;
			}
			slow = slow.next;

			fast = fast.next.next;
		}
		return slow;
	}

	public Node merge(Node left, Node right) {
		Node r = null;
		if (left == null)
			return right;
		if (right == null)
			return left;
		if (left.data <= right.data) {
			r = left;
		} else {
			r = right;
		}
		return r;
	}

	public Node mergeSort(Node start, Node end) {
		Node e = end;
		if (start == null || start.next == null || start.data == end.data)
			return start;
		Node pivot = getMiddle(start, e);
		Node l = mergeSort(start, pivot);
		Node r = mergeSort(pivot.next, e);
		Node s = merge(l, r);
		return s;
	}

	public void pointToNextNode(LinkedList list) {
		Node end = list.head;
		while (end != null) {
			if (end.next == null)
				break;
			end = end.next;
		}
		Node r = mergeSort(list.head, end);
		System.out.println(r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insertNode(6, -1);
		list.insertNode(2, -1);
		list.insertNode(3, -1);
		list.insertNode(1, -1);
		PointToNextHigherValueInLinkedList p = new PointToNextHigherValueInLinkedList();
		p.pointToNextNode(list);
	}

}
