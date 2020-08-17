class Solution {
    public double myPow(double x, int n) {
        if(n < 0)
            return 1.0/myPowRec(x, -n);
        
        return myPowRec(x, n);
        
    }
    
    public double myPowRec(double x, int n) 
    {
        if(n == 0)
            return 1;
        
        if(n == 1)
            return x;
        
        if(n % 2 == 0)
            return myPowRec(x*x, n/2);
        
        return x * myPowRec(x*x, n/2);
    }
}