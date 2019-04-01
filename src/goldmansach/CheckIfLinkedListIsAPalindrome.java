package goldmansach;

import main.java.algorithms.linkedlist.LinkedList;
import main.java.algorithms.linkedlist.Node;

public class CheckIfLinkedListIsAPalindrome {
	Node left;
	public boolean util(Node node){
		if(node ==  null) return true;
		boolean isP = util(node.next);
		if(!isP) return false;
		boolean isPal = node.data == left.data;
		left = left.next;
		return isPal;
	}
	public void isPalindrome(LinkedList list){
		left = list.head;
		System.out.println(util(list.head));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckIfLinkedListIsAPalindrome c= new CheckIfLinkedListIsAPalindrome();
		LinkedList l = new LinkedList();
		l.insertNode(1, -1);
		l.insertNode(2, -1);
		l.insertNode(3, -1);
		l.insertNode(2, -1);
		l.insertNode(5, -1);
		c.isPalindrome(l);
	}

}
