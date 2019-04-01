package main.java.algorithms.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Siddhi Parkar on 02-01-2018.
 */
public class LevelOrderTraversal {
    public static void main(String[] args) {
        BinaryTree  tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(7);
        tree.root.left.right.right = new Node(8);
        tree.root.right = new Node(3);
        tree.root.right.right = new Node(6);
        tree.root.right.right.left = new Node(9);
        LevelOrderTraversal l = new LevelOrderTraversal();
        l.traverse(tree);
    }

    public void traverse(BinaryTree tree) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(tree.root);
        queue.add(new Node(-9999));
        while (!queue.isEmpty()) {
            while (!queue.isEmpty() && queue.peek().root != -9999) {
                Node n = queue.poll();
                System.out.print(n.root);
                if(n.left!=null) {
                    queue.add(n.left);
                }

                if(n.right!=null) {
                    queue.add(n.right);
                }
            }
            if(!queue.isEmpty() && queue.peek().root == -9999){
                queue.poll();
                System.out.println();
            }

            if(!queue.isEmpty()){
                queue.add(new Node(-9999));
            }
        }
    }
}
