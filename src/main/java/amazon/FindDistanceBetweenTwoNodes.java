package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class FindDistanceBetweenTwoNodes {
	static class Res {
		static Node node1;
		static Node node2;
		static Node lca;
		static int d1 = -99;
		static int d2 = -99;
		static int dist = -99;
	}

	public Node getLCAUtil(Node node, int n1, int n2, int dist) {
		if (node == null)
			return null;
		if (node.root == n1 || node.root == n2) {
			if (node.root == n1) {
				Res.d1 = dist;
				Res.node1 = node;
			}

			if (node.root == n2) {
				Res.d2 = dist;
				Res.node2 = node;
			}

			return node;
		}
		Node l = getLCAUtil(node.left, n1, n2, dist + 1);
		Node r = getLCAUtil(node.right, n1, n2, dist + 1);
		if (l != null && r != null) {
			Res.dist = Res.d1 + Res.d2 - 2 * (dist);
			return node;
		}
		return l != null ? l : r;

	}

	public Node getLCA(BinaryTree tree, int n1, int n2) {
		Node lca = getLCAUtil(tree.root, n1, n2, 0);
		return lca;
	}

	public void findDistance(Node n1, Node n2, int dist) {
		if (n2 == null)
			return;
		if (n1.root == n2.root) {
			Res.dist = dist;
			return;
		}
		findDistance(n1.left, n2, dist + 1);
		findDistance(n1.right, n2, dist + 1);
	}

	public int findDistance(int n1, int n2, BinaryTree tree) {
		getLCA(tree, n1, n2);
		System.out.println(Res.d1 + " " + Res.d2 + " " + Res.dist);
		if (Res.d1 != -99 && Res.d1 != -99) {
			System.out.println(Res.dist);
			return Res.dist;
		}
		if (Res.d1 != -99) {
			findDistance(Res.node1, Res.node2, 0);
		}

		if (Res.d2 != -99) {
			findDistance(Res.node2, Res.node1, 0);
		}
		System.out.println(Res.dist);
		return Res.dist;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.left.right = new Node(8);
		BinaryTree tree = new BinaryTree();
		tree.root = root;
		FindDistanceBetweenTwoNodes f = new FindDistanceBetweenTwoNodes();
		f.findDistance(4, 5, tree);
	}

}
