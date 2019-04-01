package main.java.algorithms.linkedlist;

public class ReverseALinkedList {
	
	public static void reverseLinkedList(LinkedList l){

		Node current = l.head;
		Node prev = null;
		Node next = null;
		while(current!=null){
			next = current.next;
			current.next = prev;
			prev=  current;
			current = next;
		}
		l.head = prev;
		l.print();
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        ReverseALinkedList r = new ReverseALinkedList();
        r.reverseLinkedList(list);
//        list.print();
	}

}
