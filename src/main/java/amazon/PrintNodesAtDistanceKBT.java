package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

//Java program to print all nodes at a distance k from given node

//A binary tree node


public class PrintNodesAtDistanceKBT{
	
	 /* Recursive function to print all the nodes at distance k in
	    tree (or subtree) rooted with given root. */

	 void printkdistanceNodeDown(Node node, int k) 
	 {
	     // Base Case
	     if (node == null || k < 0)
	         return;

	     // If we reach a k distant node, print it
	     if (k == 0) 
	     {
	         System.out.print(node.root);
	         System.out.println("");
	         return;
	     }

	     // Recur for left and right subtrees
	     printkdistanceNodeDown(node.left, k - 1);
	     printkdistanceNodeDown(node.right, k - 1);
	 }
	 int printkdistanceNode(Node node, Node target, int k) {
		 
	     if (node == null)
	         return -1;
	     if (node == target) 
	     {
	         printkdistanceNodeDown(node, k);
	         return 0;
	     }
	     int dl = printkdistanceNode(node.left, target, k);
	     if (dl != -1) 
	     {
	         if (dl + 1 == k) 
	         {
	             System.out.print(node.root);
	             System.out.println("");
	         }
	         else
	             printkdistanceNodeDown(node.right, k - dl - 2);
	         return 1 + dl;
	     }

	     int dr = printkdistanceNode(node.right, target, k);
	     if (dr != -1) 
	     {
	         if (dr + 1 == k) 
	         {
	             System.out.print(node.root);
	             System.out.println("");
	         } 
	         else
	             printkdistanceNodeDown(node.left, k - dr - 2);
	         return 1 + dr;
	     }

	     // If target was neither present in left nor in right subtree
	     return -1;
	 }

	 // Driver program to test the above functions
	 
	
	
	public static void main(String args[]) 
	 {
	     BinaryTree tree = new BinaryTree();

	     /* Let us construct the tree shown in above diagram */
	     tree.root = new Node(20);
	     tree.root.left = new Node(8);
	     tree.root.right = new Node(22);
	     tree.root.right.left = new Node(29);
	     tree.root.right.left.left = new Node(27);
	     tree.root.right.right = new Node(25);
	     tree.root.left.left = new Node(4);
	     tree.root.left.right = new Node(12);
	     tree.root.left.right.left = new Node(10);
	     tree.root.left.right.right = new Node(14);
	     tree.root.left.right.right.right = new Node(15);
	     tree.root.left.right.right.right.left = new Node(16);
	     Node target = tree.root.left.right;//
	     PrintNodesAtDistanceKBT p = new PrintNodesAtDistanceKBT();
	     p.printkdistanceNode(tree.root, target, 2);
	 }
}


//
//import main.java.algorithms.binarytree.BinaryTree;
//import main.java.algorithms.binarytree.Node;
//
//public class PrintNodesAtDistanceKBT {
//	
//	public Node getNode(Node node, int k, Integer d){
//		d+=1;
//		
//		if(node.getRoot() ==  k){
//			return node;
//		}
//		if(node.getLeft()!=null){
//			return getNode(node.getLeft(), k, d);
//		}
//		if(node.getRight()!=null){
//			return getNode(node.getRight(), k, d);
//		}
//		return null;
//	}
//	public void traverseSubTree(Node node,int d){
//		if(d == 0){
//			System.out.println(node.getRoot());
//			return;
//		}
//		if(node.getLeft()!=null){
//			traverseSubTree(node.getLeft(), d-1);
//		}
//		if(node.getRight()!=null){
//			traverseSubTree(node.getRight(), d-1);
//		}
//	}
//	public void getSubTreeNodes(BinaryTree tree, int k, int d){
//		Integer count = new Integer(0);
//		Node node = getNode(tree.getRoot().getLeft(), k, count);
//		if(node!=null && node.getLeft()!=null){
//			traverseSubTree(node, d);
//			traverseSubTree(tree.getRoot().getRight(), d -count - 2);
//		}
//		else{
//			node = getNode(tree.getRoot().getRight(), k, count);
//			traverseSubTree(node,  d);
//			traverseSubTree(tree.getRoot().getLeft(), d -count - 2);
//		}
//		
//		
//		
//	}
//	public static void main(String[] args) {
//		BinaryTree tree = new BinaryTree();
//		  
//        /* Let us construct the tree shown in above diagram */
//        tree.root = new Node(20);
//        tree.root.left = new Node(8);
//        tree.root.right = new Node(22);
//        tree.root.right.left = new Node(29);
//        tree.root.right.left.left = new Node(27);
//        tree.root.right.right = new Node(25);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(12);
//        tree.root.left.right.left = new Node(10);
//        tree.root.left.right.right = new Node(14);
//        tree.root.left.right.right.right = new Node(15);
//        PrintNodesAtDistanceKBT k = new PrintNodesAtDistanceKBT();
//        k.getSubTreeNodes(tree, 22, 2);
//
//	}
//
//}
