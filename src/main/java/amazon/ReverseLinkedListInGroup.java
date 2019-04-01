package main.java.amazon;

import main.java.algorithms.linkedlist.LinkedList;
import main.java.algorithms.linkedlist.Node;

public class ReverseLinkedListInGroup {

	private Node reverse(Node node, int k) {
		Node current = node;
		Node pre = null;
		Node next = null;
		Node thishead = null;
		Node preHead = null;
		int count = 0;
		while (current != null) {
			count = 0;
			thishead = current;
			pre = null;
			while (count < k && current != null) {
				next = current.next;
				current.next = pre;
				pre = current;
				current = next;
				count++;
			}
			if(preHead!=null){
				preHead.next = pre;
			}else{
				node = pre;
			}
			preHead = thishead;
		}

		return pre;
	}

	public void reverse(LinkedList list, int k) {
		reverse(list.head, k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insertNode(8, 0);
		list.insertNode(7, 0);
		list.insertNode(6, 0);
		list.insertNode(5, 0);
		list.insertNode(4, 0);
		list.insertNode(3, 0);
		list.insertNode(2, 0);
		list.insertNode(1, 0);
		ReverseLinkedListInGroup r = new ReverseLinkedListInGroup();
		r.reverse(list, 3);
		list.print();
	}

}
