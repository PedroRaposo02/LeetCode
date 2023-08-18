package search_insert_position;

public class Solution {
    /*
     * Given a sorted array of distinct integers and a target value, return the
     * index if the target is found. If not, return the index where it would be if
     * it were inserted in order.
     * 
     * You must write an algorithm with O(log n) runtime complexity.
     * 
     * Example 1:
     * 
     * Input: nums = [1,3,5,6], target = 5
     * Output: 2
     * Example 2:
     * 
     * Input: nums = [1,3,5,6], target = 2
     * Output: 1
     * Example 3:
     * 
     * Input: nums = [1,3,5,6], target = 7
     * Output: 4
     */

    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int mid = 0;

        if (target > nums[n - 1]) {
            return n;
        }
        if (target < nums[0]) {
            return 0;
        }

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }

        }
        if (target > nums[mid]) {
            return mid + 1;
        }

        return mid;
    }
}
