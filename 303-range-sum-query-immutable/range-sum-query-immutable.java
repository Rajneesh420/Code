class NumArray {
    int[] range;
    public NumArray(int[] nums) {
        range = nums;
        int n = nums.length;
        range[0] = nums[0];
        for(int i=1;i<n;i++) {
            range[i]+=range[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0) return range[right];
        return range[right]-range[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */