package main.java.amazon;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class LevelOrderMaxNum {

	public void levelOrderMaxNum(BinaryTree tree){
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(tree.root);
		int result = 0;
		while(!queue.isEmpty()){
			int count = queue.size();
			result = Math.max(result, count);
			while(count >= 0 && !queue.isEmpty()){
				Node node = queue.poll();
				if(node.left!=null){
					queue.add(node.left);
				}
				if(node.right!=null){
					queue.add(node.right);
				}
				count--;
			}
			
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(8);
        root.right.right.left = new Node(6);
        root.right.right.right = new Node(7);
        tree.root = root;
        LevelOrderMaxNum  l = new LevelOrderMaxNum();
        l.levelOrderMaxNum(tree);
	}

}
