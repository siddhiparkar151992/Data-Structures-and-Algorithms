package main.java.amazon;

import main.java.algorithms.linkedlist.LinkedList;
import main.java.algorithms.linkedlist.Node;

public class SwapNodesFomKthLinkedList {
	
	public static class result{
		static Node x;
		static Node y;
		static Node px;
		static Node py;
		static int preCount = -99999;
	}
	public void swap(Node node,Node pre,  int c, int k){
		if(node==null) return;
		if(c == k){
			result.px = pre;
			result.x = node;
		}
		swap(node.next,node, c+1, k );
		if(result.preCount == -99999){
			result.preCount  = k-1;
		}
		if(result.preCount  == 0){
			result.py = pre;
			result.y = node;
			return;
		}
		result.preCount --;
	}
	public void swap(LinkedList list, int k ){
		swap(list.head, null, 0, k-1);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList llist = new LinkedList();
        for (int i = 8; i >= 1; i--)
            llist.insertNode(i, 0);
        SwapNodesFomKthLinkedList s= new SwapNodesFomKthLinkedList();
        s.swap(llist, 5);
        
	}

}
