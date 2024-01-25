package main.java.algorithms.arrays;

public class RotateMatrixClockwise {

    public static void moveAntiClockWise(int[][] matrix){

        int n = matrix.length;

        for (int i =0;i< n/2;i++) {
            for(int j=i;j< n-i-1;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = matrix[n-j-1][n-i-1];
                matrix[n-j-1][n-i-1] = matrix[n-i-1][i];
                matrix[n-i-1][i] = temp;

            }
        }
    }

    static void printMatrix(int arr[][], int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print( arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String... args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        moveAntiClockWise(arr);
        printMatrix(arr, 4);
    }
}
