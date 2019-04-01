package main.java.algorithms.binarytree;

import java.util.*;

/**
 * Created by Siddhi Parkar on 06-01-2018.
 */
public class PrintBInaryTreeVertical {
    public hd h = new hd();
    public Map<Integer, List<Integer>> map = new HashMap<>();

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        /* Let us construct the tree shown in above diagram */
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.right.left.right = new Node(8);
        tree.root.right.right.right = new Node(9);

        PrintBInaryTreeVertical p = new PrintBInaryTreeVertical();
        p.printVertical(tree);
    }

    public void findLevel(Node node, int height) {
        if (node == null) {
            return;
        }
        if (map.get(height) != null) {
            List<Integer> li = map.get(height);
            li.add(node.root);
            map.put(height, li);
        } else {
            List<Integer> li = new ArrayList<>();
            li.add(node.root);
            map.put(height, li);
        }

        h.min = Math.min(h.min, height);
        h.max = Math.max(h.max, height);
        if (node.left != null) {
            findLevel(node.left, height - 1);
        }
        if (node.right != null) {
            findLevel(node.right, height + 1);
        }
    }

    public void printVertical(BinaryTree tree) {
        findLevel(tree.root, 0);
        for (int i = h.min; i <=h.max; i++) {
            Iterator it = map.get(i).iterator();
            while(it.hasNext()){
                System.out.print(" "+it.next());
            }
            System.out.println();

        }
    }

    public class hd {
        public int min = 0;
        public int max = 0;
    }
}
