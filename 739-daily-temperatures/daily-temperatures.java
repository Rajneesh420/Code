class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>(); // store indices

        for (int i = 0; i < n; i++) {
            // While current temp is warmer than last stored day
            while (!st.isEmpty() && temp[i] > temp[st.peek()]) {
                int prevIndex = st.pop();
                result[prevIndex] = i - prevIndex; // difference in days
            }
            st.push(i);
        }

        return result;
    }
}
