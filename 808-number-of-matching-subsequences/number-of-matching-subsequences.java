class Solution {
    public int numMatchingSubseq(String s, String[] words) {
    Map<Character, Queue<String>> waiting = new HashMap<>();
        for (char c = 'a'; c <= 'z'; c++) {
            waiting.put(c, new LinkedList<>());
        }
        for (String word : words) {
            char firstChar = word.charAt(0);
            waiting.get(firstChar).offer(word);
        }
        
        int count = 0;
        for (char c : s.toCharArray()) {
            Queue<String> queue = waiting.get(c);
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                if (word.length() == 1) {
                    count++;
                } else {
                    String next = word.substring(1);
                    waiting.get(next.charAt(0)).offer(next);
                }
            }
        }
        
        return count;
    }
}