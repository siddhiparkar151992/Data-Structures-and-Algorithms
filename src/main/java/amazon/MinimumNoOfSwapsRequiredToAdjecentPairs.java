package main.java.amazon;

import java.util.HashMap;
import java.util.Map;

public class MinimumNoOfSwapsRequiredToAdjecentPairs {
	
	
	int[] index = new int[7];
	Integer minswaps;
	Integer currentSwaps;
	
	public int minSwaps(int[] arr, int[] pairs, int i, int[] index){
		if(i >= arr.length)
			return 0;
		
		if(pairs[arr[i]] ==  arr[i+1]){
			return minSwaps(arr, pairs, i+2, index);
		}
		
		int fSwapIndex = index[pairs[arr[i]]];
		index[pairs[arr[i]]] = i +1;
		index[arr[i+1]] = fSwapIndex;
		int temp = arr[i+1];
		arr[i+1] = arr[fSwapIndex];
		arr[fSwapIndex] = temp;
		
		int a =  minSwaps(arr, pairs, i+2, index);
		int temp2 = arr[i+1];
		arr[i+1] = arr[fSwapIndex];
		arr[fSwapIndex] = temp2;
		
		index[pairs[arr[i]]] = fSwapIndex;
		index[arr[i+1]] = i +1;
		
		int sSwapIndex = index[pairs[arr[i+1]]];
		int stemp = arr[i];
		index[pairs[arr[i]]] = i +1;
		index[arr[i+1]] = sSwapIndex;
		arr[i] = arr[sSwapIndex];
		arr[sSwapIndex] = stemp;
		
		int b =  minSwaps(arr, pairs, i+2, index);
		int stemp2 = arr[i];
		arr[i] = arr[sSwapIndex];
		arr[sSwapIndex] = stemp2;
		
		index[pairs[arr[i]]] = sSwapIndex;
		index[arr[i+1]] = i +1;
		
		return 1+ Math.min(a, b);
	}
	
	public void minSwap(int[] arr, int[] pairs){
		for(int i=1;i<arr.length;i++){
			index[arr[i]] =  i;
		}
		System.out.println(minSwaps(arr, pairs, 1, index));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,3,5,6,4,1,2};
		int[] pairs= {0, 3, 6, 1, 5, 4, 2};
		MinimumNoOfSwapsRequiredToAdjecentPairs m = new MinimumNoOfSwapsRequiredToAdjecentPairs();
		m.minSwap(arr, pairs);
	}

}
