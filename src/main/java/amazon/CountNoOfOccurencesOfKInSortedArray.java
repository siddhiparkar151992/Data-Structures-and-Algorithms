package main.java.amazon;

public class CountNoOfOccurencesOfKInSortedArray {
	public static class R{
		static int count = 0;
	}
	public int binSearch(int[] arr, int l, int h, int x){
		if(l==h && arr[l]== x) return 1;
		if(l < h){
			int mid = (l+h)/2;
			
			if(arr[mid] == x){
				int lcount = binSearch(arr, l, mid, x);
				int rcount = binSearch(arr, mid+1, h, x);
				return lcount + rcount;
			}else if(arr[mid] > x){
				return binSearch(arr, l, mid, x);
			}else {
				return binSearch(arr, mid+1, h, x);
			}
		}
		return 0;
	}
	public void findFreq(int[] arr, int x){
		int l =binSearch(arr, 0, arr.length-1, x);
		System.out.println(l);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountNoOfOccurencesOfKInSortedArray c= new CountNoOfOccurencesOfKInSortedArray();
		c.findFreq(new int[]{1, 1, 2, 2, 2, 2, 3, 3}, 1);
	}

}
