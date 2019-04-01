package main.java.algorithms.arrays;

/**
 * Created by Siddhi Parkar on 09-01-2018.
 */
public class LargestNUmberOfCons1sInarrayToBeReplacedBy1 {
    public static int largest(int[] arr) {
        int max = 0;
        int cmax = 0;
        int pzero = -1;
        int ppzero = -1;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(cmax, max);
            if (arr[i] == 0) {
                if(cmax < i-ppzero){
                    cmax = i - ppzero;
                    ppzero = pzero;
                    pzero = i;
                }
            }
        }
        System.out.println(cmax);
        return cmax;
    }

    public static void main(String[] args) {
        largest(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1});
    }
}
