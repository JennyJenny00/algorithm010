import java.util.*;
public class Minesweeper {
    public static void main(String[] args) {
        char[][] grid = new char[][] {
            {'E', 'E', 'E', 'E', 'E'},
            {'E', 'E', 'M', 'E', 'E'},
            {'E', 'E', 'E', 'E', 'E'},
            {'E', 'E', 'E', 'E', 'E'}
        };
        System.out.println("Before and click = 3,0");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j]+ " ");
            }
            System.out.println("\n");
        }
        int[] c = {3, 0};
        char[][] ans = updateBoard(grid, c);
        System.out.println("After : ");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(ans[i][j]+ " ");
            }
            System.out.println("\n");
        }
    }
    public static char[][] updateBoard(char[][] board, int[] click) {
        int m = board.length;
        int n = board[0].length;
        int x = click[0];
        int y = click[1];
        if (board[x][y] == 'M') {
            board[x][y] = 'X';
        } else 
            update(board, x, y);
        return board;
    }
    private static int findAdjM(char[][] board, int x, int y) {
       int count = 0;
            for (int i = -1; i < 2; i++) {
                for (int j = -1; j < 2; j++) {
                    if (i == 0 && j == 0) continue;
                    int r = x + i, c = y + j;
                    if (r < 0 || r >= board.length || c < 0 || c < 0 || c >= board[0].length) continue;
                    if (board[r][c] == 'M' || board[r][c] == 'X') count++;
                }
            }
        return count;
    }
    private static void update(char[][] board, int x, int y) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y] != 'E' )
            return;
        int adjM = findAdjM(board, x, y);
        //周围有雷
        if (adjM > 0) {
            board[x][y] = (char) ('0' + adjM);
        } else {
            //周围没有雷，是空的
            board[x][y] = 'B';
            //更新周围的格子
            update(board, x + 1, y);
            update(board, x - 1, y);
            update(board, x , y + 1);
            update(board, x , y - 1);
            update(board, x + 1, y + 1);
            update(board, x - 1, y - 1);
            update(board, x - 1, y + 1);
            update(board, x + 1, y - 1);
        }
    }
}