package main.java.amazon;

import java.util.HashMap;
import java.util.Map;

public class FindThelargestSubarrayWithSum0 {

	public int find(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		int cs = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			cs += arr[i];
			if (cs == 0) {
				max = i + 1;
			}
			if (map.get(cs) != null) {
				max = Math.max(max, i - map.get(cs));
			} else {
				map.put(cs, i);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindThelargestSubarrayWithSum0 f = new FindThelargestSubarrayWithSum0();
		f.find(new int[] { 15, -2, 2, -8, 1, 7, 10, 13 });
	}

}
