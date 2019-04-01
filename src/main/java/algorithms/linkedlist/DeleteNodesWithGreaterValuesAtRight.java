package main.java.algorithms.linkedlist;

/**
 * Created by Siddhi Parkar on 07-01-2018.
 */
public class DeleteNodesWithGreaterValuesAtRight {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        /* Constructed Linked List is 12->15->10->11->
           5->6->2->3 */
        llist.insertNode(3, 0);
        llist.insertNode(2, 0);
        llist.insertNode(6, 0);
        llist.insertNode(5, 0);
        llist.insertNode(11, 0);
        llist.insertNode(10, 0);
        llist.insertNode(15, 0);
        llist.insertNode(12, 0);
        llist = delete(llist);
        llist.print();
    }

    public static LinkedList delete(LinkedList list) {
        ReverseALinkedList.reverseLinkedList(list);
        int maxTillNow = 0;
        Node start = list.head;
        Node pre = null;
        Node head= null;
        while (start != null) {

            if (start.data < maxTillNow) {
                if(start.next ==null){
                    pre.next = null;
                }
            } else {
                if (pre == null) {
                    pre = start;
                    head = pre;
                } else {
                    pre.next = start;
                    pre = pre.next;

                }
            }
            maxTillNow = Math.max(start.data, maxTillNow);
            start = start.next;
        }
        list.head = head;
        return list;
    }
}
