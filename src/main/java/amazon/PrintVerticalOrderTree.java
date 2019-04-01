package main.java.amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class PrintVerticalOrderTree {

	public void getVerticalOrder(Node node, int d, HashMap<Integer, List<Integer>> map) {
		if (node == null)
			return;
		List<Integer> list = map.get(d);
		if (list == null) {
			list = new ArrayList<Integer>();
		}
		list.add(node.root);
		map.put(d, list);
		getVerticalOrder(node.left, d - 1, map);
		getVerticalOrder(node.right, d + 1, map);
	}

	public void vertical(BinaryTree tree) {
		HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		getVerticalOrder(tree.root, 0, map);
		System.out.println(map);
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.left.right =new  Node(8);
		root.right.right.right = new Node(9);
		
		BinaryTree t = new BinaryTree();
		t.setRoot(root);
		PrintVerticalOrderTree p = new PrintVerticalOrderTree();
		p.vertical(t);

	}

}
