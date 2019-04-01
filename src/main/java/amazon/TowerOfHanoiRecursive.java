package main.java.amazon;

import java.util.Stack;

public class TowerOfHanoiRecursive {
	
	public void move(Stack<Integer> source, Stack<Integer> dest, char s, char d){
		Integer cs = null;
		if(source.size()!=0){
			cs = source.peek();
		}
		
		Integer cd = null;
		if(dest.size()!=0){
			cd = dest.peek();
		}
		if(cs == null){
			source.push(cd);
			source.pop();
			System.out.println("moved from "+d+" to "+s);
		}else if(cd == null){
			dest.push(cs);
			dest.pop();
			System.out.println("moved from "+s+" to "+d);
		}
		else if(cs > cd){
			source.push(cd);
			System.out.println("moved from "+d+" to "+s);
		}else{
			dest.push(cs);
			System.out.println("moved from "+s+" to "+d);
		}
	}
	public void towerOfHanoi(int n, Stack<Integer> src, Stack<Integer> aux, Stack<Integer> dest) {
		int t = (int) (Math.pow(2, n) - 1);
		for (int i = 0; i < t; i++) {
			if (i % 3 == 0) {
				move(src, dest, 'S', 'D');
			}
			if (i % 3 == 1) {
				move(src, aux, 'S', 'A');
			}
			if (i % 3 == 2) {
				move(aux, dest, 'A', 'D');
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> src = new Stack<>();
		src.push(3);
		src.push(2);
		src.push(1);
		
		Stack<Integer> aux = new Stack<>();
		Stack<Integer> dest = new Stack<>();
		TowerOfHanoiRecursive t= new TowerOfHanoiRecursive();
		t.towerOfHanoi(3, src, aux, dest);
		
	}

}
