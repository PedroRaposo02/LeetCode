package valid_partition;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /*
     * You are given a 0-indexed integer array nums. You have to partition the array
     * into one or more contiguous subarrays.
     * 
     * We call a partition of the array valid if each of the obtained subarrays
     * satisfies one of the following conditions:
     * 
     * The subarray consists of exactly 2 equal elements. For example, the subarray
     * [2,2] is good.
     * The subarray consists of exactly 3 equal elements. For example, the subarray
     * [4,4,4] is good.
     * The subarray consists of exactly 3 consecutive increasing elements, that is,
     * the difference between adjacent elements is 1. For example, the subarray
     * [3,4,5] is good, but the subarray [1,3,5] is not.
     * Return true if the array has at least one valid partition. Otherwise, return
     * false.
     */

    Map<Integer, Boolean> memo = new HashMap<>();

    public boolean validPartition(int[] nums) {
        int n = nums.length;
        memo.put(-1, true);
        return prefixIsValid(nums, n - 1);
    }

    public boolean prefixIsValid(int[] nums, int i) {
        if (memo.containsKey(i)) {
            return memo.get(i);
        }

        boolean ans = false;

        // Check all 3 possibilities
        if (i > 0 && nums[i] == nums[i - 1]) {
            ans |= prefixIsValid(nums, i - 2);
        }

        if (i > 1 && nums[i] == nums[i - 1] && nums[i - 1] == nums[i - 2]) {
            ans |= prefixIsValid(nums, i - 3);
        }

        if (i > 1 && nums[i] - nums[i - 1] == 1 && nums[i - 1] - nums[i - 2] == 1) {
            ans |= prefixIsValid(nums, i - 3);
        }

        memo.put(i, ans);
        return ans;
    }
}
