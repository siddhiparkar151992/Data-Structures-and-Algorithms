package bloomberg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindCommonElementsInSortedArrays {
	
	
	public static int max(int i, int j, int k, int l, 
			List<Integer> l1, List<Integer> l2, List<Integer> l3, List<Integer> l4){
		int max = l1.get(i);
		if(l2.get(j) > max) {
			max = l2.get(j);
		}
		if(l3.get(k) > max) {
			max = l3.get(k);
		}
		if(l4.get(l) > max) {
			max = l4.get(l);
		}
		return max;
	}
	public static void find(List<Integer> l1, List<Integer> l2, List<Integer> l3, List<Integer> l4) {
		Collections.sort(l1);
		Collections.sort(l2);
		Collections.sort(l3);
		Collections.sort(l4);
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;

		while (i < l1.size() && j < l2.size() && k < l3.size() && l < l4.size()) {
			if(l1.get(i).equals(l2.get(j)) && 
					l2.get(j).equals(l3.get(k)) && 
					l3.get(k).equals(l4.get(l)) ){
				System.out.println(l1.get(i));
				i++;
				j++;
				k++;
				l++;
			}else{
				int max = max(i, j, k, l, l1, l2, l3, l4);
				if(l1.get(i) < max) {
					i++;
				}
				if(l2.get(j) < max) {
					j++;
				}
				if(l3.get(k) < max) {
					k++;
				}
				if(l4.get(l) < max) {
					l++;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<>();
		l1.add(6);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(0);
		
		List<Integer> l2 = new ArrayList<>();
		l2.add(2);
		l2.add(4);
		l2.add(5);
		l2.add(6);
		l2.add(3);
		
		List<Integer> l3 = new ArrayList<>();
		l3.add(7);
		l3.add(3);
		l3.add(9);
		l3.add(2);
		l3.add(5);
		
		List<Integer> l4 = new ArrayList<>();
		l4.add(4);
		l4.add(6);
		l4.add(2);
		l4.add(3);
		l4.add(0);
		
		find(l1, l2, l3, l4);
	}

}
