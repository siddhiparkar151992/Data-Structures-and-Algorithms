package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class MaxDistanceBetweenParentAndChild {
	
	public static class r{
		static int n = Integer.MIN_VALUE;
	}
	public void getMaxDist(Node node, int max, int min){
		if(node==null) return;
		max = Math.max(node.root, max);
		min = Math.min(node.root, min);
		if(max - min > r.n){
			r.n = max-min;
		}
		
		getMaxDist(node.left, max, min);
		getMaxDist(node.right, max, min);
	}
	public void find(BinaryTree tree){
		getMaxDist(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println(r.n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		  
        // Making above given diagram's binary tree
        tree.root = new Node(8);
        tree.root.left = new Node(3);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(4);
        tree.root.left.right.right = new Node(7);
  
        tree.root.right = new Node(10);
        tree.root.right.right = new Node(14);
        tree.root.right.right.left = new Node(13);
        
        MaxDistanceBetweenParentAndChild m = new MaxDistanceBetweenParentAndChild();
        m.find(tree);
	}

}
