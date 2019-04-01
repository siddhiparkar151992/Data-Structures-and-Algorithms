package main.java.amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class PrintBinaryTreeVertically {
	Map<Integer, List<Integer>> map = new HashMap<>();

	static class Res {
		static int max = Integer.MIN_VALUE;
		static int min = Integer.MAX_VALUE;
	}

	public void maximaMinima(Node node, int sum) {
		if (node == null)
			return;

		List<Integer> list = map.get(sum);
		if (list == null) {
			list = new ArrayList<>();

		}
		list.add(node.root);

		map.put(sum, list);
		if (sum < Res.min) {
			Res.min = sum;
		}
		if (sum > Res.max) {
			Res.max = sum;
		}
		maximaMinima(node.left, sum - 1);
		maximaMinima(node.right, sum + 1);
	}

	public void printBinaryTreeVertically(BinaryTree tree) {
		maximaMinima(tree.root, 0);
		for (int i = Res.min; i < Res.max; i++) {
			List<Integer> list = map.get(i);
			for (Integer e : list) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		root.right.left.right = new Node(8);
		root.right.right.right = new Node(9);
		tree.root = root;
		PrintBinaryTreeVertically p = new PrintBinaryTreeVertically();
		p.printBinaryTreeVertically(tree);
	}

}
