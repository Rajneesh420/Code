class Solution {
    int[] dx = {1, -1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    public boolean DFS(char[][] grid,int i,int j,int pi,int pj,boolean[][] visit,char target) {
        visit[i][j] = true;
        for(int k=0;k<4;k++) {
            int ni = i+dx[k];
            int nj = j+dy[k];
            if(ni<0 || ni>=grid.length || nj <0 || nj>=grid[0].length ) continue;
            if (grid[ni][nj] != target) continue; 
            if(!visit[ni][nj]){
                if(DFS(grid,ni,nj,i,j,visit,grid[ni][nj])) return true;
            }
            else if(ni != pi || nj != pj) return true;
        }
        return false;
    }
    public boolean containsCycle(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visit = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            {
                if(!visit[i][j])
                if(DFS(grid,i,j,-1,-1,visit,grid[i][j])) return true;
            }
        }
        return false;
    }
}