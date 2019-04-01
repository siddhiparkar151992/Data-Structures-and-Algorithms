package main.java.amazon;

public class FindPairsInArrayWhosSumIsLessThanX {

	public int countPairs(int[] arr, int x) {
		int l = 0;
		int result = 0;
		int r = arr.length - 1;
		while (l < r) {
			if(arr[l] + arr[r] < x){
				result+=(r-l);
				l++;
			}else{
				r--;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindPairsInArrayWhosSumIsLessThanX f= new FindPairsInArrayWhosSumIsLessThanX();
		int r = f.countPairs(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 7);
		System.out.println(r);
	}

}
