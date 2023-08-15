package word_break;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// TODO THIS EXERCISE IS NOT FINISHED

public class Solution {
    /*
     * Given a string s and a dictionary of strings wordDict, return true if s can
     * be segmented into a space-separated sequence of one or more dictionary words.
     * 
     * Note that the same word in the dictionary may be reused multiple times in the
     * segmentation.
     */

    public boolean wordBreak(String s, List<String> wordDict) {
            
        for (String word : wordDict) {
            if (s.contains(word)) {
                s = s.replace(word, "");
            }
        }

        if (s.isEmpty()) {
            return true;
        }

        return false;
    }
}
