class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String s: words) map.put(s,map.getOrDefault(s,0)+1);

        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            int freqCompare = map.get(b) - map.get(a); // higher frequency first
            if (freqCompare == 0) {
                return a.compareTo(b); // lexicographical order if frequencies are same
            }
            return freqCompare;
        });
        pq.addAll(map.keySet());
        List<String> sa = new ArrayList<>();
        while(!pq.isEmpty() && k-->0) {
            String s = pq.poll();
            sa.add(s);
        }
        return sa;
    }
}