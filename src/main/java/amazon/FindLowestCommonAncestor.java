package main.java.amazon;

import main.java.amazon.BinarySearchTree.Node;

public class FindLowestCommonAncestor {

	public Node findLCA(Node node, int n1, int n2) {
		if (node == null)
			return null;
		if (node.key > n1 && node.key > n2) {
			return findLCA(node.left, n1, n2);
		} else if (node.key < n1 && node.key < n2) {
			return findLCA(node.right, n1, n2);
		}
		return node;
	}

	public int lca(BinarySearchTree tree, int n1, int n2) {
		Node r = findLCA(tree.root, n1, n2);
		System.out.println(r.key);
		return r.key;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindLowestCommonAncestor f = new FindLowestCommonAncestor();
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(20);
		tree.insert(8);
		tree.insert(22);
		tree.insert(4);
		tree.insert(12);
		tree.insert(10);
		tree.insert(14);
		f.lca(tree, 10, 14);
	}

}
