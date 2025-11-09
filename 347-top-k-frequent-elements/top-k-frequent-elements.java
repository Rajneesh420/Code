import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
            new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) pq.poll(); 
        }
        int[] result = new int[k];
        int index = 0;
        while (!pq.isEmpty()) {
            result[index++] = pq.poll().getKey();
        }

        return result;
    }
}