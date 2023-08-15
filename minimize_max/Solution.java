package minimize_max;

import java.util.Arrays;

// TODO

public class Solution {
    /*
     * You are given a 0-indexed integer array nums and an integer p. Find p pairs
     * of indices of nums such that the maximum difference amongst all the pairs is
     * minimized. Also, ensure no index appears more than once amongst the p pairs.
     * 
     * Note that for a pair of elements at the index i and j, the difference of this
     * pair is |nums[i] - nums[j]|, where |x| represents the absolute value of x.
     * 
     * Return the minimum maximum difference among all p pairs. We define the
     * maximum of an empty set to be zero.
     */

    public int minimizeMax(int[] nums, int p) {

        if (nums.length == 1) {
            return 0;
        }

        Arrays.sort(nums);
        int left = 0;
        int sum = 0;

        for (int i = 0; i < p; i++) {
            sum += Math.abs(nums[left] - nums[left + 1]);
            left += 2;
        }

        return sum;

    }
}
