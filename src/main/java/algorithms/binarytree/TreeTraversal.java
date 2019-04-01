package main.java.algorithms.binarytree;

public class TreeTraversal {
	
	public static void main(String[] args){
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
//        tree.printInorder();
//        System.out.println(tree.height(tree.root));
        tree.BFS();
	}

}
