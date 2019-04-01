package main.java.algorithms.binarytree;

public class ChildrenSumProperty {

	public boolean isSumPropertyNode(Node node) {
		int leftSum = 0;
		int rightSum = 0;
		if (node == null || (node.left == null && node.right == null)) {
			return true;
		}
		if (node.left != null) {
			leftSum = node.left.root;
		}
		if (node.right != null) {
			rightSum = node.right.root;
		}

		if (node.root == leftSum + rightSum && isSumPropertyNode(node.left) && isSumPropertyNode(node.right))
			return true;
		return false;

	}

	public boolean isSumPropertyTree(BinaryTree tree) {

		return isSumPropertyNode(tree.root);

	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10);
		tree.root.left = new Node(8);
		tree.root.right = new Node(2);
		tree.root.left.left = new Node(3);
		tree.root.left.right = new Node(5);
		tree.root.right.right = new Node(2);
		ChildrenSumProperty c= new ChildrenSumProperty();
		System.out.println(c.isSumPropertyTree(tree));
	}
}
