package main.java.algorithms.linkedlist;


public class DeleteNodeAtGivenPosition {

	public void pushElementAtGivenPosition(int position, LinkedList list, int data) {
		int count = 1;
		Node currentNode = list.head;
		Node previous = null;
		while (currentNode != null) {
			if (count == position) {
				Node nextNode = currentNode.next;
				previous.next = nextNode;
				break;
			}
			count += 1;
			previous = currentNode;
			currentNode = currentNode.next;
		}
	}

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.insertNode(1);
		l.insertNode(2);
		l.insertNode(3);
		l.insertNode(4);
		l.insertNode(5);
		l.insertNode(6);
		l.print();
		System.out.println("----------------------------------");
		DeleteNodeAtGivenPosition d= new DeleteNodeAtGivenPosition();
		d.pushElementAtGivenPosition(6, l, 100);
		l.print();
	}
}
