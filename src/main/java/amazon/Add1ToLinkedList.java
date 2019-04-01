package main.java.amazon;

import main.java.algorithms.linkedlist.LinkedList;
import main.java.algorithms.linkedlist.Node;

public class Add1ToLinkedList {

	private int carry = 1;

	public void add(Node node) {
		if (node == null) {
			return;
		}
		add(node.next);
		int sum = node.data + carry;
		node.data =  sum % 10;
		carry = sum / 10;
		
	}

	public void addToLinkedList(LinkedList list) {
		
		add(list.head);
		if(carry!=0){
			list.insertNode(carry, -1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insertNode(9, -1);
		list.insertNode(9, -1);
		list.insertNode(9, -1);
		list.insertNode(1, -1);
		Add1ToLinkedList a = new Add1ToLinkedList();
		a.addToLinkedList(list);
	}

}
