package valid_anagram;

public class Test {
    public static void main(String[] args) {

        Solution sol = new Solution();

        System.out.println(sol.isAnagram("anagram", "nagaram"));
        System.out.println(sol.isAnagram("rat", "car"));
    }
}
