package main.java.amazon;

import main.java.amazon.BinarySearchTree.Node;

public class FindKthLargestElementInBST {
	public class Result {
		boolean started;
		int k = 1;
		int node = -9999;
	}
	
	Result r= new Result();

	public void findKthGreatest(Node node, Result r, int m) {
		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null) {
			if (!r.started) {
				r.started = true;
			}
		}
		findKthGreatest(node.left, r, m);
		if (r.started && r.k == m) {
			if(r.node == -9999) r.node = node.key;
			return;
		} else if (r.started) {
			r.k++;
		}
		findKthGreatest(node.right, r, m);
	}
	
	public void find(BinarySearchTree tree, int k){
		findKthGreatest(tree.root, r, k);
		System.out.println(r.node);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(20);
		tree.insert(8);
		tree.insert(4);
		tree.insert(12);
		tree.insert(10);
		tree.insert(14);
		tree.insert(22);
		
		FindKthLargestElementInBST f = new FindKthLargestElementInBST();
		f.find(tree, 6);
	}

}
