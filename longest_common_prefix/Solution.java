package longest_common_prefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String commonPrefix = "";
        if (strs.length == 0) {
            return commonPrefix;
        }
        
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < minLen) {
                minLen = str.length();
            }
        }

        for (int i = 0; i < minLen; i++) {
            char c = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != c) {
                    return commonPrefix;
                }
            }
            commonPrefix += c;
        }

        return commonPrefix;
    }
}
