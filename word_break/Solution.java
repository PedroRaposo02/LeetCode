package word_break;

import java.util.Arrays;
import java.util.List;

public class Solution {
    /*
     * Given a string s and a dictionary of strings wordDict, return true if s can
     * be segmented into a space-separated sequence of one or more dictionary words.
     * 
     * Note that the same word in the dictionary may be reused multiple times in the
     * segmentation.
     */

    /*
     * DP approach
     */

    String s;
    List<String> wordDict;
    int[] memo;


    public boolean wordBreak(String s, List<String> wordDict) {
        this.s = s;
        this.wordDict = wordDict;
        this.memo = new int[s.length()];
        Arrays.fill(this.memo, -1);
        return helper(s.length() - 1);
    }
    
    public boolean helper(int i) {
        if (i < 0) {
            return true;
        }

        if (memo[i] != -1) {
            return memo[i] == 1;
        }

        for (String word : wordDict) {
            // handle out of bounds case
            if (i - word.length() + 1 < 0) {
                continue;
            }

            if (s.substring(i - word.length() + 1, i + 1).equals(word) && helper(i - word.length())) {
                memo[i] = 1;
                return true;
            }
        }
        
        memo[i] = 0;
        return false;
    }
}
