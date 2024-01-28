package main.java.algorithms.arrays;

import java.util.ArrayList;
import java.util.List;

public class RatInAMaze {

    public void move(int[][] arr, int i, int j, String currentStr, List<String> ans) {
        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] != 1) {
            return;
        }
        if (i == arr.length - 1 && j == arr[0].length - 1) {
            ans.add(currentStr);
            return;
        }

        int[] row = new int[]{-1, 0, 1, 0};
        int[] col = new int[]{0, -1, 0, 1};
        char[] dir = new char[]{'U', 'L', 'D', 'R'};

        arr[i][j]= 0;
        for (int k = 0; k < row.length; k++) {

            move(arr, i + row[k], j + col[k], currentStr + dir[k], ans);
        }
        arr[i][j]= 1;
    }

    public void findMaze(int[][] arr) {
        List<String> li = new ArrayList<>();
        move(arr, 0, 0, "", li);
        System.out.println(li);
    }

    public static void main(String... args) {
        int[][] m = {{1, 0, 0, 0, 0},
                    {1, 1, 1, 1, 1},
                    {1, 1, 1, 0, 1},
                    {0, 0, 0, 0, 1},
                    {0, 0, 0, 0, 1}};

        RatInAMaze r = new RatInAMaze();
        r.findMaze(m);
    }
}
