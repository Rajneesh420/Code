class Solution {
 private int[] prefixSums;
    private int totalSum;
    private Random random;

    public Solution(int[] w) {
        prefixSums = new int[w.length];
        totalSum = 0;
        random = new Random();
        for (int i = 0; i < w.length; i++) {
            totalSum += w[i];
            prefixSums[i] = totalSum;
        }
    }

    public int pickIndex() {
        int target = random.nextInt(totalSum) + 1;
        int left = 0;
        int right = prefixSums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (prefixSums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */