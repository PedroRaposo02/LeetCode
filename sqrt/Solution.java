package sqrt;

public class Solution {
    /*
     * Given a non-negative integer x, return the square root of x rounded down to
     * the nearest integer. The returned integer should be non-negative as well.
     * 
     * You must not use any built-in exponent function or operator.
     * 
     * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
     */
    /*
     * In binary: 10 -> 2 100 -> 4 1010 -> 8 10000 -> 16 100000 -> 32 1000000 -> 64
     */

    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int left = 0;
        int right = x;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid < x / mid) {
                left = mid + 1;
            } else if (mid > x / mid) {
                right = mid - 1;
            } else {
                return mid;
            }
        }

        return right;
    }
}
