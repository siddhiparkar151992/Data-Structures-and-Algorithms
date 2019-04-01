package main.java.amazon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class RearrangeCharacterStringNoTwoAdjacent {
	MaxHeap heap = new MaxHeap();
	public class MaxHeap {
		public int getTop(int[] arr) {
			if (arr.length == 0) {
				return -1;
			}
			return arr[0];
		}

		public Object[] deleteRoot(Object[][] arr) {
			Object[] del = arr[0];
			Object[][] mod = new Object[arr.length - 1][2];
			for (int i = 1; i < arr.length; i++) {
				mod[i-1] = arr[i];
			}
			arr = mod;
			maxHeapify(arr, 0);
			return new Object[]{del, arr};

		}

		public void maxHeapify(Object[][] arr, int i) {
			int l = 2 * i + 1;
			int r = l + 1;
			int max = i;
			if (l < arr.length && (int) arr[l][1] > (int) arr[max][1]) {
				max = l;
			}
			if (r < arr.length && (int) arr[r][1] > (int) arr[max][1]) {
				max = r;
			}
			if (i != max) {
				Object[] temp = arr[i];
				arr[i] = arr[max];
				arr[max] = temp;
				maxHeapify(arr, i);
			}

		}
		public Object[][] insert(int n, Character ch, Object[][] arr){
			Object[][] arr1 = new Object[arr.length+1][2];
			arr1 = Arrays.copyOf(arr, arr.length+1);
			arr1[arr1.length-1] = new Object[]{ch, n};
			maxHeapify(arr1, 0);
			return arr1;
		}
		public void heapify(Object[][] arr) {
			for (int i = arr.length / 2 - 1; i >= 0; i--) {
				maxHeapify(arr, i);
			}
		}
	}

	public void rearrange(String str) {
		
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if(map.get(str.charAt(i))!=null){
				Integer count = map.get(str.charAt(i));
				count+=1;
				map.put(str.charAt(i), count);
			}else{
				map.put(str.charAt(i), 1);
			}
		}
		
		Object[][] heapArr = new Object[map.keySet().size()][2];
		Iterator<Entry<Character, Integer>> it = map.entrySet().iterator();
		int i=0;
		while(it.hasNext()){
			Map.Entry<Character, Integer>  entry = it.next();
			heapArr[i][0] = entry.getKey();
			heapArr[i][1] = entry.getValue();
			i++;
		}
		
		heap.heapify(heapArr);
		Object[] previous = new Object[]{'#', -1};
		String result = "";
		while(heapArr.length!=0){
			Object[] deleted =  heap.deleteRoot(heapArr);
			Object[] current =(Object[])deleted[0];
			heapArr = (Object[][]) deleted[1];
			result = result.concat(current[0].toString());
			if((int)previous[1]>0){
				heapArr = heap.insert((int)previous[1], (Character)previous[0], heapArr);
			}
			
			current[1] = (int)current[1]-1;
			previous = current;
			
		}	
		System.out.println(result);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RearrangeCharacterStringNoTwoAdjacent r= new RearrangeCharacterStringNoTwoAdjacent();
		r.rearrange("bbbaa");
	}

}
