package leetcode.labuladong.binarytree.binarytree108_sortedArrayToBST;

import tools.TreeNode;

public class sortedArrayToBST_1 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST_helper(nums, 0, nums.length);

    }

    private TreeNode sortedArrayToBST_helper(int[] nums, int left, int right) {
        int mid = (left + right) / 2;
        if(left > right) return null;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST_helper(nums, left, mid-1);
        root.right = sortedArrayToBST_helper(nums, mid+1, right);
        return root;
    }
}
/**
 执行用时：
 0 ms
 , 在所有 Java 提交中击败了
 100.00%
 的用户
 内存消耗：
 38.1 MB
 , 在所有 Java 提交中击败了
 83.70%
 的用户*/