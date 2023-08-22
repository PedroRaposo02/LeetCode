package repeated_substring_pattern;


public class Solution {
    /*
     * Given a string s, check if it can be constructed by taking a substring of it
     * and appending multiple copies of the substring together.
     * 
     */

    public boolean repeatedSubstringPattern(String s) {
        if (s.length() == 1)
            return false;

        int n = s.length();

        for (int i = 1; i <= s.length() / 2; i++) {
            String subString = s.substring(0, i);
            if (s.length() % subString.length() != 0)
                continue;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n / i; j++) {
                sb.append(subString);
            }
            if (sb.toString().equals(s)) {
                return true;
            }
        }

        return false;
    }

    public boolean repeatedSubstringPattern2(String s) {
        String t = s + s;
        if (t.substring(1, t.length() - 1).contains(s))
            return true;
        return false;
    }
}
