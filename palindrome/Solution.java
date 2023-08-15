package palindrome;
public class Solution {
    
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        
        String num = String.valueOf(x);
        int n = num.length();
        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) != num.charAt(n - 1 - i))
                return false;
        }

        return true;
    }
}
