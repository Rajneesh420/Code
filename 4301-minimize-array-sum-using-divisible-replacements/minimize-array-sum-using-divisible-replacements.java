import java.util.*;

class Solution {
    public long minArraySum(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        long sum = 0;

        for (int x : nums) {
            int best = x; 
            for (int d = 1; (long) d * d <= x; d++) {
                if (x % d == 0) {
                    if (set.contains(d)) {
                        best = Math.min(best, d);
                    }
                    if (set.contains(x / d)) {
                        best = Math.min(best, x / d);
                    }
                }
            }

            sum += best;
        }

        return sum;
    }
}