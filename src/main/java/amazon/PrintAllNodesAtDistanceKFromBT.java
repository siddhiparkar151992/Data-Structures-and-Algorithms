package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class PrintAllNodesAtDistanceKFromBT {

	public int printUtil(Node node, int k) {
		if (node == null)
			return -1;
		if (node.root == k)
			return 0;

		int l = printUtil(node.left, k);
		System.out.println(l);
		int r = printUtil(node.right, k);
		if (r != -1) {
			if( r>=k){
				System.out.println(node.root);
			}
//			printNodesDown(node.left, k - r);
			return r+1;
		}
		return -1;
	}

	public void printAllNodes(BinaryTree tree, int k) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
