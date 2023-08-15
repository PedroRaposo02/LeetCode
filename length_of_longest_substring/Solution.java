package length_of_longest_substring;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    /*
     * Given a string s, find the length of the longest substring without repeating characters.
     */


    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for(int right = 0; right < s.length(); right ++) {
            char currentChar = s.charAt(right);

            if(!set.contains(currentChar)) {
                set.add(currentChar);
                maxLength  = Math.max(maxLength, right - left + 1);
            }
            else  {
                while (s.charAt(left) != currentChar) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
                set.add(currentChar);
            }
        }
        return maxLength;
    }
}
