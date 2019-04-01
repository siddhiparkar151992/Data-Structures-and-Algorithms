package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class DiameterOfBT {

	public class Height {
		int h = 0;
	}

	public void diameter(BinaryTree tree) {
		System.out.println(diameter(tree.root, new Height()));
	}

	public int diameter(Node node, Height height) {
		int ld = 0, rd = 0;
		if(node == null) {
			height.h = 0;
			return 0;
		}
		Height lh = new Height();
		Height rh = new Height();
		ld = diameter(node.left, lh);
		rd = diameter(node.right, rh);
		height.h = Math.max(lh.h, rh.h)+1;
		return Math.max(lh.h+rh.h+1, Math.max(ld, rd));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiameterOfBT d = new DiameterOfBT();
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(13);
		tree.root.right.right = new Node(14);
		tree.root.left.right = new Node(5);
		tree.root.left.right.right = new Node(6);
		tree.root.left.right.right.left = new Node(15);
		tree.root.left.right.right.right = new Node(7);
		tree.root.left.right.right.right.right= new Node(8);
		tree.root.left.left = new Node(3);
		tree.root.left.left.right = new Node(9);
		tree.root.left.left.right.left = new Node(10);
		tree.root.left.left.right.left.left = new Node(12);
		tree.root.left.left.right.left.right = new Node(11);
		tree.root.left.left.left = new Node(4);


		d.diameter(tree);
	}

}
