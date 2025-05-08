class Solution {
    public static int Find(String s,int i,int j,int n)
    {
        while(i>=0 && j<n && s.charAt(i)==s.charAt(j))
        {
            i--;
            j++;
        }
        return j-i-1;
    }

    public String longestPalindrome(String s) {
        if(s==null || s.length()<1) return "";
        int n = s.length();
        int left = 0,right = 0,Max=0;
        for(int i=0;i<n;i++)
        {
            int len1 = Find(s,i,i,n);
            int len2 = Find(s,i,i+1,n);

            Max = Math.max(len1,len2);

            if(Max > right-left)
            {
                left = i - (Max-1)/2;
                right = i + Max/2;
            }
        }
        return s.substring(left,right+1);
        
    }
}