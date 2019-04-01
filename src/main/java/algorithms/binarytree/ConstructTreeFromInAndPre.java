package main.java.algorithms.binarytree;

/**
 * Created by Siddhi Parkar on 06-01-2018.
 */
public class ConstructTreeFromInAndPre {

    public int preIndex= 0;
    public static void main(int[] args) {

    }

    private int search(int[] arr, int in) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == in){
                return i;
            }
        }
        return -1;
    }
    
    public Node constructUtil(int[] in, int[] pre, int s, int e){
        Node node =new Node(pre[preIndex++]);
        if(s == e){
            return node;
        }
        int i = search(in, preIndex);
        node.left = constructUtil(in, pre, s,i-1);
        node.right = constructUtil(in, pre, i+1,e);
        return node;
    }
    public void construct(int[] in, int[] pre) {
        BinaryTree tree = new BinaryTree();
        
    }
}
