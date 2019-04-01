package main.java.algorithms.binarytree;

import java.util.Iterator;
import java.util.Queue;

public class RootToLeafPathSum {

	public void printQueueSum(Queue q) {
		int sum = 0;
		Iterator i = q.iterator();
		while (i.hasNext()) {
			sum += ((Node) i.next()).root;
		}
		System.out.println(sum);
	}

	public void printRootToLeafSum(int sum, Node node){
		if(node == null) return;
		sum+=node.root;
		if(node.left!=null){
//			q.add(node.left);
			
			printRootToLeafSum(sum, node.left);
		}
		if(node.right!=null){
//			q.add(node.right);
			printRootToLeafSum(sum, node.right);
		}
		if(node.left == null && node.right == null){
			System.out.println(sum);
		}
	}

	public void printRootToLeafSum(BinaryTree tree) {
		Queue q = new java.util.LinkedList<Node>();
		q.add(tree.root);
		printRootToLeafSum(0, tree.root);
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10);
		tree.root.left = new Node(8);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(2);

		RootToLeafPathSum r = new RootToLeafPathSum();
		r.printRootToLeafSum(tree);
	}

}
