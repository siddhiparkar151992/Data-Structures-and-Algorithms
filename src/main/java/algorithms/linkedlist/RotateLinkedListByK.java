package main.java.algorithms.linkedlist;

/**
 * Created by Siddhi Parkar on 26-01-2018.
 */
public class RotateLinkedListByK {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        // create a list 10->20->30->40->50->60
        for (int i = 60; i >= 10; i -= 10)
            llist.insertNode(i, 0);
        rotate(llist, 4);
    }

    public static void rotate(LinkedList list, int k) {
        int c = 0;
        Node head = list.head;
        Node preHead = list.head;
        Node current = list.head;
        Node pre = null;
        while (c < k) {
            pre = current;
            current = current.next;
            c++;
        }
        pre.next = null;
        head = current;
        Node p = current;
        while (current != null) {
            p= current;
            current = current.next;
        }
        p.next = preHead;
        System.out.print(head);
    }
}
