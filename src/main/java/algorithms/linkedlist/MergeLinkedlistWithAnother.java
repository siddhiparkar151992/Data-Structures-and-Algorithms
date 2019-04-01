package main.java.algorithms.linkedlist;

/**
 * Created by Siddhi Parkar on 28-01-2018.
 */
public class MergeLinkedlistWithAnother {
    public static void main(String[] args) {
        LinkedList llist1 = new LinkedList();
        LinkedList llist2 = new LinkedList();
        llist1.insertNode(3, 0);
        llist1.insertNode(2, 0);
        llist1.insertNode(1, 0);

        System.out.println("First Linked List:");
        llist1.print();

        llist2.insertNode(8, 0);
        llist2.insertNode(7, 0);
        llist2.insertNode(6, 0);
        llist2.insertNode(5, 0);
        llist2.insertNode(4, 0);
        System.out.println("Second Linked List:");
        llist2.print();

        merge(llist1, llist2);
    }

    public static void merge(LinkedList list1, LinkedList list2) {
        Node c1 = list1.head;
        Node pre1 = null;
        Node pre2 = null;
        Node c2 = list2.head;
        while (c1 != null && c2 != null) {
            Node next1 = c1.next;
            Node next2 = c2.next;
            c2.next = next1;
            c1.next = c2;
            pre1 = c1;
            pre2 = c2;
            c1 = next1;
            c2 = next2;
        }

        if (c1 != null) {
            pre1.next = c1;
            c1 = c1.next;
        }
        if (c2 != null) {
            pre2.next = c2;
            c2 = c2.next;
        }
        System.out.println("Resultant Linked List:");

        list1.print();
    }
}
