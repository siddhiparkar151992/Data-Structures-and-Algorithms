package main.java.algorithms.linkedlist;



/**
 * Created by Siddhi Parkar on 10-02-2018.
 */
public class RearrangeLinkedListEvenOddTogether {
    public static void rearrange(LinkedList list){
        Node evenhead = list.head;
        Node oddHead = list.head;
        Node even = null;
        Node odd = null;

        Node curr = list.head;
        while (curr!=null) {
            if(even==null) {
                even = curr;
                evenhead = curr;
            }
            else {
                even.next = curr;
                even = even.next;
            }
            if(odd==null) {
                odd = curr.next;
                oddHead = curr.next;
            }
            else{
                odd.next = curr.next;
                odd = odd.next;
            }
            if(curr.next!=null )curr = curr.next.next;
            else{
                curr = null;
            }
        }
        if(even!=null) even.next = oddHead;
        list.head = evenhead;
        list.print();
    }
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.insertNode(4,0);
        li.insertNode(3,0);
        li.insertNode(2,0);
//        li.insertNode(1,0);
        rearrange(li);
    }
}
