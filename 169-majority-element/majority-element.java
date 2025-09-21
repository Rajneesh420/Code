class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int major = 0;
        for(int num : nums) {
            if(major == 0){
                res = num;
            }
            if(num == res) 
                major++;
            else
                major--;
        }
        return res;
    }
}