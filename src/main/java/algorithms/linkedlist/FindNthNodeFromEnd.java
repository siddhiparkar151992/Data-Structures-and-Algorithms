package main.java.algorithms.linkedlist;

public class FindNthNodeFromEnd {

	public Node getNthNodeFromEnd(int n, LinkedList l) {
		Node refPtr = l.head;
		Node mainPtr = l.head;
		int count = 0;
		while (count < n) {
			refPtr = refPtr.next;
			count++;
		}

		while (refPtr != null) {
			refPtr= refPtr.next;
			mainPtr= mainPtr.next;
		}
		System.out.println(mainPtr.data);
		return mainPtr;
	}

	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		llist.insertNode(20);
        llist.insertNode(4);
        llist.insertNode(15);
        llist.insertNode(35);
        FindNthNodeFromEnd f = new FindNthNodeFromEnd();
        f.getNthNodeFromEnd(4, llist);
 
	}
}
