package main.java.algorithms.arrays;

public class FindCommonElemInRowMatrix {

    public static void findCommonElem(int[][] matrix) {

        int max= Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        int[][] dp = new int[matrix.length][max+1];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                dp[i][matrix[i][j]] = 1;
            }
        }

        for (int j = 0; j < matrix[0].length; j++) {
            int elem = matrix[0][j];
            boolean found = true;
            for (int i=0;i<dp.length;i++) {
                if (dp[i][elem] != 1){
                    found= false;
                }
            }

            if (found) {
                System.out.println(elem);
            }
        }


    }

    public static void main(String... args) {
        int mat[][] =
                {
                        {1, 2, 1, 4, 8},
                        {3, 7, 8, 5, 1},
                        {8, 7, 7, 3, 1},
                        {8, 1, 2, 7, 9},
                };


        findCommonElem(mat);
    }
}
