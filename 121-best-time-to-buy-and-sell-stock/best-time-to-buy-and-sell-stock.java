class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int pre = 999999;
        int max = 0;
        for(int i=0;i<n;i++) {
          max = Math.max(max,prices[i]-pre);
          pre = Math.min(pre,prices[i]);
        }
        return max;
    }
}