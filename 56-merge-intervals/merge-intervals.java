class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : intervals) {
            int size = merged.size();
            if (size == 0 || merged.get(size - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                merged.get(size - 1)[1] = Math.max(merged.get(size - 1)[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}