package main.java.algorithms.binarysearchtree;

import main.java.amazon.BinarySearchTree;

/**
 * Created by Siddhi Parkar on 27-01-2018.
 */
public class ConstructBSTFromPreorder {


    public static void main(String[] args) {
        ConstructBSTFromPreorder c = new ConstructBSTFromPreorder();
        c.construct(new int[]{10, 5, 1, 7, 40, 50});
    }

    public BinarySearchTree.Node constructUtil(int[] arr, PreIndex index, int key, int min, int max) {
        if (index.index >= arr.length) return null;
        BinarySearchTree.Node root = null;
        if (key > min && key < max) {
            root = new BinarySearchTree.Node(key);
            index.index += 1;
            if (index.index < arr.length) {
                root.left = constructUtil(arr, index, arr[index.index], min, key);
                root.right = constructUtil(arr, index, arr[index.index], key, max);
            }
        }
        return root;
    }

    public void construct(int[] arr) {
        PreIndex p = new PreIndex();
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = constructUtil(arr, p, arr[0], Integer.MIN_VALUE, Integer.MAX_VALUE);
        tree.inorder();
    }

    public class PreIndex {
        int index = 0;
    }
}
