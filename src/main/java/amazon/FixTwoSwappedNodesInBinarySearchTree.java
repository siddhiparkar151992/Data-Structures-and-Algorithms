package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class FixTwoSwappedNodesInBinarySearchTree {
	
	public class Result{
		Node n1;
		Node n2;
	}
	public void fixUtil(Node node, int min, int max){
		if(node == null) return;
		if(node.root > max || node.root < min){
			System.out.println(node.root);
		}
		fixUtil(node.left, min, node.root);
		fixUtil(node.right, node.root, max);
	}
	public void fix(BinaryTree tree){
		fixUtil(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(40);
		tree.root.left = new Node(35);
		tree.root.left.left = new Node(32);
		tree.root.left.right = new Node(42);
		tree.root.left.right.left = new Node(33);
		tree.root.left.left.left = new Node(30);
		tree.root.left.left.right = new Node(31);
		tree.root.left.left = new Node(32);
		tree.root.right = new Node(37);
		FixTwoSwappedNodesInBinarySearchTree f= new  FixTwoSwappedNodesInBinarySearchTree();
		f.fix(tree);
		
	}

}
