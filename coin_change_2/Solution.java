package coin_change_2;

import java.util.Arrays;

public class Solution {
    /*
     * You are given an integer array coins representing coins of different
     * denominations and an integer amount representing a total amount of money.
     * 
     * Return the number of combinations that make up that amount. If that amount of
     * money cannot be made up by any combination of the coins, return 0.
     * 
     * You may assume that you have an infinite number of each kind of coin.
     * 
     * The answer is guaranteed to fit into a signed 32-bit integer.
     */

    /*
     * Top Down DP
     */

    int memo[][];
    int coins[];

    public int change(int amount, int[] coins) {
        this.coins = coins;
        memo = new int[coins.length][amount + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return numberOfWays(0, amount);
    }

    public int numberOfWays(int coinIndex, int amount) {
        if (amount == 0) {
            return 1;
        }

        if (coinIndex == coins.length) {
            return 0;
        }

        if (memo[coinIndex][amount] > 0) {
            return memo[coinIndex][amount];
        }

        if (coins[coinIndex] > amount) {
            return memo[coinIndex][amount] = numberOfWays(coinIndex + 1, amount);
        }

        return memo[coinIndex][amount] = numberOfWays(coinIndex + 1, amount)
                + numberOfWays(coinIndex, amount - coins[coinIndex]);
    }
    
    /*
     * Bottom Up DP
     */

    public int changeBottomUp(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];
        for (int i = 0; i < n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= amount; i++) {
            dp[0][i] = 0;
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i] > j) {
                    dp[i][j] = dp[i + 1][j];
                } else {
                    dp[i][j] = dp[i + 1][j] + dp[i][j - coins[i]];
                }
            }
        }

        return dp[0][amount];
    }

}
