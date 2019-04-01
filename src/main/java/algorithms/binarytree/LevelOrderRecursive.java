package main.java.algorithms.binarytree;

/**
 * Created by Siddhi Parkar on 04-03-2018.
 */
public class LevelOrderRecursive {
    public static void main(String[] args) {

    }

    public int height(BinaryTree tree) {
        int height = height(tree.root);
        return height;
    }

    private int height(Node root) {
        if (root == null) return 0;
        int lHeight = height(root.left);
        int rHeight = height(root.right);
        return 1 + Math.max(lHeight, rHeight);
    }

    private void printLevel(Node node, int currentLevel) {
        if (node == null) return;
        if (currentLevel == 1) System.out.println(node.root);
        else if (currentLevel > 1){
            printLevel(node.left, currentLevel - 1);
            printLevel(node.right, currentLevel - 1);
        }
    }

    public void traverse(BinaryTree tree) {
        int h = height(tree);
        for (int i = 1; i <= h; i++) {
            printLevel(tree.root, i);
        }
    }
}
