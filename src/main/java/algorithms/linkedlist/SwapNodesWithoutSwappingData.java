package main.java.algorithms.linkedlist;

/**
 * Created by Siddhi Parkar on 02-01-2018.
 */
public class SwapNodesWithoutSwappingData {

    public static void swap(LinkedList list, int n1, int n2) {
        Node current = list.head;
        Node fp = null;
        Node sp = null;

        Node c1 = null;
        Node c2 = null;
        Node pre = null;
        while (current != null) {
            if (current.data == n1) {
                c1 = current;
                fp = pre;
            }
            if (current.data == n2) {
                c2 = current;
                sp = pre;
            }
            pre = current;
            current = current.next;
        }

        if(c1!=null && c2!=null){
            Node next2;
            Node next1;
            next2 = c2.next;
            next1 = c1.next;
            c2.next = next1;
            if(fp!=null) fp.next = c2;
            c1.next = next2;
            if(sp!=null) sp.next = c1;

        }
    }

    public static void main(String[] args) {

    }
}
