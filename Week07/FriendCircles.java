public class FriendCircles {
    class UnionFind {
        private int count = 0;
        private int[] parent, rank;
        public UnionFind(int n ) {
            count = n;
            parent = new int[n];
            rank = new int[n];
        }
        public int find(int p) {
            while(p != parent[p]) {
                parent[p] = find(parent[p]);
                p = parent[p];
            }
            return p;
        }
        public void union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP == rootQ) return;
            if (rank[rootQ] > rank[rootP]) {
                parent[rootP] = rootQ;
            } else {
                parent[rootQ] = rootP;
                if (rank[rootQ] == rank[rootP]) {
                    rank[rootP] ++;
                }
            }
            count --;
        }
        public int count () {
            return count;
        }    
    }
    public int findCircleNum(int[][] M) {
        int n = M.length;
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (M[i][j] == 1) uf.union(i, j);
            }
        }
        return uf.count();
    }
}