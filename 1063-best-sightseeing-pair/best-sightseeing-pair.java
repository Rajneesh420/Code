class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max_i = values[0] + 0; 
        int maxScore = 0;

        for (int j = 1; j < values.length; j++) {
            maxScore = Math.max(maxScore, max_i + values[j] - j);
            max_i = Math.max(max_i, values[j] + j);
        }

        return maxScore;
    }
}