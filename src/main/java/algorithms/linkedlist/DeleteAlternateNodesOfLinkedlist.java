package main.java.algorithms.linkedlist;

/**
 * Created by Siddhi Parkar on 05-01-2018.
 */
public class DeleteAlternateNodesOfLinkedlist {

    public static void alter(LinkedList list) {
        Node head = list.head;
        Node first = head;
        Node second = head.next;
        while (first != null && first.next != null) {
            first.next = first.next.next;
        }
        while (second != null && second.next != null) {
            second.next = second.next.next;
        }

        System.out.print(second);
    }

    public static Node delete(LinkedList list) {
        Node pre = list.head;
        Node current = list.head;
        while (current != null && current.next != null) {
            pre.next = current.next.next;
            pre = pre.next;
            current = current.next;
        }
        return list.head;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertNode(1, 0);
        list.insertNode(2, 0);
        list.insertNode(3, 0);
        list.insertNode(4, 0);
        list.insertNode(5, 0);
        list.insertNode(6, 0);
        list.insertNode(7, 0);
        list.insertNode(8, 0);
        delete(list);
        alter(list);
    }
}
