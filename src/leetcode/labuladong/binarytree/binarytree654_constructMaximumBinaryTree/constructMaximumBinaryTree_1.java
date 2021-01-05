package leetcode.labuladong.binarytree.binarytree654_constructMaximumBinaryTree;

import sun.reflect.generics.tree.Tree;
import tools.TreeNode;
/*
654. 最大二叉树
给定一个不含重复元素的整数数组 nums 。一个以此数组直接递归构建的 最大二叉树 定义如下：

二叉树的根是数组 nums 中的最大元素。
左子树是通过数组中 最大值左边部分 递归构造出的最大二叉树。
右子树是通过数组中 最大值右边部分 递归构造出的最大二叉树。
返回有给定数组 nums 构建的 最大二叉树 。
 */
public class constructMaximumBinaryTree_1 {
    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }
    public static TreeNode helper(int[] nums, int left, int right){
        if(left > right)    return null;

        int max = Integer.MIN_VALUE;
        int man_idx = -1;
        for (int i = left; i <= right; i++){
            if(max < nums[i]){
                man_idx = i;
                max = nums[i];
            }
        }
        System.out.print(max+"\t");

        TreeNode root = new TreeNode(max);
        root.left = helper(nums, left, man_idx-1);
        root.right = helper(nums, man_idx+1, right);
        return root;
    }
}
/**
 * 执行用时：
 * 109 ms
 * , 在所有 Java 提交中击败了
 * 5.06%
 * 的用户
 * 内存消耗：
 * 38.9 MB
 * , 在所有 Java 提交中击败了
 * 13.36%
 * 的用户
 */
