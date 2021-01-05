package leetcode.labuladong.binarytree.binarytree_226.invertTree;

import tools.TreeNode;

public class invertTree_2 {
    public static TreeNode invertTree(TreeNode root) {
        if(root != null){
            TreeNode left = invertTree(root.right);
            TreeNode right = invertTree(root.left);
            root.left = left;
            root.right = right;
        }
        return root;
    }
}
/**
 *用时：
 * 0 ms
 * , 在所有 Java 提交中击败了
 * 100.00%
 * 的用户
 * 内存消耗：
 * 35.6 MB
 * , 在所有 Java 提交中击败了
 * 94.59%
 * 的用户
 */
