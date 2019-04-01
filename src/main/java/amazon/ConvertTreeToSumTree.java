package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

/**
 * Created by Siddhi Parkar on 16-11-2017.
 */
public class ConvertTreeToSumTree {

    public int convertUtil(Node node) {
        if(node == null) {
            return 0;
        }
        int value = node.root;
        int lsum = convertUtil(node.left);
        int rsum = convertUtil(node.right);
        node.root = lsum+rsum;
        return value+lsum+rsum;
    }
    public void convert(BinaryTree tree) {
        convertUtil(tree.root);
        System.out.print(tree);
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        /* Constructing tree given in the above figure */
        tree.root = new Node(10);
        tree.root.left = new Node(-2);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(-4);
        tree.root.right.left = new Node(7);
        tree.root.right.right = new Node(5);
        ConvertTreeToSumTree c= new ConvertTreeToSumTree();
        c.convert(tree);
    }
}
