package main.java.algorithms.stack;

public class LargestRectangularAreaInHistogram {

    public static void find(int arr[]) {
        int maxArea=0;
        int currentArea = 0;
        int cmax = 0;

        for (int i=0;i<arr.length;i++) {

           int start = i;
           while (start >0 && arr[start]<arr[i]) {
               start--;
           }
           
        }

        System.out.println(maxArea);
    }
    public static void main(String... args){
        find(new int[]{3, 5, 1, 7, 5, 9});
    }
}
