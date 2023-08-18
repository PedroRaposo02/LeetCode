package same_tree;

import Utils.TreeNode;

public class Solution {
    /*
     * Given the roots of two binary trees p and q, write a function to check if
     * they are the same or not.
     * 
     * Two binary trees are considered the same if they are structurally identical,
     * and the nodes have the same value.
     * 
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */

    public boolean isSameTree(TreeNode<Integer> p, TreeNode<Integer> q) {

        if (p == null && q == null) {
            return true;
        }

        if (p.value == q.value) {
            return isSameTree(p.left, p.left) && isSameTree(p.right, q.right);
        }

        return false;
    }
    
    public boolean isSameTree1Line(TreeNode<Integer> p, TreeNode<Integer> q) {
        // 1 liner
        return p == null && q == null || p != null && q != null && p.value == q.value && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
