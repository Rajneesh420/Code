class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        Set<Integer> s = new HashSet<>();
        for(int num : nums) s.add(num);
        for(int i=1;i<=n;i++){
            if(!s.contains(i)) return i;
        }
        return n+1;
    }
}