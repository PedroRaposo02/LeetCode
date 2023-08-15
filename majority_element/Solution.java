package majority_element;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    /*
     * Given an array nums of size n, return the majority element.
     * 
     * The majority element is the element that appears more than ⌊n / 2⌋ times. You
     * may assume that the majority element always exists in the array.
     */
    
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n / 2];
    }

    public int majorityElementHashMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length / 2 + 1;
        for (int i : nums) {
            int val = map.merge(i, 1, Integer::sum);
            if (val >= n) {
                return i;
            }
        }
        return nums[0];
    }
    
    public int majorityElementCandidate(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    } 
}
