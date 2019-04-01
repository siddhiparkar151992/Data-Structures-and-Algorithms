package main.java.amazon;

import java.util.Stack;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class InorderTraversalWithoutRecuesion {
	
	public void inorder(BinaryTree tree){
		Node current = tree.root;
		Stack<Node> stack= new Stack<>();
		while(true){
			if(current!=null){
				stack.push(current);
				current = current.left;
			}else if(current == null && !stack.isEmpty()){
				Node data = stack.pop();
				System.out.println(data.root);
				current = data.right;
			}else{
				break;
			}
		}
	}
	public static void main(String[] args) {
		InorderTraversalWithoutRecuesion i = new InorderTraversalWithoutRecuesion();
		BinaryTree tree = new BinaryTree();
		Node head = new Node(10);
		head.left= new Node(7);
		head.left.left= new Node(4);
		head.left.right= new Node(9);
		head.right= new Node(20);
		tree.root = head;
		i.inorder(tree);
	}

}
