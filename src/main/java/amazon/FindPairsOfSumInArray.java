package main.java.amazon;

import java.util.HashMap;
import java.util.Map;

public class FindPairsOfSumInArray {

	public static void find(int[] arr) {
		Map<Integer, Integer[]> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					Integer sum = arr[i] + arr[j];
					if(map.get(sum)!=null){
						Integer[] a= map.get(sum);
						if((arr[i]^arr[j]^a[0]^a[1]) != 0){
							System.out.println(map.get(sum)[0]+" "+ map.get(sum)[1]);
							System.out.println(arr[i]+" "+arr[j]);
							return;
						}
						
						
					}else{
						map.put(sum, new Integer[]{arr[i], arr[j]});
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		find(new int[]{3, 4, 7, 1, 2, 9, 8});
	}

}
