package main.java.algorithms.linkedlist;

public class MergeTwoSortedLinkedLists {
	
	public void mergeSortedLinkedLists(LinkedList l1, LinkedList l2){
		Node first = l1.head;
		Node second = l2.head;
		
		while(l1!=null || l2!=null){
			if(second.data <= first.data){
				
			}
			else{
				first = first.next;
			}
		}
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
	}

}
