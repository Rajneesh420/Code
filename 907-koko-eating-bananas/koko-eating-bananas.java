class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int r=0;
        for(int pile :piles){
            r=Math.max(r,pile);
        }
        int l=0;
        int min=r;
        while(l<=r){
            int m = l+(r-l)/2;
            int total=0;
            for(int pile : piles) {
                total+=Math.ceil((double)pile/m);
            }
            if(total<=h)
            {
                min=m;
                r=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        return min;
    }
}