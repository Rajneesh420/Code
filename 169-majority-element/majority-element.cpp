class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int major=0;
        int res=0;
        for(int num : nums){
            if(major == 0) res = num;
            if(num == res) major++;
            else major--;
        }
        return res;
    }
};