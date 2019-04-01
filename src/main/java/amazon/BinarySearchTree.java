package main.java.amazon;

public class BinarySearchTree {

	/* Class containing left and right child of current node and key value */
	public static class Node {
		public int key;
		public Node left, right;
		public int l = 0;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	// Root of BST
	public Node root;

	// Constructor
	public BinarySearchTree() {
		root = null;
	}

	// This method mainly calls insertRec()
	public void insert(int key) {
		root = insertRec(root, key);
	}

	/* A recursive function to insert a new key in BST */
	public Node insertRec(Node root, int key) {

		/* If the tree is empty, return a new node */
		if (root == null) {
			root = new Node(key);
			return root;
		}

		/* Otherwise, recur down the tree */
		if (key < root.key) {
			root.l += 1;
			root.left = insertRec(root.left, key);

		} else if (key > root.key)
			root.right = insertRec(root.right, key);

		/* return the (unchanged) node pointer */
		return root;
	}

	private Node searchRec(Node node, int data) {
		if (node == null)
			return null;
		if (data == node.key)
			return node;
		if (data < node.key) {
			searchRec(node.left, data);
		} else {
			searchRec(node.right, data);
		}
		return null;
	}

	public Node search(int data) {
		return searchRec(root, data);
	}

	// This method mainly calls InorderRec()
	public void inorder() {
		inorderRec(root);
	}

	// A utility function to do inorder traversal of BST
	public void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}

	public int findKThSmallestElement(Node root, int k) {
		Node current = root;
		while (current != null) {
			if (k == current.l + 1) {
				return current.key;
			} else if (k > current.l) {
				k = k - current.l - 1;
				current = current.right;
			} else {
				current = current.left;
			}
		}
		return -1;
	}

}
