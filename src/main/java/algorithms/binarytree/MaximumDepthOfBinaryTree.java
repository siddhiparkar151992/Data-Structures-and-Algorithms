package main.java.algorithms.binarytree;

public class MaximumDepthOfBinaryTree {

    public int depth(Node node, int height) {
        if (node == null) {
            return height;
        }

        int l = 0;
        if (node.left != null ) {
            l = depth(node.left, 1+height);
        }
        int r = 0;
        if (node.right != null ) {
            r = depth(node.right, 1+height);
        }

        return 1 + Math.max(l, r);
    }

    public void findDepth(BinaryTree tree) {
        System.out.println(depth(tree.root, 0));
    }
    public static void main(String... args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(10);

        var m = new MaximumDepthOfBinaryTree();
        m.findDepth(tree);
    }
}
