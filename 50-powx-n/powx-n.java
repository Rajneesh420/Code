class Solution {
    public static double Pow(double x,int n) {
        if(n==0) return 1;
        if(n%2==1 || n%2==-1) return Pow(x*x,n/2)*x;
        return Pow(x*x,n/2);
    }
    public double myPow(double x, int n) {
        if(n<0) x=1/x;
        return Pow(x,n);
    }
}