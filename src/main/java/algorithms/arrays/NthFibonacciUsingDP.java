package main.java.algorithms.arrays;

public class NthFibonacciUsingDP {


    public static int fib(int n, int[] fibArr) {
        int f[]= new int[n+ 2];
        int i;
        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];

    }

    public static void main(String... args) {
        int n = 9;


        int[] fibArr = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            fibArr[i] = 0;
        }
        System.out.println(fib(n, fibArr));
    }
}
