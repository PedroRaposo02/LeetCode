package reverse_integer;

public class Solution {

    // String Approach
    public int reverse(int x) {
        String s = Integer.toString(x);
        int n = s.length();
        boolean isNegative = s.charAt(0) == '-';
        String reverseNum = "";
        for (int i = n - 1; i >= 0; i--) {
            if (i == 0 && isNegative)
                continue;
            reverseNum += s.charAt(i);
        }
        try {
            int number = Integer.parseInt(reverseNum);
            return isNegative ? -number : number;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    // Number Approach
    public int reverse2(int x) {
        int reverseNum = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (reverseNum > Integer.MAX_VALUE / 10 || (reverseNum == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;
            if (reverseNum < Integer.MIN_VALUE / 10 || (reverseNum == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;
            reverseNum = reverseNum * 10 + digit;
        }
        return reverseNum;
    }
}
