package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class BinaryTreeSum {
	
	public int sum(Node node){
		if(node == null) return 0;
		return node.root + sum(node.left) + sum(node.right);
	}
	public boolean isSum(Node node){
		if(node== null) return true;
		if(node.left == null && node.right == null) return true;
		int lsum = sum(node.left);
		int rsum = sum(node.right);
		int sum = lsum + rsum;
		return node.root == sum && isSum(node.left) && isSum(node.right);
	}
	public void isSum(BinaryTree tree){
		System.out.println(isSum(tree.root));
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(26);
        tree.root.left = new Node(10);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(6);
        tree.root.right.right = new Node(3);
        BinaryTreeSum b = new BinaryTreeSum();
        b.isSum(tree);
	}

}
