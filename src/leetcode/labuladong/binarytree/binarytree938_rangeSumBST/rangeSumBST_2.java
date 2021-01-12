package leetcode.labuladong.binarytree.binarytree938_rangeSumBST;

import tools.TreeNode;

/*
938. 二叉搜索树的范围和
给定二叉搜索树的根结点 root，返回值位于范围 [low, high] 之间的所有结点的值的和。



示例 1：


输入：root = [10,5,15,3,7,null,18], low = 7, high = 15
输出：32
 */
public class rangeSumBST_2 {
    public static int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null)    return 0;
        int left = rangeSumBST(root.left, low, high);
        int right = rangeSumBST(root.right, low, high);
        if(root.val >= low && root.val <= high){
            return left + right + root.val;
        }else{
            return left + right;
        }
    }
}
/**
 * 执行结果：
 * 通过
 * 显示详情
 * 执行用时：
 * 1 ms
 * , 在所有 Java 提交中击败了
 * 48.41%
 * 的用户
 * 内存消耗：
 * 46.3 MB
 * , 在所有 Java 提交中击败了
 * 81.02%
 * 的用户
 */
