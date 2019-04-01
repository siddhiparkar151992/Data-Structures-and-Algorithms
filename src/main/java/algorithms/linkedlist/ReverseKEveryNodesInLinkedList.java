package main.java.algorithms.linkedlist;

/**
 * Created by Siddhi Parkar on 28-01-2018.
 */
public class ReverseKEveryNodesInLinkedList {
    public static void reverse(LinkedList list, int k) {
        Node current = list.head;
        Node head = null;
        Node preHead = null;
        Node currentHead = null;
        while (current != null) {
            int c = 0;
            currentHead = current;
            Node pre = null;
            while (c < k) {
                Node next = current.next;
                current.next = pre;
                pre = current;
                current = next;
                c++;
            }
            if (head == null) {
                head = pre;
            } else {
                preHead.next = pre;
            }
            preHead = currentHead;
        }
        list.print();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertNode(9, 0);
        list.insertNode(8, 0);
        list.insertNode(7, 0);
        list.insertNode(6, 0);
        list.insertNode(5, 0);
        list.insertNode(4, 0);
        list.insertNode(3, 0);
        list.insertNode(2, 0);
        list.insertNode(1, 0);
        reverse(list, 3);
    }
}
