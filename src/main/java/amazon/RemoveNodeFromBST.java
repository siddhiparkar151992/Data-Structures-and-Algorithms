package main.java.amazon;

import main.java.amazon.BinarySearchTree.Node;

public class RemoveNodeFromBST {
	
	
	public Node removeFromBST(Node node, int data){
		if(node == null) return node;
		if(data < node.key){
			node.left = removeFromBST(node.left, data);
		}else if(data > node.key){
			node.right = removeFromBST(node.right, data);
		}else{
			if(node.key == data){
				if(node.left == null){
					return node.right;
				}else if(node.right ==null){
					return node.left;
				}
				
				node.key = findMin(node.right);
				node.right = removeFromBST(node.right, node.key);
			}
		}
		return node;
	}
	private int findMin(Node node) {
		int min = node.key;
		while(node!=null){
			min = node.key;
			node = node.left;
		}
		return min;
	}
	
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		 
        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
        20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        tree.insert(75);
        tree.insert(90);
//        tree.inorder();
        RemoveNodeFromBST r = new RemoveNodeFromBST();
        r.removeFromBST(tree.root, 70);
        tree.inorder();

	}

}
