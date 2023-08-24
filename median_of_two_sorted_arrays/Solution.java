package median_of_two_sorted_arrays;

import Utils.ArrayUtils;

public class Solution {
    /*
     * Given two sorted arrays nums1 and nums2 of size m and n respectively, return
     * the median of the two sorted arrays.
     * 
     * The overall run time complexity should be O(log (m+n)).
     */

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        int n = 0;
        int m = 0;
        int i = 0;

        while (mergedArray.length > i) {
            if (n == nums1.length) {
                mergedArray[i] = nums2[m];
                m++;
                i++;
                continue;
            }
            if (m == nums2.length) {
                mergedArray[i] = nums1[n];
                n++;
                i++;
                continue;
            }
            int currentN = nums1[n];
            int currentM = nums2[m];
            if (currentN > currentM) {
                mergedArray[i] = currentM;
                m++;
            } else {
                mergedArray[i] = currentN;
                n++;
            }
            i++;
        }
        int mid = mergedArray.length / 2;
        double result = mergedArray[mid];
        if (mergedArray.length % 2 == 0) {
            result = (mergedArray[mid - 1] + mergedArray[mid]) / 2.0;
        }
        return result;
    }

}
