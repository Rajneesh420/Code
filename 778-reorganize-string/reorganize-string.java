class Solution {
    public String reorganizeString(String s) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()
        );
        maxHeap.addAll(freqMap.entrySet());
        
        StringBuilder result = new StringBuilder();
        while (maxHeap.size() >= 2) {
            var first = maxHeap.poll();
            var second = maxHeap.poll();

            result.append(first.getKey());
            result.append(second.getKey());
            
            first.setValue(first.getValue() - 1);
            second.setValue(second.getValue() - 1);

            if (first.getValue() > 0) {
                maxHeap.add(first);
            }
            if (second.getValue() > 0) {
                maxHeap.add(second);
            }
        }
        
        if (!maxHeap.isEmpty()) {
            var last = maxHeap.poll();
            if (last.getValue() > 1) {
                return "";
            }
            result.append(last.getKey());
        }
        
        return result.toString();
    }
}