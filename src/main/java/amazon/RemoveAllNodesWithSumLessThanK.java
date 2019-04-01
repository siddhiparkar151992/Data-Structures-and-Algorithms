package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class RemoveAllNodesWithSumLessThanK {
	
	public Node removeRecur(Node node, Integer sum, int k){
		if(node== null) return null;
		
		node.left = removeRecur(node.left, sum - node.root, k);
		node.right= removeRecur(node.right, sum - node.root, k);
		if(node.left ==null && node.right == null){
			if(node.root < sum){
				return null;
			}
		}
		
		return node;
	}
	public void removeNodes(BinaryTree tree, int k ){
		Integer sum = 0;
		Node n =removeRecur(tree.root, k, k);
		System.out.println(n);
		
	}
	public static void main(String[] args) {
		BinaryTree t= new BinaryTree();
		Node root = new Node(1);
		root.left = new Node(2);
	    root.right = new Node(3);
	    root.left.left = new Node(4);
	    root.left.right = new Node(5);
	    root.right.left = new Node(6);
	    root.right.right = new Node(7);
	    root.left.left.left = new Node(8);
	    root.left.left.right = new Node(9);
	    root.left.right.left = new Node(12);
	    root.right.right.left = new Node(10);
	    root.right.right.left.right = new Node(11);
	    root.left.left.right.left = new Node(13);
	    root.left.left.right.right = new Node(14);
	    root.left.left.right.right.left = new Node(15);
	    t.root = root;
	    RemoveAllNodesWithSumLessThanK m = new RemoveAllNodesWithSumLessThanK();
	    m.removeNodes(t, 45);
	 

	}

}
