class Solution {
        public int longestOnes(int[] A, int K) {
        int left = 0,right=0;
        for (right = 0; right < A.length; right++) {
            if (A[right] == 0) K--;
            if (K < 0 && A[left++] == 0) K++;
        }
        return right - left;
    }
}