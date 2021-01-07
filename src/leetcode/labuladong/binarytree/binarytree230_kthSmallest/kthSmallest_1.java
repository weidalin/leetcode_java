package leetcode.labuladong.binarytree.binarytree230_kthSmallest;

import tools.TreeNode;

/*
230. 二叉搜索树中第K小的元素
给定一个二叉搜索树，编写一个函数 kthSmallest 来查找其中第 k 个最小的元素。

说明：
你可以假设 k 总是有效的，1 ≤ k ≤ 二叉搜索树元素个数。

示例 1:

输入: root = [3,1,4,null,2], k = 1
   3
  / \
 1   4
  \
   2
输出: 1
 */
public class kthSmallest_1 {
    static int res, rank;
    public static int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return res;
    }

    private static void helper(TreeNode root, int k) {
        if (root == null)
            return;
        helper(root.left, k);
        rank ++;
        if(k == rank){
            res  = root.val;
            return;
        }
        helper(root.right, k);
    }
}
/**
 执行用时：
 0 ms
 , 在所有 Java 提交中击败了
 100.00%
 的用户
 内存消耗：
 38.3 MB
 , 在所有 Java 提交中击败了
 66.54%
 的用户*/