class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int left = 0;
        long sum = 0;
        long maxSum = 0;

        for (int right = 0; right < nums.length; right++) {
            int current = nums[right];
            while (set.contains(current)) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            set.add(current);
            sum += current;
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, sum);
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }

        return maxSum;
    }
}