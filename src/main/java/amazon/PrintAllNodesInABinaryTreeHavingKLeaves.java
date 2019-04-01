package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class PrintAllNodesInABinaryTreeHavingKLeaves {

	public int printNodes(Node node, int k) {
		if (node == null)
			return 0;
		if (node.left == null && node.right == null) {
			return 1;
		}
		int l = printNodes(node.left, k);
		int r = printNodes(node.right, k);
		if(l+r == k){
			System.out.println(node.root);
		}
		return l + r;
	}

	public void printNodes(BinaryTree tree, int k) {
		printNodes(tree.root, k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(4);
		root.left.left = new Node(5);
		root.left.right = new Node(6);
		root.left.left.left = new Node(9);
		root.left.left.right = new Node(10);
		root.right.right = new Node(8);
		root.right.left = new Node(7);
		root.right.left.left = new Node(11);
		root.right.left.right = new Node(12);
		BinaryTree tree= new BinaryTree();
		tree.root = root;
		PrintAllNodesInABinaryTreeHavingKLeaves p = new PrintAllNodesInABinaryTreeHavingKLeaves();
		p.printNodes(tree, 3);
	}

}
