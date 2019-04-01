package main.java.amazon;

/**
 * Created by Siddhi Parkar on 23-11-2017.
 */
public class FindConnectedComponents {

    public static void main(String[] args) {
        FindConnectedComponents f = new FindConnectedComponents();
        f.find(new int[][]{
                {1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}});
    }

    public void findUtil(int[][] matrix, boolean[][] visited, int i, int j) {
        visited[i][j] = true;
        int row[] = {-1, -1, -1, 0, 0, 1, 1, 1};
        int cols[] = {-1, 0, 1, -1, 1, -1, 0, 1};
        for (int k = 0; k < row.length; k++) {
            if (row[k] + i >= 0 && row[k] + i < matrix.length && cols[k] + j >= 0 && cols[k] + j < matrix.length &&
                    !visited[row[k] + i][cols[k] + j] && matrix[i + row[k]][j + cols[k]] == 1) {
                findUtil(matrix, visited, row[k] + i, cols[k] + j);
            }
        }
    }

    public void find(int[][] matrix) {
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==1 && !visited[i][j]) {
                    findUtil(matrix, visited, i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
