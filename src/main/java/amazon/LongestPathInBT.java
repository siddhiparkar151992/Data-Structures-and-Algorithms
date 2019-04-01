package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class LongestPathInBT {

	public void findRec(Node node, int curLength, int expected, Integer res) {
		if (node == null)
			return;
		if (expected == node.root) {

			curLength++;
		} else {
			curLength = 1;
		}
		res = new Integer(Math.max(res, curLength));
		findRec(node.left, curLength, node.root + 1, res);
		findRec(node.right, curLength, node.root + 1, res);
		// System.out.println(node.root);
	}

	public void longestConsecutivePath(BinaryTree tree) {
		Integer response = new Integer(0);
		findRec(tree.root, 0, tree.root.root, response);
		System.out.println(response);
	}

	public static void main(String[] args) {
		BinaryTree t = new BinaryTree();
		Node root = new Node(6);
		root.right = new Node(9);
		root.right.left = new Node(7);
		root.right.right = new Node(10);
		root.right.right.right = new Node(11);
		t.root = root;

		LongestPathInBT l = new LongestPathInBT();
		l.longestConsecutivePath(t);
	}
}
