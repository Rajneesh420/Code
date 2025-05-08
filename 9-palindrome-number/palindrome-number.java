class Solution {
    public boolean isPalindrome(int x) {
       if (x < 0) return false;
       int org = x;
       int y = 0;
       while (x != 0) {
         if (y > Integer.MAX_VALUE / 10) return false;
         if (y == Integer.MAX_VALUE / 10 && x % 10 >= 7) return false; 
         y = y * 10 + x % 10;
         x = x / 10;
       }
       return org == y; 
    }
}