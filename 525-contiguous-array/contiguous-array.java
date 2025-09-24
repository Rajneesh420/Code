class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        map.put(0,-1);
        for(int i=0;i<n;i++) {
            if(nums[i]==0)
            sum+=-1;
            else
            sum+=1;
            if(map.containsKey(sum)) max = Math.max(max,i-map.get(sum));
            else
            map.put(sum,i);
        }
        return max;
    }
}

//-1,1,1,1,1,1,-1,-1,-1
/*
-1,0,1,2,3,4,3,2,1
0 1 0 1 0 
*/