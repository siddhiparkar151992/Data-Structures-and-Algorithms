package main.java.amazon;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

/**
 * Created by Siddhi Parkar on 22-11-2017.
 * Find Nodes At K Distance In BT
 */
public class FindNodesAtKDistanceInBT {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.right = new Node(3);
        tree.root.left.right.left = new Node(4);
        tree.root.left.right.right = new Node(5);
        tree.root.left.right.right.left = new Node(6);
        tree.root.left.right.right.left.left = new Node(0);
        tree.root.left.right.right.left.right = new Node(11);
        tree.root.right = new Node(2);
        tree.root.right.left = new Node(8);
        tree.root.right.right = new Node(9);
        tree.root.right.right.left = new Node(10);
        tree.root.right.right.left.right = new Node(14);
        tree.root.right.right.left.right.left = new Node(13);
        FindNodesAtKDistanceInBT f= new FindNodesAtKDistanceInBT();
        f.find(tree, 5, 2);

    }


    public int findUtil(Node node, int target, int k) {
        if (node == null) return -1;
        if (node.root == target) {
            printNodesDown(node, 0, k);
            return 1;
        }
        int lk = findUtil(node.left, target, k);
        if (lk != -1) {
            if (lk == k) {
                System.out.println(node.root);
            }else{
                printNodesDown(node.right, lk++, k-1);
                return lk;
            }

        }
        int rk = findUtil(node.right, target, k);
        if (rk != -1) {
            if (rk == k) {
                System.out.println(node.root);
            }else{
                printNodesDown(node.left, rk++, k-1);
                return rk;
            }
        }
        return -1;
    }

    private void printNodesDown(Node node, int lk, int k) {
        if(node == null) return;
        if(lk==k){
            System.out.println(node.root);
            return;
        }
        printNodesDown(node.left, lk+1, k);
        printNodesDown(node.right, lk+1, k);
    }

    public void find(BinaryTree tree, int target, int k) {
        findUtil(tree.root, target, k);
    }
}
