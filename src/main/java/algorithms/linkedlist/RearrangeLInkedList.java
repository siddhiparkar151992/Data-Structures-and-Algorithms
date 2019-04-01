package main.java.algorithms.linkedlist;

public class RearrangeLInkedList {

	public void rearrange(Node start, Node end) {
		if (end == null)
			return;
		rearrange(start, end.next);
		Node temp = start.next;
		start.next = end;
		start = temp;

	}

	public void rearrange(LinkedList list) {
		Node slow = list.head;
		Node fast = list.head;
		while (slow != null && fast!=null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		Node curr = slow;
		Node pre = null;
		while(curr!=null) {
			Node next = curr.next;
			curr.next = pre;
			pre = curr;
			curr = next;
		}
		Node second = pre;
		Node first =list.head;
		Node r = null;
		while(first!=null && second!=null){
			if(r == null) {
				r = first;
			}
			Node fnext = first.next;
			Node snext = second.next;
			second.next = first.next;
			first.next = second;
			first = fnext;
			second = snext;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RearrangeLInkedList r = new RearrangeLInkedList();
		LinkedList list = new LinkedList();
		list.insertNode(4, -1);
		list.insertNode(3, -1);
		list.insertNode(2, -1);
		list.insertNode(1, -1);
		r.rearrange(list);
	}

}
