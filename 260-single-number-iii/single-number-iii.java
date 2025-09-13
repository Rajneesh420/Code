class Solution {
    public int[] singleNumber(int[] nums) {
        int x = 0;
        for(int num : nums) x^=num;

        x = (x&(x-1))^x;

        int[] result = new int[2];
        for(int num : nums){
            if((num&x)==0)
            result[0]^=num;
            else
            result[1]^=num;
        }
        return result;
    }
}