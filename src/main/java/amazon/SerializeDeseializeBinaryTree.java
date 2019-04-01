package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class SerializeDeseializeBinaryTree {

	public void serializeRecur(int[] arr, Node node, int i) {
		if (node == null) {
			arr[i] = -1;
			return;
		}
		arr[i] = node.root;
		int l = (2 * i) + 1;
		int r = l + 1;
		serializeRecur(arr, node.left, l);
		serializeRecur(arr, node.right, r);

	}

	public int[] serialize(BinaryTree tree, int n) {
		int[] arr = new int[n];

		serializeRecur(arr, tree.root, 0);

		return arr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SerializeDeseializeBinaryTree b = new SerializeDeseializeBinaryTree();
		BinaryTree tree = new BinaryTree();
		Node root = new Node(2);
		root.left = new Node(4);
		root.right = new Node(5);
		root.left.left = new Node(10);
		root.left.right = new Node(11);
		root.right.left = new Node(14);
		root.right.left.right = new Node(16);
		tree.root = root;
		int[] arr = b.serialize(tree, 50);
		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
