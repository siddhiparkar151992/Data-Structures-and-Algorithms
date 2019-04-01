package main.java.amazon;

import java.util.LinkedList;
import java.util.Queue;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class FindLevelMaximumSumBinaryTree {

	public void maxLevelSum(Node node) {
		Queue<Node> queue = new LinkedList<>();

		queue.add(node);
		int r = 0;
		while (!queue.isEmpty()) {
			int count = queue.size();
			int sum = 0;
			while (count > 0){
				Node n = queue.poll();
				sum+= n.root;
				System.out.print(n.root+" ");
				if (n.left != null)
					queue.add(n.left);
				if (n.right != null)
					queue.add(n.right);
				count--;
			}
			r = Math.max(sum, r);
			System.out.println();
		}
		System.out.println(r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left        = new Node(2);
	    root.right       = new Node(3);
	    root.left.left  = new Node(4);
	    root.left.right = new Node(5);
	    root.right.right = new Node(8);
	    root.right.right.left  = new Node(6);
	    root.right.right.right  = new Node(7);
	    BinaryTree b = new BinaryTree();
	    b.root = root;
	    FindLevelMaximumSumBinaryTree f= new FindLevelMaximumSumBinaryTree();
	    f.maxLevelSum(b.root);
	}

}
