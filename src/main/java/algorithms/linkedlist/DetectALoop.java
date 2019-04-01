package main.java.algorithms.linkedlist;

public class DetectALoop {
	
	public void detectLoop(LinkedList list){
		Node slow = list.head;
		Node fast = list.head;
		boolean found= false;
		while(slow!=null && fast!=null && fast.next !=null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast){
				found = true;
				System.out.println("found");
				break;
			}
		}
		if(!found) System.out.println("not found");
	}
	public static void main(String[] args){
		LinkedList llist = new LinkedList();
		 
        llist.insertNode(20);
        llist.insertNode(4);
        llist.insertNode(15);
        llist.insertNode(10);
         
        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;
        DetectALoop d = new DetectALoop();
        d.detectLoop(llist);
	}
}
