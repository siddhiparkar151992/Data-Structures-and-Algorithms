package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class CheckIfTreeIsBST {

	public boolean isBSTUtil(Node node, int max, int min) {
		if (node == null)
			return true;
		if (node.root < min || node.root > max) {
			return false;
		}
		return isBSTUtil(node.left, min, node.root - 1) && isBSTUtil(node.right, max, node.root + 1);
	}

	public boolean isBST(BinaryTree tree) {
		return isBSTUtil(tree.root, Integer.MAX_VALUE, Integer.MIN_VALUE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(4);
        tree.root.left = new Node(2);
        tree.root.right = new Node(5);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        CheckIfTreeIsBST c= new CheckIfTreeIsBST();
        c.isBST(tree);
        System.out.println(c.isBST(tree));
	}

}
