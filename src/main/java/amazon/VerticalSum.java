package main.java.amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import main.java.algorithms.binarytree.BinaryTree;
import main.java.algorithms.binarytree.Node;

//Class for a Binary Tree
class VerticalSum {


 // Method to be called by the consumer classes 
 // like Main class
 public void VerticalSumMain(BinaryTree tree) { VerticalSumm(tree.root); }

 // A wrapper over VerticalSumUtil()
 private void VerticalSumm(Node root) {

     // base case
     if (root == null) { return; }

     // Creates an empty hashMap hM
     HashMap<Integer, List<Integer>> hM =
                new HashMap<Integer, List<Integer>>();

     // Calls the VerticalSumUtil() to store the 
     // vertical sum values in hM
     VerticalSumUtil(root, 0, hM);

     // Prints the values stored by VerticalSumUtil()
     if (hM != null) {
         System.out.println(hM.entrySet());
     }
 }

 // Traverses the tree in Inoorder form and builds
 // a hashMap hM that contains the vertical sum
 private void VerticalSumUtil(Node root, int hD,
                      HashMap<Integer, List<Integer>> hM) {

     // base case
     if (root == null) {  return; }

     // Store the values in hM for left subtree
     VerticalSumUtil(root.left, hD - 1, hM);

     // Update vertical sum for hD of this node
     List<Integer> prevSum = hM.get(hD)!= null ? hM.get(hD): new ArrayList<Integer>();
     prevSum.add(root.root);
     hM.put(hD, prevSum );

     // Store the values in hM for right subtree
     VerticalSumUtil(root.right, hD + 1, hM);
 }
 public static void main(String[] args) {
     /* Create following Binary Tree
           1
         /    \
       2        3
      / \      / \
     4   5    6   7

     */
     Node root = new Node(1);
     root.setLeft(new Node(2));
     root.setRight(new Node(3));
     root.left.setLeft(new Node(4));
     root.left.setRight(new Node(5));
     root.right.setLeft(new Node(6));
     root.right.setRight(new Node(7));
     BinaryTree t = new BinaryTree();
     t.root =  root;

     System.out.println("Following are the values of" + 
                        " vertical sums with the positions" +
                     " of the columns with respect to root ");
     
     VerticalSum v = new VerticalSum();
     v.VerticalSumMain(t);
     System.out.println();
     
 }
}


 
