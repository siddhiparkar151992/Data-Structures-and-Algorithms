package main.java.amazon;

import java.util.HashMap;
import java.util.Map;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class CloneATreeWithRandomPointer {
	Map<Node, Node> map = new HashMap<>();

	public void cloneTree(Node node) {
		if (node == null)
			return;
		Node newNode = new Node(node.root);
		newNode.left = node.left;
		newNode.right = node.right;
		map.put(node, newNode);
		cloneTree(node.left);
		cloneTree(node.right);
	}
	
//	public void copyRandomPointer(Node node1, Node node2){
//		if(node1== null) return;
//		node1
//	}
	public void clone(BinaryTree tree) {
		cloneTree(tree.root);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
