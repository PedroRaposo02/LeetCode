package minimun_size_subarray_sum;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 12, 28, 83, 4, 25, 26, 25, 2, 25, 25, 25, 12 };
        int target = 213;
        int result = solution.minSubArrayLen(target, nums);
        System.out.println(result);
    }
}
