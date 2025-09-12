class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefsum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        map.put(0,1);
        for(int num : nums){
            prefsum+=num;
            if(map.containsKey(prefsum-k)) {
                count += map.get(prefsum - k);;
            }
            map.put(prefsum, map.getOrDefault(prefsum, 0) + 1);
        }
        return count;
    }
}