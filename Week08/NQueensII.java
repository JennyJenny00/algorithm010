public class NQueensII {
    public int totalNQueens(int n) {
        return backtrack(0, 0, 0, 0, 0, n);
    }
    private int backtrack(int row, int hills, int next_row, int dales, int count, int n) {
        int columns = (1 << n) - 1;
        if (row == n) {
            count++;
        } else {
            int free_col = columns & ~(hills | next_row | dales);
            while (free_col != 0) {
                int cur_col = (- free_col) & free_col;
                free_col ^= cur_col; 
                count = backtrack(row + 1, (hills | cur_col) << 1, 
                                  next_row | cur_col, (dales | cur_col) >> 1, count, n);
            }
        }
        return count;
    }
}