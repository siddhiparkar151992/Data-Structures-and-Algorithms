package goldmansach;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

public class LevelOrderReverse {
	
	public void reverseUtil(Queue<Node> mainQueue) {
		Queue<Node> q= new LinkedList<>();
		int k = mainQueue.size();
		while(k>0){
			Node n = mainQueue.poll();
			q.add(n);
			if(n.left!=null)mainQueue.add(n.left);
			if(n.right!=null)mainQueue.add(n.right);
			k--;
		}
		if(mainQueue.size() >0)reverseUtil(mainQueue);
		while(!q.isEmpty()) {
			System.out.print(q.poll().root+" ");
		}
		System.out.println();
		
 	}
	public void levelOrderReversal(BinaryTree tree){
		Queue<Node> q= new LinkedList<>();
		q.add(tree.root);
		reverseUtil(q);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LevelOrderReverse l = new LevelOrderReverse();
		BinaryTree tree= new BinaryTree();
		tree.root = new Node(1);
		tree.root.left =new Node(2);
		tree.root.right =new Node(3);
		tree.root.left.left =new Node(4);
		tree.root.left.right =new Node(5);
		tree.root.right.left =new Node(6);
		tree.root.right.right =new Node(7);
		l.levelOrderReversal(tree);
	}

}
