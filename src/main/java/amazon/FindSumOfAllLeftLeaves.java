package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class FindSumOfAllLeftLeaves {

	public class Sum {
		int sum;
	}

	public void findSum(Node node, Sum sum, boolean isLeft) {
		if (node == null)
			return;
		if (isLeft && node.left == null && node.right == null) {
			sum.sum += node.root;
		}
		findSum(node.left, sum, true);
		findSum(node.right, sum, false);
	}

	public void findSum(BinaryTree tree) {
		Sum sum = new Sum();
		sum.sum = 0;
		findSum(tree.root, sum, false);
		System.out.println(sum.sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindSumOfAllLeftLeaves f = new FindSumOfAllLeftLeaves();
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(20);
		tree.root.left = new Node(9);
		tree.root.right = new Node(49);
		tree.root.left.right = new Node(12);
		tree.root.left.left = new Node(5);
		tree.root.right.left = new Node(23);
		tree.root.right.right = new Node(52);
		tree.root.left.right.right = new Node(12);
		tree.root.right.right.left = new Node(50);
		f.findSum(tree);
	}

}
