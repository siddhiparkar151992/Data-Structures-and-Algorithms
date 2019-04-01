package main.java.algorithms.linkedlist;

public class DeleteANodeInLinkedList {

	public static void delete(Node node, LinkedList list) {
		Node next = node.next;
		Node n = null;
		if(next!=null) n = next.next;
		int temp = next.data;
		next.data = node.data ;
		node.data = temp;
		node.next = n;
		System.out.println(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l= new LinkedList();
		l.insertNode(10, -1);
		l.insertNode(20, -1);
		l.insertNode(30, -1);
		l.insertNode(40, -1);
		
		Node temp = l.head.next;
		delete(temp, l);
		
	}

}
