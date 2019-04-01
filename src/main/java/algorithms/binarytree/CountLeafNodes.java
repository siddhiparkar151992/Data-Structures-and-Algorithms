package main.java.algorithms.binarytree;

public class CountLeafNodes {

	int countUtil(Node node) {
		if (node == null)
			return 0;
		if (node.left == null && node.right == null) {
			return 1;
		}
		int left = countUtil(node.left);
		int right = countUtil(node.right);
		return left + right;

	}

	public int countLeafNodes(BinaryTree tree) {
		return countUtil(tree.root);
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		CountLeafNodes c= new CountLeafNodes();
		System.out.println(c.countLeafNodes(tree));
	}

}
