package main.java.algorithms.linkedlist;

/**
 * Created by Siddhi Parkar on 07-01-2018.
 */
public class ReverseLinkedlistInGivenSize {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertNode(8, -1);
        list.insertNode(7, -1);
        list.insertNode(6, -1);
        list.insertNode(5, -1);
        list.insertNode(4, -1);
        list.insertNode(3, -1);
        list.insertNode(2, -1);
        list.insertNode(1, -1);
        ReverseLinkedlistInGivenSize r = new ReverseLinkedlistInGivenSize();
        r.reverse(list, 3);
    }

    public void reverse(LinkedList list, int size) {
        Node head = null;
        Node preHead = null;
        Node currentHead = null;
        Node current = list.head;
        while (current != null) {
            currentHead = current;
            Node s = current;
            Node pre = null;
            int c = size;
            while (c > 0 && s != null) {
                Node next = s.next;
                s.next = pre;
                pre = s;
                s = next;
                c--;
            }
            if (head == null) {
                head = pre;
            }else{
                preHead.next = pre;
            }
            current = s;
            preHead = currentHead;
        }
        list.head = head;
        list.print();
    }
}
