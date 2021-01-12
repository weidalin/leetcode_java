package leetcode.labuladong.binarytree.binarytree98_isValidBST;

import tools.TreeNode;

public class isValidBST_1 {
    public static boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    private static boolean helper(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null) return true;
        // 若 root.val 不符合 max 和 min 的限制，说明不是合法 BST
        if (min != null && root.val <= min.val) return false;
        if (max != null && root.val >= max.val) return false;
        // 限定左子树的最大值是 root.val，右子树的最小值是 root.val
        return helper(root.left, min, root)&& helper(root.right, root, max);
    }
}
