package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class MirrorImageOfBinaryTree {
	
	public void mirrorUtil(Node node){
		if(node == null) return;
		Node temp = node.left;
		node.left = node.right;
		node.right = temp;
		mirrorUtil(node.left);
		mirrorUtil(node.right);
	}
	public void mirrorImage(BinaryTree tree){
		mirrorUtil(tree.root);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree= new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		MirrorImageOfBinaryTree m = new MirrorImageOfBinaryTree();
		m.mirrorImage(tree);
		System.out.println(tree);
	}

}
