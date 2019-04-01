package main.java.amazon;

import java.util.HashMap;
import java.util.Map;

public class CountDistinctElementsInEveryWindow {

	public void count(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;
		for (int i = 0; i < k; i++) {
			if (map.get(arr[i]) != null) {
				int c = map.get(arr[i]);
				c++;
				map.put(arr[i], c);
			} else {
				map.put(arr[i], 1);
			}

		}

		count = map.size();
		System.out.println(count);
		int firstWindowElem = 0;
		for (int i = k; i < arr.length; i++) {
			Object f = map.get(arr[firstWindowElem]);
			if (f!=null && (int) f > 1) {
				int r = (int) f;
				map.put(arr[firstWindowElem], r-1);
			} else {
				map.remove(arr[firstWindowElem]);
			}

			firstWindowElem += 1;
			if (map.get(arr[i]) != null) {
				int r = map.get(arr[i]);
				map.put(arr[i], r+1);
			} else {
				map.put(arr[i], 1);
			}
			System.out.println(map.size());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDistinctElementsInEveryWindow c = new CountDistinctElementsInEveryWindow();
		c.count(new int[] { 1, 2, 1, 3, 4, 2, 3 }, 4);
	}

}
