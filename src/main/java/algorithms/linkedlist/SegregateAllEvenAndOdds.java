package main.java.algorithms.linkedlist;

/**
 * Created by Siddhi Parkar on 07-01-2018.
 */
public class SegregateAllEvenAndOdds {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.insertNode(11, 0);
        llist.insertNode(10, 0);
        llist.insertNode(9, 0);
        llist.insertNode(6, 0);
        llist.insertNode(4, 0);
        llist.insertNode(1, 0);
        llist.insertNode(0, 0);
        SegregateAllEvenAndOdds s= new SegregateAllEvenAndOdds();
        s.seggregate(llist);
        llist.print();
    }

    public void seggregate(LinkedList list) {
        Node even = null;
        Node evenHead = null;
        Node odd = null;
        Node oddHead = null;
        Node current = list.head;
        while (current != null) {
            if(current.data%2 == 0){
                if(even==null){
                    even = current;
                    evenHead = even;
                }
                else{
                    even.next = current;
                    even = even.next;
                }
            }else {
                if(odd==null){
                    odd = current;
                    oddHead = odd;
                }
                else{
                    odd.next = current;
                    odd = odd.next;
                }
            }
            current = current.next;
        }
        even.next = oddHead;
        list.head = evenHead;
    }
}
