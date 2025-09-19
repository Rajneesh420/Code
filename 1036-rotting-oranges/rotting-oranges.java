import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh = 0;
        int n = grid.length, m = grid[0].length;
        Deque<int[]> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    queue.addLast(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        
        if (fresh == 0) return 0; 
        
        int minutes = -1; 
        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int k = 0; k < size; k++) {
                int[] cell = queue.pollFirst();
                for (int[] d : dir) {
                    int ni = cell[0] + d[0];
                    int nj = cell[1] + d[1];
                    
                    if (ni >= 0 && ni < n && nj >= 0 && nj < m && grid[ni][nj] == 1) {
                        grid[ni][nj] = 2;   
                        fresh--;
                        queue.addLast(new int[]{ni, nj});
                    }
                }
            }
            minutes++;
        }
        
        return fresh == 0 ? minutes : -1;
    }
}
