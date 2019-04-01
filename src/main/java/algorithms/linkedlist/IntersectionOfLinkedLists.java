package main.java.algorithms.linkedlist;

public class IntersectionOfLinkedLists {
	
	public LinkedList intersection(LinkedList first, LinkedList second){
		LinkedList result = new LinkedList();
		Node firstNode = first.head;
		Node secondHead = second.head;
		
		while(firstNode!=null && secondHead!=null){
			if(firstNode.data == secondHead.data){
				result.insertNode(firstNode.data);
				secondHead = secondHead.next;
				firstNode = firstNode.next;
				
			}else if(firstNode.data < secondHead.data){
				firstNode = firstNode.next;
			}
			else {
				secondHead = secondHead.next;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertNode(6);
		list.insertNode(4);
		list.insertNode(3);
		list.insertNode(2);
		list.insertNode(1);
		
		LinkedList list2 = new LinkedList();
		list2.insertNode(8);
		list2.insertNode(6);
		list2.insertNode(4);
		list2.insertNode(2);
		
		IntersectionOfLinkedLists i = new IntersectionOfLinkedLists();
		LinkedList l = i.intersection(list, list2);
		l.print();
	}

}
