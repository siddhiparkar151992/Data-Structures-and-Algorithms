package main.java.amazon;

import java.util.Collections;
import java.util.List;

public class KNNAlgorithm {
	class Point implements Comparable<Point>{
		public int x;
		public int y;
		public double distance;
		public int group;
		@Override
		public int compareTo(Point o) {
			
			return distance > o.distance ? 0 : 1;
		}

	}

	public int KNN(List<Point> arr, Point p, int k) {

		for (Point point: arr) {
			point.distance = Math.sqrt((point.x- p.x)*(point.x- p.x) + (point.y -p.y)*(point.y -p.y));
		}
		
		Collections.sort(arr);
		
		int f1 =0 , f2 = 0;
		for(int i=0;i<k;i++){
			if(arr.get(i).group == 0) f1++;
			else f2++;
		}
		return f1 > f2 ? f1: f2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
