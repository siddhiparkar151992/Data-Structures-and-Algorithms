package main.java.algorithms.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderInSpiralForm {

	public void levelOrderInSpiralForm(BinaryTree tree) {
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		
		s1.push(tree.root);
		while(!s1.isEmpty() || !s2.isEmpty()){
			
			while(!s1.isEmpty()){
				Node n= s1.pop();
				System.out.println(n.root);
				if(n.right!=null) s2.push(n.right);
				if(n.left!=null) s2.push(n.left);
			}
			
			while(!s2.isEmpty()){
				Node n= s2.pop();
				System.out.println(n.root);
				if(n.left!=null) s1.push(n.left);
				if(n.right!=null) s1.push(n.right);
				
			}
			
		}
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(7);
		tree.root.left.right = new Node(6);
		tree.root.right.left = new Node(5);
		tree.root.right.right = new Node(4);
		LevelOrderInSpiralForm l = new LevelOrderInSpiralForm();
		l.levelOrderInSpiralForm(tree);
	}

}
