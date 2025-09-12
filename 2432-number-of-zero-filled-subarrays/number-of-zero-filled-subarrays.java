class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long res = 0;
        long pattern = 0;
        for(int num : nums) {
            if(num == 0)
            pattern++;
            else
            pattern = 0;
            res += pattern;
        }
        return res;
    }
}