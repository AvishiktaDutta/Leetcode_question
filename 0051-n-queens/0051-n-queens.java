import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> resultList = new ArrayList<>();
        // Initialize board with empty squares '.'
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        
        solve(0, board, resultList, n);
        return resultList;
    }

    private void solve(int row, char[][] board, List<List<String>> resultList, int n) {
        // Base Case: All queens are placed
        if (row == n) {
            resultList.add(construct(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q';          // Place queen
                solve(row + 1, board, resultList, n); // Move to next row
                board[row][col] = '.';          // Backtrack (remove queen)
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int col, int n) {
        // 1. Check vertical column (upwards)
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // 2. Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // 3. Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    // Helper to convert char[][] board to List<String>
    private List<String> construct(char[][] board) {
        List<String> res = new LinkedList<>();
        for (int i = 0; i < board.length; i++) {
            res.add(new String(board[i]));
        }
        return res;
    }
}