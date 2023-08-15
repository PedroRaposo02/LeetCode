package last_word_length;

public class Solution {
    /*
     * Given a string s consisting of words and spaces, return the length of the
     * last word in the string.
     * 
     * A word is a maximal
     * substring
     * consisting of non-space characters only.
     */

    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");

        return words[words.length - 1].length();
    }
    
    public int lengthLastWord2(String s) {
        int length = 0;
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
