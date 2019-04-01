package main.java.algorithms.linkedlist;

import main.java.algorithms.binarytree.BinaryTree;

/**
 * Created by Siddhi Parkar on 06-01-2018.
 */
public class ConstructTreeFromLL {
    public void construct(LinkedList list){
        BinaryTree tree = new BinaryTree();
        tree.root = constructUtil(list.head, 0);
        System.out.println(tree);
    }
    public main.java.algorithms.binarytree.Node constructUtil(Node node, int index){
        if(node == null) return null;
        main.java.algorithms.binarytree.Node treeNode = new main.java.algorithms.binarytree.Node(node.data);
        int c = 2*index+1;
        Node start = node;
        while(start!=null && c>=0){
            start = start.next;
            c--;
        }
        treeNode.left = constructUtil(start, 2*index+1);

        c = 2*index+2;
        start = node;
        while(start!=null && c>=0){
            start = start.next;
            c--;
        }
        treeNode.right = constructUtil(start, 2*index+2);
        return  treeNode;
    }
    public static void main(String[] args){
        ConstructTreeFromLL  c= new ConstructTreeFromLL();
        LinkedList l = new LinkedList();
        l.insertNode(36, 0);
        l.insertNode(30, 0);
        l.insertNode(25, 0);
        l.insertNode(15, 0);
        l.insertNode(12, 0);
        l.insertNode(10, 0);
    }
}
