package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class CheckIfBinaryTreeIsBalanced {
	
	class Height
	{
	    int height = 0;
	}
	
	public boolean isBalanced(Node node, Height height) {
		if (node == null) {
			height.height = 0;
			return true;
		}
		
		Height lheight = new Height(), rheight = new Height();
		boolean l = isBalanced(node.left, lheight);
		boolean r = isBalanced(node.right, rheight);
		
		height.height = (lheight.height > rheight.height ? lheight.height : rheight.height) + 1;
		if(lheight.height - rheight.height >=2 || rheight.height-lheight.height >=2){
			return false;
		}
		return l && r;

	}

	public boolean isBalanced(BinaryTree tree) {
		return isBalanced(tree.root, new Height());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckIfBinaryTreeIsBalanced c = new CheckIfBinaryTreeIsBalanced();
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.left.left.left = new Node(7);
 
        System.out.println(c.isBalanced(tree));		
	}

}
