class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String s = "" + x;
        int m = s.length()-1;
        int i=0;
        while(i<=m){
          if(s.charAt(i) != s.charAt(m))
          return false;
          i++;
          m--;
        }
        return true;
    }
}