package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class PrintAllNodesAtDistanceK {
	
	public void printUtil(Node node, int dist, Node from, int k){
		if(node == null) return;
		if(dist == k){
			System.out.println(node.root);
		}
		if(from.root == node.root){
			dist = 0;
		}
		printUtil(node.left, dist!=-9999 ? dist+1: dist, from,  k);
		printUtil(node.right, dist!=-9999 ? dist+1: dist, from, k);
	}
	public void print(BinaryTree tree, Node node, int k){
		printUtil(tree.root, -9999, node, k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        BinaryTree tree = new BinaryTree();
  
        /* Let us construct the tree shown in above diagram */
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        
        Node target = tree.root.left.right;
        PrintAllNodesAtDistanceK p = new PrintAllNodesAtDistanceK();
        p.print(tree, target, 1);
	}

}
