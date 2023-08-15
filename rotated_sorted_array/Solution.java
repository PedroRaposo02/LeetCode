package rotated_sorted_array;

public class Solution {
    /*
     * There is an integer array nums sorted in ascending order (with distinct
     * values).
     * 
     * Prior to being passed to your function, nums is possibly rotated at an
     * unknown pivot index k (1 <= k < nums.length) such that the resulting array is
     * [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
     * (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3
     * and become [4,5,6,7,0,1,2].
     * 
     * Given the array nums after the possible rotation and an integer target,
     * return the index of target if it is in nums, or -1 if it is not in nums.
     * 
     * You must write an algorithm with O(log n) runtime complexity.
     */

    public int search(int[] nums, int target) {

        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }

        int left = 0;
        int right = nums.length - 1;
        int pivot = 0;

        // find pivot
        while (left < right) {
            int mid = (left + right) / 2;
            int elem = nums[mid];
            System.out.println("left: " + left + ", right: " + right + ", mid: " + mid + ", elem: " + elem
                    + ", nextElem: " + nums[mid + 1]);
            if (elem > nums[mid + 1]) {
                pivot = mid;
                break;
            } else if (elem < nums[left]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println("pivot: " + pivot);

        left = 0;
        right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            int realMid = (mid + pivot) % nums.length;
            int elem = nums[realMid];
            if (elem == target) {
                return realMid;
            } else if (elem < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

}
