package goldmansach;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class BinarySumTree {
	
	public void iSumTree(BinaryTree tree){
		isSumTree(tree.root);
		System.out.println(r.isSum);
	}
	
	public class Result{
		boolean isSum= true;
	}
	Result r = new Result();
	public int isSumTree(Node node) {
		if(node == null) return 0;
		if(node.left ==null && node.right==null) return node.root;
		int lsum = isSumTree(node.left);
		int rsum = isSumTree(node.right);
		if(lsum+ rsum != node.root){
			r.isSum = false;
		}
		return node.root+lsum+rsum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySumTree b = new BinarySumTree();
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(26);
        tree.root.left = new Node(10);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(6);
        tree.root.right.right = new Node(3);
        b.iSumTree(tree);
	}

}
