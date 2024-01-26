package main.java.algorithms.backtracking;

public class NQueenProblem {

    public boolean findNQueen(int[][] board, int col) {
        int n = board.length;

        if (col >= n) {
            return true;
        }
        for (int i = 0; i < n; i++) {

            if (isSafe(board, i, col)) {
                board[i][col]= 1;

                boolean find = findNQueen(board, col + 1);
                if (find) {
                    return true;
                }
            }

            board[i][col] = 0;
        }
        return false;
    }

    private boolean isSafe(int[][] board, int row, int col) {
        int n = board.length;
        if (row >= n || col >= n) {
            return false;
        }


        int i,j;
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        // Check upper diagonal on left side
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check lower diagonal on left side
        for (i = row, j = col; j >= 0 && i < n; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;

    }

    void printSolution(int board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1)
                    System.out.print("Q ");
                else
                    System.out.print(". ");
            }
            System.out.println();
        }
    }

    public static void main(String... args) {
        NQueenProblem n = new NQueenProblem();
        int board[][] = {{0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};

        n.findNQueen(board, 0);
        n.printSolution(board);

    }
}
