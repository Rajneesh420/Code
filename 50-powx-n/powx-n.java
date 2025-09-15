class Solution {
    public double pow(double a,long n){
        if(n==0) return 1;
        if(n%2==1) return a*pow(a*a,n/2);
        else return pow(a*a,n/2);
    }
    public double myPow(double x, int n) {
        long N = n;   
        if (N < 0) {
            N = -N;
            return 1 / pow(x, N);
        }
        return pow(x, N);
    }
}