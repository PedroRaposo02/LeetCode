package count_parenthesis;
import java.util.ArrayList;

public class Solution {

    public boolean isValid(String s) {
        /*
         * An input string is valid if:
         * 
         * Open brackets must be closed by the same type of brackets.
         * Open brackets must be closed in the correct order.
         * Every close bracket has a corresponding open bracket of the same type.
         */

        if (s.length() % 2 != 0)
            return false;

        if (s.length() == 0)
            return true;

        boolean startsClosing = false;
        ArrayList<Character> queue = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (queue.isEmpty()) {
                startsClosing = false;
            }

            if (current == '(' || current == '{' || current == '[') {
                startsClosing = true;
                switch (current) {
                    case '(':
                        queue.add(0, ')');
                        break;
                    case '{':
                        queue.add(0, '}');
                        break;
                    case '[':
                        queue.add(0, ']');
                        break;
                }
            } else if (startsClosing) {
                if (queue.get(0) != current) {
                    return false;
                } else {
                    queue.remove(0);
                }
            } else {
                return false;
            }

        }

        if (!queue.isEmpty()) {
            return false;
        }

        return true;
    }
}