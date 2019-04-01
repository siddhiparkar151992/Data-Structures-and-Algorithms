package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class FindCousinsInBT {

	int level;
	Node node;
	Node parent;

	public void findLevel(Node node, int level, int key, Node parent) {
		if(node ==  null) return;
		if (node.root == key) {
			this.parent = parent;
			this.node = node;
			this.level = level;
			return;
		} else {
			findLevel(node.left, level + 1, key, node);
			findLevel(node.right, level + 1, key, node);
		}
	}

	public void cousins(Node node, int l, Node parent) {
		if (node == null)
			return;
		if (l == level && parent!=null && parent.root != this.parent.root) {
			System.out.println(node.root);
		} else {
			cousins(node.left, l + 1, node);
			cousins(node.right, l + 1, node);
		}
	}

	public int findLevel(BinaryTree tree, int key) {
		findLevel(tree.root, 0, key, null);
		return level;
	}

	public void findCousins(BinaryTree tree, int key) {
		int level = findLevel(tree, key);
		cousins(tree.root, 0, null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		FindCousinsInBT f= new FindCousinsInBT();
		f.findCousins(tree, 5);
	}

}
