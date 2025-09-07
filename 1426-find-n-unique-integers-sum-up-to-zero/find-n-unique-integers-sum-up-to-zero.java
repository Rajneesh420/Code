class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int left = 0,right = n-1;
        while(left < right) {
            result[left] = -(left+1);
            result[right] = left+1;
            left++;
            right--;
        }
        if(n%2==1) result[left] = 0;
        return result;
    }
}