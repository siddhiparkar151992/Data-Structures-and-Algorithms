package bloomberg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class SortElementsByFrequency {

	public static void sort(int[] arr) {
		HashMap<Integer, Integer[]> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if(map.get(arr[i])!=null){
				Integer[] freq = map.get(arr[i]);
				freq[0]++;
				map.put(arr[i], freq);
			}else{
				map.put(arr[i], new Integer[]{1, i});
			}
		}
		
		Comparator<Entry<Integer, Integer[]>> comp = new Comparator<Map.Entry<Integer,Integer[]>>() {

			@Override
			public int compare(Entry<Integer, Integer[]> o1, Entry<Integer, Integer[]> o2) {
				Integer count1 = o1.getValue()[0];
				Integer count2 = o2.getValue()[0];
				Integer index1 = o1.getValue()[1];
				Integer index2 = o2.getValue()[1];
				return -count1.compareTo(count2) == 0 ? index1.compareTo(index2) : -count1.compareTo(count2);
			}	
		};
		
		List<Entry<Integer, Integer[]>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, comp);
		
		int i =0 ;
		for(Entry<Integer, Integer[]> entry: list){
			for(int j=0;j<entry.getValue()[0];j++){
				arr[i] = entry.getKey();
				i++;
			}
		}
		System.out.println(arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sort(new int[]{2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8});
	}

}
