package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class FindRootToLeafPath {
	
	public boolean isSum(Node node){
		if(node == null) return true;
		if(node.left ==null && node.right == null) {
			return true;
		}
		int l = node.left !=null? node.left.root : 0; 
		int r = node.right !=null? node.right.root : 0;
		return isSum(node.left) && isSum(node.right) && l+r == node.root;
		
	}
	public boolean find(Node node) {
		return isSum(node);
	}

	public void rootToLeafpath(BinaryTree tree) {
		System.out.println(find(tree.root));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);
        FindRootToLeafPath f= new FindRootToLeafPath();
        f.rootToLeafpath(tree);
	}

}
