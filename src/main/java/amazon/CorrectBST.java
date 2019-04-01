package main.java.amazon;

import main.java.amazon.BinarySearchTree.Node;

public class CorrectBST {
	Node prev = null;

	public void correct(Node node, Node first, Node middle, Node last) {
		if (node != null) {

			correct(node.left, first, middle, last);
			if (prev != null && node.key < prev.key) {
				if (first == null) {
					first = prev;
					middle = node;
				} else {
					last = node;
				}
			}
			prev = node;
			correct(node.right, first, middle, last);
		}
	}

	public void correctBST(BinarySearchTree tree) {
		Node first = null, last = null, middle = null, pre = null;
		correct(tree.root, first, middle, last);
		System.out.println(first);
		System.out.println(middle);
		System.out.println(last);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(10);
		tree.insert(5);
		tree.insert(2);
		tree.insert(20);
		tree.insert(8);
		tree.root.left.right.key = 20;
		tree.root.right.key = 8;
		CorrectBST c = new CorrectBST();
		c.correctBST(tree);

	}

}
