package main.java.algorithms.linkedlist;

/**
 * Created by Siddhi Parkar on 09-01-2018.
 */
public class DetectAndRemoveLoopInLL {
    public static void detect(LinkedList list) {
        Node fast = list.head;
        Node slow = list.head;
        while (slow != null && fast != null && fast.next != null) {
            if (slow == fast) {
                break;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        Node c = list.head;
        Node loop = slow;
        while (true) {
            Node ptr2 = loop;
            while (ptr2 != null && ptr2 != c) {
                ptr2 = ptr2.next;
            }
            if (ptr2 == c) {
                break;
            }
            c = c.next;
        }


    }

    public static void main(String[] args) {

    }
}
