package main.java.algorithm.morganstanley;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class BinareTreeToDoublyLinkedList {
	
	public void binaryToDLL(BinaryTree tree){
		Node n = binaryToDLL(tree.root);
		System.out.println(n);
	}
	public Node binaryToDLL(Node node){
		
		if(node!=null){
			if(node.left!=null){
				Node n = binaryToDLL(node.left);
				while(n.right!=null ){
					n = n.right;
				}
				n.right = node;
				node.left = n;
			}
			
			if(node.right!=null){
				Node n = binaryToDLL(node.right);
				while(n.left!=null ){
					n = n.left;
				}
				n.left = node;
				node.right = n;
			}
			
		}
		return node;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinareTreeToDoublyLinkedList b= new BinareTreeToDoublyLinkedList();BinaryTree tree = new BinaryTree();
  
        // Let us create the tree shown in above diagram
        tree.root = new Node(10);
        tree.root.left = new Node(12);
        tree.root.right = new Node(15);
        tree.root.left.left = new Node(25);
        tree.root.left.right = new Node(30);
        tree.root.right.left = new Node(36);
		
		b.binaryToDLL(tree);
	}

}
