class Pair {
    int row;
    int col;
    int time;

    public Pair(int r, int c, int t) {
        row = r;
        col = c;
        time = t;
    }
}

class Solution {

    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        Queue<Pair> queue = new LinkedList<>();

    
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    vis[i][j] = 2;
                    queue.add(new Pair(i, j, 0));
                } 
            }
        }

        int maxTime = 0;

    
        int[] dRow = {1, -1, 0, 0};
        int[] dCol = {0, 0, 1, -1};

        
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            int r = p.row;
            int c = p.col;
            int t = p.time;


            maxTime = Math.max(maxTime, t);

        
            for (int i = 0; i < 4; i++) {
                int newRow = r + dRow[i];
                int newCol = c + dCol[i];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && grid[newRow][newCol] == 1 && vis[newRow][newCol] == 0) {
                    vis[newRow][newCol] = 2;
                    queue.add(new Pair(newRow, newCol, t + 1));
                }
            }
        }

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && vis[i][j] != 2) {
                    return -1;
                }
            }
        }

        return maxTime;
    }
}