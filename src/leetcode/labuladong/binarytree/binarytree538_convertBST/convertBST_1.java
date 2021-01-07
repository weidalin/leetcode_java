package leetcode.labuladong.binarytree.binarytree538_convertBST;

import tools.TreeNode;
/*
538. 把二叉搜索树转换为累加树
给出二叉 搜索 树的根节点，该树的节点值各不相同，请你将其转换为累加树（Greater Sum Tree），使每个节点 node 的新值等于原树中大于或等于 node.val 的值之和。

提醒一下，二叉搜索树满足下列约束条件：

节点的左子树仅包含键 小于 节点键的节点。
节点的右子树仅包含键 大于 节点键的节点。
左右子树也必须是二叉搜索树。
 */
public class convertBST_1 {
    public static int sum;
    public static TreeNode convertBST(TreeNode root) {
        helper(root);
        return root;
    }

    private static void helper(TreeNode root) {
        //降序打印搜索树
        if (root == null)   return ;
        helper(root.right);
        sum += root.val;
        root.val = sum;
        helper(root.left);
    }
    /**
     * 执行用时：
     * 0 ms
     * , 在所有 Java 提交中击败了
     * 100.00%
     * 的用户
     * 内存消耗：
     * 35.7 MB
     * , 在所有 Java 提交中击败了
     * 92.41%
     * 的用户
     */
}
