package main.java.amazon;

public class SegmentTree {

	int[] segmentTree;

	public SegmentTree(int n){
		int x= (int) Math.ceil(Math.log(n)/ Math.log(2));
		segmentTree = new int[2*(int) (Math.pow(2,x)-1)];
	}
	
	public int getMid(int l, int r){
		return l +(r-l)/2;
	}
	public int constructUtil(int[] arr, int l, int r, int i){
		if(l==r){
			segmentTree[i] = arr[l];
			return segmentTree[i];
		}
		int mid = getMid(l, r);
		segmentTree[i] = constructUtil(arr, l, mid, 2*i+1) + constructUtil(arr, mid+1, r, 2*i+2);
		return segmentTree[i];
	}
	
	public int getSumUtil(int i, int l, int r, int ss, int se){
		if(l<=ss && r>=se){
			return segmentTree[i];
		}
		if(l < ss || r > se){
			return 0;
		}
		int mid = getMid(ss, se);
		return getSumUtil(2*i+1, l,r , ss, mid) + getSumUtil(2*i+2, l, r, mid+1, se);
	}
	public int getSum(int n, int l, int r){
		if(l > n-1 || l< 0 || r> n-1 || r< 0){
			System.out.println("invalid range input");
			return -1;
		}
		return getSumUtil(0, l, r, 0, n -1);
	}
	public void construct(int[] arr){
		constructUtil(arr, 0, arr.length-1, 0);
	}
	public static void main(String[] arg){
		int[] arr = new int[]{1, 3, 5, 7, 9, 11};
		SegmentTree s= new SegmentTree(arr.length);
		s.construct(arr);
		System.out.println(s.getSum(arr.length, 0, 4));
	}

}
