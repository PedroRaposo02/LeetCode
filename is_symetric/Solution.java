package is_symetric;

import Utils.TreeNode;

public class Solution {
    /*
     * Given the root of a binary tree, check whether it is a mirror of itself
     * (i.e., symmetric around its center).
     */

    public boolean isSymmetric(TreeNode<Integer> root) {
        if (root == null) {
            return true;
        }

        return mirror(root.left, root.right);
    }

    public boolean mirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        return left.value == right.value && mirror(left.left, right.right) && mirror(left.right, right.left);
    }
}
