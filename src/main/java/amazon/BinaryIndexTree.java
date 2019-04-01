package main.java.amazon;

public class BinaryIndexTree {
	
	public int getSum(int[] BITree, int i){
		int sum = 0;
		i=i+1;
		while(i > 0){
			sum+=BITree[i];
			i -= i &(-i);
		}
		return sum;
	}
	public void updateBITree(int[] BITree, int i, int elem) {
		i += 1;
	while (i < BITree.length) {
			BITree[i] += elem;
			i += i & (-i);
		}
		
	}

	public int[] constructBinaryTree(int[] arr) {
		int[] BITree = new int[arr.length+1];
			
		for (int i = 0; i < arr.length; i++) {
			updateBITree(BITree, i, arr[i]);
		}
		return BITree;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryIndexTree bTree= new BinaryIndexTree();
		int[] arr= new int[]{2, 1, 1, 3, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] biTree =bTree.constructBinaryTree(arr);
		int sum =bTree.getSum(biTree, 5);
		System.out.println(sum);
	}

}
