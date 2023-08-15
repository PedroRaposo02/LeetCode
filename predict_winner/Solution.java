package predict_winner;

public class Solution {

    /*
     * You are given an integer array nums. Two players are playing a game with this
     * array: player 1 and player 2.
     * 
     * Player 1 and player 2 take turns, with player 1 starting first. Both players
     * start the game with a score of 0. At each turn, the player takes one of the
     * numbers from either end of the array (i.e., nums[0] or nums[nums.length - 1])
     * which reduces the size of the array by 1. The player adds the chosen number
     * to their score. The game ends when there are no more elements in the array.
     * 
     * Return true if Player 1 can win the game. If the scores of both players are
     * equal, then player 1 is still the winner, and you should also return true.
     * You may assume that both players are playing optimally.
     */

    /*
     * With caching
     */

    int[][] memo;
    int[] nums;

    public boolean predictTheWinnerCaching(int[] nums) {
        this.memo = new int[nums.length][nums.length];
        this.nums = nums;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                this.memo[i][j] = -1;
            }
        }
        return helperCaching(0, nums.length - 1) >= 0;
    }

    public int helperCaching(int left, int right) {
        if (left == right) {
            return nums[left];
        }
        if (memo[left][right] != -1) {
            return memo[left][right];
        }

        int pickLeft = nums[left] - helperCaching(left + 1, right);
        int pickRight = nums[right] - helperCaching(left, right - 1);

        int result = Math.max(pickLeft, pickRight);
        memo[left][right] = result;
        return result;
    }

    /*
     * No caching
     */

    public boolean predictTheWinner(int[] nums) {
        this.nums = nums;
        return helper(0, nums.length - 1) >= 0;
    }

    public int helper(int left, int right) {
        if (left == right) {
            return nums[left];
        }

        int pickLeft = nums[left] - helper(left + 1, right);
        int pickRight = nums[right] - helper(left, right - 1);

        int result = Math.max(pickLeft, pickRight);
        return result;
    }
}
