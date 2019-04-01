package goldmansach;

import java.util.Arrays;
import java.util.Hashtable;

public class PrintAllAnagrams {

	public void sort(String[] arr, int l, int h) {
		if (l < h) {
			int mid = (l + h) / 2;
			sort(arr, 0, mid);
			sort(arr, mid + 1, h);
			merge(arr, l, mid, h);
		}

	}

	private void merge(String[] arr, int l, int mid, int h) {
		// TODO Auto-generated method stub
		int i = l;
		int j = h;
		int k = 0;
		String[] L = new String[mid-l+1];
		String[] R = new String[h-mid+1];
		for (int m = 0; m < L.length; m++) {
			L[m] = arr[m];
		}
		for (int m = 0; m < L.length; m++) {
			R[m] = arr[m];
		}
		while (i < j) {
			if(L[i].compareTo(R[j]) < 0){
				arr[k] = L[i];
				i++;
			}else if(L[i].compareTo(R[j]) > 0){
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while(i < L.length){
			arr[k] = L[i];
			i++;
		}
		
		while(j < R.length){
			arr[k] = R[j];
			j++;
		}
	}

	public void printAnagrams(String[] list) {
		int[] index = new int[list.length];
		for (int i = 0; i < list.length; i++) {
			index[i] = i;
			char[] arr = list[i].toCharArray();
			Arrays.sort(arr);
			list[i] = arr.toString();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
