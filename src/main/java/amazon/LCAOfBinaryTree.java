package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class LCAOfBinaryTree {
	public Node findLCA(int n1, int n2, Node root){
		if(root == null) return null;
		if(root.root == n1 || root.root == n2) return root;
		Node l = findLCA(n1, n2, root.left);
		Node r = findLCA(n1, n2, root.right);
		if(l!=null && r!=null){
			return root;
		}
		return l!=null ? l : r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        
        LCAOfBinaryTree l = new LCAOfBinaryTree();
        Node n = l.findLCA(4, 6, tree.root);
        System.out.println(n.root);
	}

}
