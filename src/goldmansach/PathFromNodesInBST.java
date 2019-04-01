package goldmansach;

import main.java.amazon.BinarySearchTree;
import main.java.amazon.BinarySearchTree.Node;

public class PathFromNodesInBST {

	public Node findPathUtil(Node curr, Node node1, Node node2) {
		if (curr == null)
			return null;
		if (node1.key < curr.key && node2.key < curr.key) {
			return findPathUtil(curr.left, node1, node2);
		} else if (node1.key > curr.key && node2.key > curr.key) {
			return findPathUtil(curr.right, node1, node2);
		}
		return curr;
	}

	public void printPath(Node curr, Node n) {
		if (curr == null || curr.key == n.key)
			return;
		System.out.println(curr.key);
		if (n.key < curr.key) {
			printPath(curr.left, n);
		} else {
			printPath(curr.right, n);
		}
	}

	public void findPath(BinarySearchTree tree, Node node1, Node node2) {
		Node lca = findPathUtil(tree.root, node1, node2);
		printPath(lca, node2);
		printPath(lca, node1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(20);
		tree.insert(8);
		tree.insert(22);
		tree.insert(4);
		tree.insert(12);
		tree.insert(10);
		tree.insert(14);
		PathFromNodesInBST p = new PathFromNodesInBST();
		p.findPath(tree, tree.root.right, tree.root.left.right.left);
	}

}
