package goldmansach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class FormBiggestNumberFromArray {
	
	public class NumberComparator implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {
			int paddedZeros = o1.toString().length();
			int newo2 = o2;
			while(paddedZeros >0){
				newo2 *= 10;
				paddedZeros --;
			}
			newo2 = o1+newo2;
			
			int newo1 = o1;
			paddedZeros = o2.toString().length();
			while(paddedZeros >0){
				newo1 *= 10;
				paddedZeros --;
			}
			newo1 = o2+newo1;
			
			return newo2 - newo1;
		}

		
	}
	public void printBiggestNumber(java.util.List<Integer> list){
		Collections.sort(list, new NumberComparator());
		System.out.println(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FormBiggestNumberFromArray f= new FormBiggestNumberFromArray();
		java.util.List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(34);
		list.add(3);
		list.add(98);
		list.add(9);
		list.add(76);
		list.add(45);
		list.add(4);
		
		f.printBiggestNumber(list);
	}

}
