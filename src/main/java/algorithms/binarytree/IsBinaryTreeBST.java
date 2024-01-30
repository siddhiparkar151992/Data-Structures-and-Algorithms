package main.java.algorithms.binarytree;

public class IsBinaryTreeBST {

    public boolean isBST(BinaryTree tree, Node node, int max){
        if (node ==null) {
            return true;
        }

        if (node.left !=null && node.left.root > max) {
            return false;
        }
        if (node.right !=null  && node.right.root < max){
            return false;
        }
        boolean isLeftBST = node.left == null ? true:
                isBST(tree, node.left, node.left.root);

        boolean isRightBST = node.right == null ? true:
                isBST(tree, node.right, node.right.root);

        return isLeftBST && isRightBST;
    }
    public void isBST(BinaryTree tree) {
        System.out.println(isBST(tree, tree.root, tree.root.root));
    }

    public static void main(String... args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(1);

        // root->right->left = newNode(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        IsBinaryTreeBST i = new IsBinaryTreeBST();
        BinaryTree t= new  BinaryTree();
        t.setRoot(root);
        i.isBST(t);
    }
}
