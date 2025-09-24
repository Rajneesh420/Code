class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int n = prices.length;
        int max = 0;
        for(int price : prices){
            buy = Math.min(buy,price);
            max = Math.max(max,price-buy);
        }
        return max;
    }
}