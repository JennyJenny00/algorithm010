public class SurroundedRegions {
    int[] unionSet;
    boolean[] hasEdgeO;
    public void solve(char[][] board) {
        if(board == null || board.length == 0) return;
        int row = board.length;
        int col = board[0].length;
        unionSet = new int[row * col];
        hasEdgeO = new boolean[unionSet.length];
        for(int i = 0; i < unionSet.length; i++) {
            unionSet[i] = i;
        }
        for(int i = 0; i < hasEdgeO.length; i++) {
            int x = i / col, y = i % col;
            hasEdgeO[i] = board[c][r] == 'O' && (x == 0 || x == row - 1 || y == 0 || y == col - 1);
        }
        for(int i = 0; i < unionSet.length; i++) {
            int x = i / col, y = i % col, up = x - 1, right = y + 1;
            // 如果跟上跟右两个的元素相同就union
            if (up >= 0 && board[x][y] == board[up][y]) union(i, i - col); 
            if (right < col && board[x][y] == board[x][col]) union(i, i + 1); 
        }
        for(int i = 0; i < unionSet.length; i++) {
            int x = i / col, y = i % col, up = x - 1, right = y + 1;
            // 如果跟上跟右两个的元素相同就union
            if (board[x][y] == 'O' && !hasEdgeO(findSet(i)))
                board[x][y] = 'X';
        }
        private void union(int x,int y){
            int rootX = findSet(x);
            int rootY = findSet(y);
            // if there is an union has an 'edge O',the union after merge should be marked too
            boolean hasEdgeO = this.hasEdgeO[rootX] || this.hasEdgeO[rootY];
            unionSet[rootX] = rootY;
            this.hasEdgeO[rootY] = hasEdgeO;
        }
        
        private int findSet(int x){
            if(unionSet[x] == x) return x;
            unionSet[x] = findSet(unionSet[x]);
            return unionSet[x];
        }
    }
}