package main.java.amazon;

import main.java.amazon.BinarySearchTree.Node;

public class FindInorderSuccessorinBST {
	
	public int getMinvalue(Node node){
		while(node!=null){
			node = node.left;
		}
		return node.key;
	}
	public int findInorderSuccessor(BinarySearchTree tree, Node node){
		if(node.right!=null){
			return getMinvalue(node);
		}
		Node succ = null;
		Node start = tree.root;
		while(start!=null){
			if(node.key < start.key){
				succ = start;
				start = start.left;
			}else if(node.key > start.key){
				start = start.right;
			}else{
				break;
			}
		}
		return succ.key;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BinarySearchTree tree = new BinarySearchTree();
	        Node root = null, temp = null, suc = null, min = null;
	        tree.insert(20);
	        tree.insert(8);
	        tree.insert(22);
	        tree.insert(4);
	        tree.insert(12);
	        tree.insert(10);
	        tree.insert(14);
	        temp = tree.root.left.right.right;
	        FindInorderSuccessorinBST f= new FindInorderSuccessorinBST();
	        System.out.println(f.findInorderSuccessor(tree, temp));
	}

}
