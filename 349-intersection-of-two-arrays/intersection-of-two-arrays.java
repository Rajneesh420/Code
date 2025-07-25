class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
               HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int a : nums1) {
            map.put(a, 1);  // mark as present
        }

        for (int a : nums2) {
            if (map.containsKey(a)) {
                result.add(a);
                map.remove(a);  // to avoid duplicates
            }
        }

        int[] output = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }

        return output;
    }
}