class Solution {
    public static boolean Symmetric(String s) {
        if(s.length()%2==1) return false;
        int n = s.length();
        int sum = 0,sum2=0;
        for(int i=0;i<n/2;i++) sum+=(int)s.charAt(i);
        for(int i=n/2;i<n;i++) sum2+=(int)s.charAt(i);
        return sum==sum2;
    }
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i=low;i<=high;i++)
        count = Symmetric(""+i)?count+1:count;
        return count;
    }

}