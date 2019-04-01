package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class FindFartherMostNodeInBT {
	
	public void find(Node node, int path){
		if(node==null) return;
		if(node.left ==null || node.right==null){
			System.out.println(path);
		}
		find(node.left, path+1);
		find(node.right, path+1);
	}
	public void find(BinaryTree tree){
		find(tree.root, 0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.left.right = new Node(6);
		FindFartherMostNodeInBT f= new FindFartherMostNodeInBT();
		f.find(tree);
	}

}
