package main.java.algorithms.linkedlist;

// Java program to clone a linked list with random pointers

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// Linked List LinkedNode class
class LinkedNode {
    int data;//LinkedNode data
    LinkedNode next, random;//Next and random reference

    //LinkedNode constructor
    public LinkedNode(int data) {
        this.data = data;
        this.next = this.random = null;
    }
}

// linked list class
class LList {
    LinkedNode head;//Linked list head reference

    // Linked list constructor
    public LList(LinkedNode head) {
        this.head = head;
    }

    // push method to put data always at the head
    // in the linked list.
    public void push(int data) {
        LinkedNode node = new LinkedNode(data);
        node.next = this.head;
        this.head = node;
    }

    // Method to print the list.
    void print() {
        LinkedNode temp = head;
        while (temp != null) {
            LinkedNode random = temp.random;
            int randomData = (random != null) ? random.data : -1;
            System.out.println("Data = " + temp.data +
                    ", Random data = " + randomData);
            temp = temp.next;
        }
    }


}

public class CloneALinkedListWithRandomPointer {
    public static void main(String[] args) {
        LList list = new LList(new LinkedNode(7));
        list.push(6);
        list.push(3);
        list.push(2);
        list.push(10);
        list.push(5);
        nextGreater(list);
        list.print();
    }

    public static void nextGreater(LList list) {
        Stack<LinkedNode> stack = new Stack<>();
        stack.push(list.head);
        LinkedNode curr = list.head.next;
        while (curr != null) {

            if(!stack.isEmpty()){
                LinkedNode el = stack.pop();
                if(curr.data > el.data) {
                    el.random = curr;
                    while (!stack.isEmpty() && stack.peek().data < curr.data) {
                        LinkedNode e = stack.pop();
                        e.random = curr;
                    }
                }else{
                    stack.push(el);
                }
                stack.push(curr);
            }
            curr = curr.next;
        }
    }

    public void cloneList(LList list) {
        Map<LinkedNode, LinkedNode> map = new HashMap<>();
        LinkedNode orig = list.head;
        while (orig != null) {
            LinkedNode copyNode = new LinkedNode(orig.data);
            map.put(orig, copyNode);
            orig = orig.next;
        }

        orig = list.head;
        while (orig != null) {
            LinkedNode copyNode = map.get(orig);
            copyNode.next = map.get(orig.next);
            copyNode.random = map.get(orig.random);
            orig = orig.next;
        }

    }
}