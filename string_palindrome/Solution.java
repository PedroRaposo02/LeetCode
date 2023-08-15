package string_palindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        s = s.toLowerCase();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            else if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            else {
                if (s.charAt(end) != s.charAt(start)) {
                    return false;
                }
                start++;
                end--;
            }

        }
        return true;
    }
}
