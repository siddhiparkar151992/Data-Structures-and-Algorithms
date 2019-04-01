package main.java.algorithms.linkedlist;


public class Node implements Cloneable{
	public int data;
	public int data2;
	public Node next;

	public Node(int data) {
		this.data = data;
	}

	@Override
	 public Node clone() throws CloneNotSupportedException {
	        return (Node) super.clone();
	    }
}
