package main.java.algorithms.linkedlist;

/**
 * Created by Siddhi Parkar on 04-01-2018.
 */
public class CheckIfLinkedListIsPalindrome {

    static Node start;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertNode(1, 0);
        list.insertNode(2, 0);
        list.insertNode(3,0);
        list.insertNode(3,0);
        list.insertNode(2,0);
        list.insertNode(1,0);
        CheckIfLinkedListIsPalindrome c = new CheckIfLinkedListIsPalindrome();
        c.check(list);
    }

    private boolean checkUtil(Node node) {
        if (node == null) return true;
        boolean s = checkUtil(node.next);
        boolean isSame = node.data == start.data;
        start = start.next;
        return s && isSame;
    }

    public void check(LinkedList list) {
        start = list.head;
        Node current = list.head;
        System.out.println(checkUtil(current));
    }
}
