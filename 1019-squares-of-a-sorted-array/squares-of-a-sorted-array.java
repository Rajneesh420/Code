class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        int pos = n - 1;

        while (left <= right) {
            int a = nums[left] * nums[left];
            int b = nums[right] * nums[right];
            if (a > b) {
                result[pos--] = a;
                left++;
            } else {
                result[pos--] = b;
                right--;
            }
        }
        return result;
    }
}
