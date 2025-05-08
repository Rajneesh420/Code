class Solution {
    public static int Find(String s,int i,int j)
    {
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j))
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
            int len1 = Find(s,i,i);
            int len2 = Find(s,i,i+1);

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