package main.java.algorithms.binarytree;

public class Node {
	public int root;
	public Node left;
	public Node right;
	public Node(int key) {
		super();
		this.root = key;
		this.left = null;
		this.right = null;
	}
	@Override
	public String toString() {
		return "Node [root=" + root + ", left=" + left + ", right=" + right + "]";
	}
	public int getRoot() {
		return root;
	}
	public void setRoot(int root) {
		this.root = root;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	
}
