package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class LargestBSTinBT {
	
	class Result {
		int size;
		int max;
		int min;
		int ans;
		boolean isBST;
		public Result(int size, int max, int min, int ans, boolean isBST) {
			super();
			this.size = size;
			this.max = max;
			this.min = min;
			this.ans = ans;
			this.isBST = isBST;
		}
		
		public Result(){
			
		}
		
	}
	
	public Result isLargeBST(Node node){
		if(node == null){
			return new Result(0, Integer.MAX_VALUE, Integer.MIN_VALUE, 0, true);
		}
		if(node.left == null && node.right == null){
			return new Result(1, node.root, node.root, 1, true);
		}
		
		Result l = isLargeBST(node.left);
		Result r = isLargeBST(node.right);
		
		Result curr = new Result();
		curr.size = 1+ l.size+r.size;
		if(l.isBST && r.isBST && l.max < node.root && r.min > node.root){
			curr.min= Math.min(l.min, node.root);
			curr.max = Math.max(r.max, node.root);
			curr.ans = curr.size;
			curr.isBST = true;
			return curr;
		}
		
		curr.ans=  Math.max(l.ans, r.ans);
		curr.isBST = false;
		return curr;
	}
	public int getLargestBST(BinaryTree tree){
		return isLargeBST(tree.root).ans; 
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(60);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(20);
        tree.root.right.left = new Node(45);
        
        tree.root.right.right = new Node(70);
        tree.root.right.right.left = new Node(65);
        tree.root.right.right.right = new Node(80);
        LargestBSTinBT l = new LargestBSTinBT();
        System.out.println(l.getLargestBST(tree));
	}

}
