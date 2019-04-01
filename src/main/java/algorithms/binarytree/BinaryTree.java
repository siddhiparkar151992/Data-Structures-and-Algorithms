package main.java.algorithms.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	public Node root;
	public BinaryTree() {
		root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	void printPostorder() {
		postOrder(root);
	}

	void printInorder() {
		inOrder(root);
	}

	void printPreorder() {
		preOrder(root);
	}

	public void inOrder(Node node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.println(node.root);
		inOrder(node.right);

	}

	public void preOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.println(node.root);
		inOrder(node.left);
		inOrder(node.right);

	}

	public int height(Node node) {
		if (node == null) {
			return 0;
		}
		int l = height(node.left);
		int r = height(node.right);
		return l > r ? l + 1 : r + 1;
	}

	public void bfs() {
		bfs(root);
	}

	private void printGivenLevel(Node node, int level) {
		if (node == null)
			return;
		if (level == 1) {
			System.out.println(node.root);
		} else if (level > 1) {
			printGivenLevel(node.left, level - 1);
			printGivenLevel(node.right, level - 1);
		}
	}

	private void bfs(Node node) {
		int height = height(node);
		for (int i = 1; i <= height; i++) {
			printGivenLevel(node, i);
		}
	}

	public void postOrder(Node node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		inOrder(node.right);
		System.out.println(node.root);

	}
	public void BFS(){
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node current = queue.poll();
			System.out.println(current.root);
			
			if(current.left!=null) queue.add(current.left);
			if(current.right!=null) queue.add(current.right);
			
			
		}
	}
	
	public int getsize(Node node){
		if(node==null) return 0;
		int lsize = getsize(node.left);
		int rsize=  getsize(node.right);
		return lsize + rsize +1;
	}
	public int size(){
		int size = getsize(root);
		return size;
	}

}
