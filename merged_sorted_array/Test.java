package merged_sorted_array;

public class Test {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = { 2, 5, 6 };

        Solution solution = new Solution();
        solution.merge(nums1, 3, nums2, 3);

        System.out.println("Expected: [1, 2, 2, 3, 5, 6]");
        System.out.print("Actual: [");
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]);
            if (i != nums1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}
