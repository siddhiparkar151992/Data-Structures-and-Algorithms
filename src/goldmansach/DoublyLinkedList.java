package goldmansach;

public class DoublyLinkedList {

	public Node head;

	public class Node {
		public Node next;
		public Node pre;
		public int data;

		public Node(int val) {
			data = val;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + "]";
		}

	}

	public void insert(int val) {
		if (head == null) {
			head = new Node(val);
		} else {
			Node temp = new Node(val);
			head.pre = temp;
			temp.next = head;
			head = temp;
		}
	}

	public void removeLoop() {
		Node slow = head;
		Node fast = head;
		Node pre = null;
		while(slow!=null && fast !=null && fast.next !=null){
			pre = slow;
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				break;
			}
		}
		pre.next = null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList d = new DoublyLinkedList();
		d.insert(2);
		d.insert(3);
		d.insert(4);
		d.insert(5);
		d.insert(6);
		d.head.next.next.next.next = d.head;
		d.removeLoop();
	}

}
