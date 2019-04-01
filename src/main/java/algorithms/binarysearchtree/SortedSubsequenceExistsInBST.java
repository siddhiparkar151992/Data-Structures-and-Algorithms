package main.java.algorithms.binarysearchtree;

import main.java.amazon.BinarySearchTree;

import java.util.Stack;

/**
 * Created by Siddhi Parkar on 27-01-2018.
 */
public class SortedSubsequenceExistsInBST {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(8);
        tree.insert(10);
        tree.insert(3);
        tree.insert(6);
        tree.insert(1);
        tree.insert(4);
        tree.insert(7);
        tree.insert(14);
        tree.insert(13);
        isExists(tree, new int[]{4, 6, 8, 14});
    }

    public static void isExists(BinarySearchTree tree, int[] arr) {
        int index = 0;
        boolean found = false;
        BinarySearchTree.Node current = tree.root;
        Stack<BinarySearchTree.Node> stack = new Stack<>();
        while (current != null) {
            stack.push(current);
            current = current.left;
        }
        while (!stack.isEmpty()) {
            BinarySearchTree.Node c = stack.pop();
            System.out.println(c.key);
            if (!found && index == 0 && arr[index] == c.key) {
                found = true;
                index++;
            } else {
                if (index > 0 && arr[index] == c.key) {
                    index++;
                }
            }
            BinarySearchTree.Node right = c.right;
            while (right != null) {
                stack.push(right);
                right = right.left;
            }
        }
        System.out.println(arr.length  == index);
    }
}
