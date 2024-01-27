package main.java.algorithms.arrays;

public class MaximumSumRactangleInMatrix {

    public static void findMaxREct(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        int[][] preSum = new int[m+1][n];

        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                preSum[i+1][j] = matrix[i][j]+ preSum[i][j];
            }
        }

        System.out.println(preSum);


        int maxSum = Integer.MIN_VALUE;
        for (int startRow= 0; startRow<m;startRow++) {
            for (int endRow= 0; endRow<m;endRow++) {

                int sum = 0;
                for (int col=0;col<n;col++) {
//                    sum+= preSum[]
                }
            }
        }

    }

    public static void main(String... args){
        int arr[][] = new int[][] { { 1, 2, -1, -4, -20 },
                { -8, -3, 4, 2, 1 },
                { 3, 8, 10, 1, 3 },
                { -4, -1, 1, 7, -6 } };

        findMaxREct(arr);
    }
}
