package minimun_size_subarray_sum;


public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int runningSum = 0;
        int minWindowSize = Integer.MAX_VALUE;
        int windowStart = 0;

        if (nums.length < 1) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0] >= s ? 1 : 0;
        }

        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            if (runningSum < s) {
                runningSum += nums[windowEnd];
            }
            while (runningSum >= s) {
                minWindowSize = Math.min(minWindowSize, windowEnd - windowStart + 1);
                runningSum -= nums[windowStart++];
            }

        }
        return minWindowSize == Integer.MAX_VALUE ? 0 : minWindowSize;
    }
}
