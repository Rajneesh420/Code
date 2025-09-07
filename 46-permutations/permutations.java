class Solution {
    public static void swap(int[] nums,int i,int j) {
        int t= nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public static void Permu(int[] nums,int start,List<List<Integer>> result) {
        if(start>nums.length) return ;
        if(start==nums.length) {
            List<Integer> list = new ArrayList<>();
            for(int n:nums) list.add(n);
            result.add(list);
        }
        for(int i=start;i<nums.length;i++)
        {
            swap(nums,i,start);
            Permu(nums,start+1,result);
            swap(nums,i,start);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Permu(nums,0,result);
        return result;
    }
}