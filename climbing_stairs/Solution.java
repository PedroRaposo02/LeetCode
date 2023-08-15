package climbing_stairs;

public class Solution {

    /*
     * Too slow for large inputs.
     */
    public int climbStairs2(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        return climbStairs2(n - 1) + climbStairs2(n - 2);
    }
    
    /*
     * Faster than climbStairs2, using mathematics to calculate directly.
     */
    public int climbStairs(int n) {
        double sqrt5 = Math.sqrt(5);
        double fib = Math.pow((1 + sqrt5) / 2, n + 1) - Math.pow((1 - sqrt5) / 2, n + 1);
        
        return (int) (fib / sqrt5);
    }

}
