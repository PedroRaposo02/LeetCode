package longest_common_prefix;

public class Test {
    public static void main(String[] args) {

        Solution sol = new Solution();

        System.out.println(sol.longestCommonPrefix(new String[] { "flower", "flow", "flight" }));
        System.out.println(sol.longestCommonPrefix(new String[] { "flower", "flowing", "flow" }));
        System.out.println(sol.longestCommonPrefix(new String[] { "dog", "racecar", "car" }));
    }
}
