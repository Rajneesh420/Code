class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        for(int i=0;i<31;i++) {
            count+=(n & (1<<i)) != 0 ?1:0;
        }
        return count;
    }
    public int[] countBits(int n) {
        int[] dp = new int[n+1];
        for(int i=0;i<=n;i++)
        dp[i] = hammingWeight(i);

        return dp;
    }
}