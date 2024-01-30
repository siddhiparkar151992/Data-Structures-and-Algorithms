package main.java.algorithms.binarytree;

import java.util.Stack;

public class InorderTraversalUsingStack {

    public void inorder(BinaryTree tree) {
        Stack<Node> st= new Stack<>();

        Node curr = tree.root;
        while (curr !=null){
            st.push(curr);
            curr= curr.left;
        }

        while (!st.isEmpty()) {
            Node c = st.pop();

            System.out.print(" "+ c.root);
            if (c.right !=null) {
                st.push(c.right);
            }
        }
    }

    public static void main(String... args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        var v= new InorderTraversalUsingStack();
        v.inorder(tree);

    }
}
