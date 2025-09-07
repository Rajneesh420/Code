class Solution {
    public static int DFS(int i,int j,int m,int n,int[][] dp) {
        if(i>=m || j>=n) return 0;
        if(i==m-1 && j==n-1) return 1;
        if(dp[i][j]!=0) return dp[i][j];
        dp[i][j]= DFS(i+1,j,m,n,dp)+DFS(i,j+1,m,n,dp);
        return dp[i][j];
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        return DFS(0,0,m,n,dp);
    }
}