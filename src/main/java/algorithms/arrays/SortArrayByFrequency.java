package main.java.algorithms.arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortArrayByFrequency {
	public class MapUtil {
		public <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
			List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(map.entrySet());
			Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
				public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
					return -(o1.getValue()).compareTo(o2.getValue());
				}
			});

			Map<K, V> result = new LinkedHashMap<K, V>();
			for (Map.Entry<K, V> entry : list) {
				result.put(entry.getKey(), entry.getValue());
			}
			return result;
		}
	}

	public int[] sortElementsUsingHashing(int[] arr) {
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
		int[] output = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (countMap.get(arr[i]) != null) {
				countMap.put(arr[i], countMap.get(arr[i]) + 1);
			} else {
				countMap.put(arr[i], 1);
			}
		}
		MapUtil u = new MapUtil();
		countMap = u.sortByValue(countMap);
		int c=0;
		for(Map.Entry<Integer, Integer> entry: countMap.entrySet()){
			
			int number = entry.getKey();
			int count = entry.getValue();
			for(int k=0;k<count;k++){
				output[c] = number;
				c+=1;
			}
			
		}

		return output;
	}

	public static void main(String[] args) {
		SortArrayByFrequency s = new SortArrayByFrequency();
		System.out.println(s.sortElementsUsingHashing(new int[]{2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12}));
	}
}
