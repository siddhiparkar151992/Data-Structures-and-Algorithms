package main.java.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortArrayAccordingToOtherArray {

	public void sortArray(int[] arr1, int[] arr2) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < arr1.length; i++) {
			if (map.get(arr1[i]) != null) {
				Integer count = map.get(arr1[i]);
				count += 1;
				map.put(arr1[i], count);
			} else {
				map.put(arr1[i], 1);
			}
		}
		ArrayList<Integer> remained = new ArrayList<Integer>();
		for (int i = 0; i < arr2.length; i++) {
			if (map.get(arr2[i]) != null) {
				int c = map.get(arr2[i]) ;
				for(int j=0;j<c;j++){
					output.add(arr2[i]);
				}
				map.remove(arr2[i]);
			}
		}
		Iterator i = map.keySet().iterator();
		while(i.hasNext()){
			int key = (int) i.next();
			remained.add(key);
		}
		
		Collections.sort(remained);
		output.addAll(remained);
		System.out.println(output);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortArrayAccordingToOtherArray s = new SortArrayAccordingToOtherArray();
		s.sortArray(new int[]{2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8}, new int[]{2, 1, 8, 3});
	}

}
