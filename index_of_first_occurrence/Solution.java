package index_of_first_occurrence;

public class Solution {
    /*
     * Given two strings needle and haystack, return the index of the first
     * occurrence of needle in haystack, or -1 if needle is not part of haystack.
     */

    public int strStr(String haystack, String needle) {
        if(haystack.contains(haystack)) {
            return haystack.indexOf(needle);
        }
        else {
            return -1;
        }
    }
}
