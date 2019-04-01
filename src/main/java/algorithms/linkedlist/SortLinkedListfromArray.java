package main.java.algorithms.linkedlist;

/**
 * Created by Siddhi Parkar on 04-03-2018.
 */
public class SortLinkedListfromArray {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 3, 2, 8};
        LinkedList list = new LinkedList();
        list.insertNode(1, 0);
        list.insertNode(2, 0);
        list.insertNode(5, 0);
        list.insertNode(8, 0);
        list.insertNode(5, 0);
        list.insertNode(2, 0);
        list.insertNode(3, 0);
        SortLinkedListfromArray s = new SortLinkedListfromArray();
        s.sort(list,arr);
    }

    public void sort(LinkedList list, int[] arr) {
        int[] count = new int[100];
        Node curr = list.head;
        while (curr != null) {
            count[curr.data]++;
            curr = curr.next;
        }
        curr = list.head;
        int currNum = 0;
        while (curr != null) {
            if (count[arr[currNum]] == 0) {
                currNum++;
            } else {

                count[arr[currNum]]--;
            }
            curr.data = arr[currNum];
            curr = curr.next;
        }
       list.print();
    }
}
