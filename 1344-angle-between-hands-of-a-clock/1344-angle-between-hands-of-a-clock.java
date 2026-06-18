class Solution {
    public double angleClock(int h, int m) {
        double s=0;
        double k=Math.abs((30*h)-(5.5*m));
        if(k>180)
        {s=360-k;
        return s;}
        return k;
    }
}
