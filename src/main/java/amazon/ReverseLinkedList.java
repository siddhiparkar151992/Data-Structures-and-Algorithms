package main.java.amazon;

import main.java.algorithms.linkedlist.LinkedList;
import main.java.algorithms.linkedlist.Node;

/**
 * Created by Siddhi Parkar on 23-11-2017.
 */
public class ReverseLinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertNode(4, -1);
        list.insertNode(3, -1);
        list.insertNode(2, -1);
        list.insertNode(1, -1);

        ReverseLinkedList r = new ReverseLinkedList();
        r.reverse(list);
    }

    public class R{
        Node node;
    }

    R r = new R();
    public Node reverse(Node node, Node preNode) {
        if (node == null) return node;
        Node rnode = reverse(node.next, node);
        if(r.node == null) {
            r.node = rnode;
        }
        node.next = preNode;
        return node;
    }

    public Node reverse(LinkedList list) {
        Node node = reverse(list.head, null);
        return r.node;
    }
}
