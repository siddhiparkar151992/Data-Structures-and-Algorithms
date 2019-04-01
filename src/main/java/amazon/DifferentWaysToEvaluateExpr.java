package main.java.amazon;

import java.util.LinkedList;
import java.util.Queue;

public class DifferentWaysToEvaluateExpr {

	public LinkedList<String> find(String expr, int l, int h) {
		if(l == h){
			LinkedList<String> list = new LinkedList<>();
			list.add(String.valueOf(expr.charAt(l)));
			return list;
		}
		LinkedList<String> queue = new LinkedList<>();
		for (int i = l + 1; i <= h; i+=2) {
			LinkedList<String> left = find(expr, l, i-1);
			LinkedList<String> right = find(expr, i+1, h);
			
			for(int s1 =0;s1<left.size();s1++){
				for(int s2 =0;s2<right.size();s2++){
					System.out.println("("+left.get(s1)+expr.charAt(i)+right.get(s2)+")");
					queue.add(left.get(s1)+expr.charAt(i)+right.get(s2));
				}
			}
		}
		
	
		return queue;
	}

	public void findAllOutcomesOfString(String expr) {
		find(expr, 0, expr.length()-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DifferentWaysToEvaluateExpr d= new DifferentWaysToEvaluateExpr();
		d.findAllOutcomesOfString("1*2+3*4");
	}

}
