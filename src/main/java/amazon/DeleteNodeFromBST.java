package main.java.amazon;

import main.java.amazon.BinarySearchTree.Node;

public class DeleteNodeFromBST {
	
	public int minValue(Node node){
		int min = node.key;
		while(node.left!=null){
			min = node.left.key;
			node = node.left;
		}
		return min;
	}
	public Node deleteUtil(Node node, int key){
		if(node == null) return node;
		if(node.key < key){
			node.right = deleteUtil(node.right, key);
		}else if(node.key > key){
			node.left = deleteUtil(node.left, key);
		}
		else{
			if(node.left == null){
				return node.right;
			}else if(node.right == null){
				return node.left;
			}
			
			node.key = minValue(node.right);
			node.right = deleteUtil(node.right, node.key);
		}
		return node;
		
	}
	public void deleteNode(BinarySearchTree tree, int key){
		tree.root = deleteUtil(tree.root, key);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        
        DeleteNodeFromBST d = new DeleteNodeFromBST();
        d.deleteNode(tree, 50);
        tree.inorder();
 
	}

}
