package main.java.algorithms.linkedlist;

import goldmansach.DoublyLinkedList;

/**
 * Created by Siddhi Parkar on 04-03-2018.
 */
public class RotateDoublyLLByK {
    public static void rotate(DoublyLinkedList list, int k) {
        DoublyLinkedList.Node preHead = null;

        DoublyLinkedList.Node current = list.head;
        DoublyLinkedList.Node currentHead;
        DoublyLinkedList.Node chead = null;
        while (current != null) {
            DoublyLinkedList.Node pre = null;
            currentHead = current;
            int c = k;
            while (current != null && c > 0) {
                DoublyLinkedList.Node next = current.next;
                current.next = pre;
                current.pre = next;
                pre = current;
                current = next;
                c--;
            }
            if (chead == null) {
                chead = pre;
            }
            pre.pre = preHead;
            if (preHead!=null) preHead.next = pre;
            preHead = currentHead;
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(8);
        list.insert(7);
        list.insert(6);
        list.insert(5);
        list.insert(4);
        list.insert(3);
        list.insert(2);
        list.insert(1);
        rotate(list, 3);
    }
}
