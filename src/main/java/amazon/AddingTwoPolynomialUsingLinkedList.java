package main.java.amazon;

import main.java.algorithms.linkedlist.LinkedList;
import main.java.algorithms.linkedlist.Node;

public class AddingTwoPolynomialUsingLinkedList {
	
	public LinkedList addTwopolynomials(LinkedList l1, LinkedList l2){
		LinkedList list = new LinkedList();
		Node n1 = l1.head;
		Node n2 = l2.head;
		while(n1!=null || n2!=null){
			if(n1.data2 > n2.data2){
				list.insertNode(n1.data, n1.data2);
				n1 = n1.next;
			}else if(n1.data2 < n2.data2){
				list.insertNode(n2.data, n2.data2);
				n2 = n2.next;
			}else{
				list.insertNode(n1.data+n2.data, n1.data2);
				n1 = n1.next;
				n2 = n2.next;
			}
			
		}
		
		return list;
	}
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.insertNode(2, 0);
		l1.insertNode(4, 2);
		l1.insertNode(5, 3);
		
		LinkedList l2 = new LinkedList();
		l2.insertNode(5, 0);
		l2.insertNode(5, 1);
		AddingTwoPolynomialUsingLinkedList a = new AddingTwoPolynomialUsingLinkedList();
		LinkedList l = a.addTwopolynomials(l1, l2);
		l.print();
		
	}

}
