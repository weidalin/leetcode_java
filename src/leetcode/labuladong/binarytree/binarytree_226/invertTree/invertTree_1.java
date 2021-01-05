package leetcode.labuladong.binarytree.binarytree_226.invertTree;

import tools.TreeNode;

public class invertTree_1 {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null)   return null;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        //
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}/**
 执行用时：
 0 ms
 , 在所有 Java 提交中击败了
 100.00%
 的用户
 内存消耗：
 35.9 MB
 , 在所有 Java 提交中击败了
 40.85%
 的用户*/

