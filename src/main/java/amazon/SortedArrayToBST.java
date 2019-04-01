package main.java.amazon;

import java.util.Arrays;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class SortedArrayToBST {
	
	public int getMiddleIndex(int[] arr){
		return (int) Math.floor(arr.length /2);
	}
	
	public Node createNode(int[] arr, int startIndex, int endIndex){
		if(startIndex == endIndex || endIndex == arr.length){
			return new Node(arr[endIndex]);
		}
		if(startIndex > endIndex || endIndex > arr.length){
			return null;
		}
		
		int middleIndex = getMiddleIndex(Arrays.copyOfRange(arr, startIndex, endIndex+1));
		Node root = new Node(arr[middleIndex]);
		root.left = createNode(arr, startIndex, middleIndex-1);
		root.right = createNode(arr, middleIndex+1, endIndex);
		return root;
	}
	
	public BinaryTree getBST(int[] arr){
		BinaryTree tree= new BinaryTree();
		tree.setRoot(createNode(arr, 0, arr.length-1));
		
		return tree;
	}
	public static void main(String[] args) {
		SortedArrayToBST s = new SortedArrayToBST();
		BinaryTree t= s.getBST(new int[]{1,2,3,4});
		System.out.println(t);
	}

}
