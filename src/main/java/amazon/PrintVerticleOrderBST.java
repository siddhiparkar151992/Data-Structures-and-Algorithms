package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class PrintVerticleOrderBST {
	Values v = new Values();

	class Values {
		int max, min;
	}

	public void getMinMax(Node node, int current, Values min, Values max) {
		if (node == null)
			return;
		if (current < min.min)
			min.min = current;
		else if (current > max.max)
			max.max = current;

		getMinMax(node.left, current - 1, min, max);
		getMinMax(node.right, current + 1, min, max);

	}
	
	public void printVertical(Node node, int line, int index){
		if(node == null){
			return;
		}
		if(line==index){
			System.out.print(node.root);
		}
		printVertical(node.left, line-1, index);
		printVertical(node.right, line+1, index);
		
	}
	public void printVerticalOrder(BinaryTree tree) {
		Integer a = 0;
		int current = 0;
		Integer b = 0;
		getMinMax(tree.root, current, v, v);
		System.out.println(v.min + "----" + v.max);
		for (int i = v.min; i <= v.max; i++) {
			printVertical(tree.root, 0, i);
			System.out.println();
		}

	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		/* Let us construct the tree shown in above diagram */
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.right.left.right = new Node(8);
		tree.root.right.right.right = new Node(9);
		PrintVerticleOrderBST p = new PrintVerticleOrderBST();
		p.printVerticalOrder(tree);
	}

}
