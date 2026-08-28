class Solution {
    public double myPow(double x, int n) {

        long b = n;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }

        double res = 1.0;

        while (b != 0) {
            if ((b & 1) != 0) {
                res *= x;
            }
            x *= x;
            b >>= 1;
        }

        return res;
    }
}