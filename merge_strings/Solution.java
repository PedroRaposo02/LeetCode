package merge_strings;

public class Solution {
    /*
     * You are given two strings word1 and word2. Merge the strings by adding
     * letters in alternating order, starting with word1. If a string is longer than
     * the other, append the additional letters onto the end of the merged string.
     * 
     * Return the merged string.
     */
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word1.length() && i < word2.length(); i++) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }

        System.out.println(sb.toString());

        if (word1.length() > word2.length()) {
            sb.append(word1.substring(word2.length()));
        } else {
            sb.append(word2.substring(word1.length()));
        }

        return sb.toString();
    }

}