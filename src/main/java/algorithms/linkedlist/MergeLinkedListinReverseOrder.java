package main.java.algorithms.linkedlist;

/**
 * Created by Siddhi Parkar on 10-02-2018.
 */
public class MergeLinkedListinReverseOrder {
    public static void merge(LinkedList list1, LinkedList list2) {
        Node c1 = list1.head;
        Node c2 = list2.head;
        LinkedList result = new LinkedList();
        while (c1 != null && c2 != null) {
            if (c1.data < c2.data) {
                result.insertNode(c1.data, 0);
                c1 = c2.next;
            } else {
                result.insertNode(c2.data, 1);
                c2 = c2.next;
            }
        }
        while (c1!=null){
            result.insertNode(c1.data, 0);
        }
        while (c2!=null){
            result.insertNode(c2.data, 0);
        }
    }

    public static void main(String[] args) {

    }
}
