package main.java.algorithms.linkedlist;


/**
 * Created by Siddhi Parkar on 05-01-2018.
 */
public class MergeSort {

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        LinkedList list = new LinkedList();
        list.insertNode(2, 0);
        list.insertNode(8, 0);
        list.insertNode(5, 0);
        list.insertNode(1, 0);
        list.insertNode(4, 0);
        list.insertNode(6, 0);
        list.insertNode(3, 0);
        list.insertNode(7, 0);
        mergeSort.sort(list);
    }

    private Node getMiddle(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node slow = node;
        Node fast = node.next;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node sortedMerge(Node a, Node b) {
        Node r = null;
        Node aN = a;
        Node bN = b;
        while (aN != null && bN != null) {
            if (aN.data < bN.data) {
                Node next = aN.next;
                aN.next = bN;
                if (r == null) {
                    r = aN;
                }
                aN = next;
            } else {
                Node next = bN.next;
                bN.next = aN;
                if (r == null) {
                    r = bN;
                }
                bN = next;
            }
        }

        return r;
    }

    private Node mergeSort(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node middle = getMiddle(node);
        Node nextToMiddle = middle.next;
        middle.next = null;
        Node left = mergeSort(node);
        Node right = mergeSort(nextToMiddle);
        return sortedMerge(left, right);
    }

    public void sort(LinkedList list) {
        Node head = list.head;
        Node n =mergeSort(list.head);
        System.out.println(head);
    }
}
