package main.java.amazon;

import main.java.algorithms.linkedlist.LinkedList;
import main.java.algorithms.linkedlist.Node;

public class ReverseLinkedListInPair {

	public void reverseLinkedList(Node node, int k) {
		Node pre = null;
		Node current = node;
		int m = k;
		Node thisHead = null;
		Node preHead = null;
		while (current != null) {
			thisHead = current;
			Node next = null;
			pre = null;
			while (current!=null && m > 0) {
				next = current.next;	
				current.next = pre;
				pre = current;
				current = next;
				m--;
			}
			m = k;
			if(preHead == null){
				node = pre;
			}else{
				preHead.next = pre;
			}
			preHead = thisHead;
			
		}
		System.out.println(pre);
	}

	public static void main(String[] args) {
		// TODO Aut	o-generated method stub
		LinkedList list = new LinkedList();
		list.insertNode(5, -1);
		list.insertNode(4, -1);
		list.insertNode(3, -1);
		list.insertNode(2, -1);
		list.insertNode(1, -1);
		ReverseLinkedListInPair r = new ReverseLinkedListInPair();
		r.reverseLinkedList(list.head, 2);
	}

}
