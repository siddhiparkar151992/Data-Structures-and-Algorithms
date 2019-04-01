package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class MaximumDiffBetweenParentAndChild {

	public class Res {
		int r = 0;
	}

	public int findMaxDiff(Node node, Res res) {
		if (node == null)
			return Integer.MAX_VALUE;
		if (node.left == null && node.right == null)
			return node.root;
		int l = findMaxDiff(node.left, res);
		int r = findMaxDiff(node.right, res);
		int val = Math.min(l, r);
		res.r = Math.max(res.r, node.root - val);
		return Math.min(node.root, val);
	}

	public void findMaxDiff(BinaryTree tree) {
		Res r= new Res();
		findMaxDiff(tree.root, r);
		System.out.println(r.r);
	}

	public static void main(String[] args) {
		MaximumDiffBetweenParentAndChild m = new MaximumDiffBetweenParentAndChild();
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(40);
		tree.root.left = new Node(20);
		tree.root.right = new Node(60);
		tree.root.left.left = new Node(18);
		tree.root.left.right = new Node(30);
		tree.root.right.left = new Node(50);

		tree.root.right.right = new Node(80);
		tree.root.left.left.left = new Node(1);
		tree.root.left.left.right = new Node(19);
		m.findMaxDiff(tree);
	}

}
;