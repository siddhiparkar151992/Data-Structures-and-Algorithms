package main.java.amazon;

import java.util.Iterator;
import java.util.LinkedList;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class PrintKSumPathsBinaryTree {

	public void printPath(LinkedList<Node> path, int i) {
		for (int j = i; j < path.size(); j++) {
			System.out.print(path.get(j).root + " ");
		}
		System.out.println();
	}

	public void print(Node node, LinkedList<Node> path, int k) {
		if (node == null)
			return;
		path.add(node);
		print(node.left, path, k);
		print(node.right, path, k);
		int f = 0;
		for (int i = path.size() - 1; i >= 0; i--) {
			f += path.get(i).root;
			if (f == k) {
				printPath(path, i);
			}
		}
		path.pollLast();
	}

	public void printKPath(BinaryTree tree, int k) {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		Node root = new Node(1);
		root.left = new Node(3);
		root.left.left = new Node(2);
		root.left.right = new Node(1);
		root.left.right.left = new Node(1);
		root.right = new Node(-1);
		root.right.left = new Node(4);
		root.right.left.left = new Node(1);
		root.right.left.right = new Node(2);
		root.right.right = new Node(5);
		root.right.right.right = new Node(2);
		tree.root = root;
		PrintKSumPathsBinaryTree p = new PrintKSumPathsBinaryTree();
		p.printKPath(tree, 5);
	}

}
