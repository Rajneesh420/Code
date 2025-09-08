class Solution {
    int max = Integer.MIN_VALUE,left=0,right=0;
    public void Palindrome(String s,int l,int r) {
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
        {
                if(max<=(r-l+1))
                {
                max = r-l+1;
                left = l;
                right = r;
                }
                l--;
                r++;
        }
    }
    public String longestPalindrome(String s) {
        int n = s.length()-1;
        for(int i=0;i<n;i++){
            Palindrome(s,i,i);
            Palindrome(s,i,i+1);
        }
        return s.substring(left,right+1);
    }
}