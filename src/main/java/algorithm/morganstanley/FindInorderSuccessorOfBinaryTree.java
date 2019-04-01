package main.java.algorithm.morganstanley;

import main.java.amazon.BinarySearchTree;
import main.java.amazon.BinarySearchTree.Node;

public class FindInorderSuccessorOfBinaryTree {

	public int minValue(Node node) {
		Node current = node;
		while (current.left != null) {
			current = current.left;
		}
		return current.key;

	}

	public int inOrderSuccessor(BinarySearchTree tree, Node keyNode) {
		Node succ = null;
		if (keyNode.right != null) {
			return minValue(keyNode.right);
		}

		Node current = tree.root;
		while (current != null) {
			if (current.key > keyNode.key) {
				succ = current;
				current = current.left;
			} else if (current.key < keyNode.key) {
				current = current.left;
			} else {
				break;
			}
		}
		return succ.key;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindInorderSuccessorOfBinaryTree f = new FindInorderSuccessorOfBinaryTree();
		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(20);
		tree.insert(8);
		tree.insert(22);
		tree.insert(4);
		tree.insert(12);
		tree.insert(10);
		tree.insert(14);

		Node temp = tree.root.left.right.right;

		System.out.println(f.inOrderSuccessor(tree, temp));
	}

}
