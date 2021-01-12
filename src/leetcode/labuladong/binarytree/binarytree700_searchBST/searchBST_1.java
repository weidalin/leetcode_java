package leetcode.labuladong.binarytree.binarytree700_searchBST;

import tools.TreeNode;

/*
700. 二叉搜索树中的搜索
给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
例如，
给定二叉搜索树:
        4
       / \
      2   7
     / \
    1   3

和值: 2
 */
public class searchBST_1 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null )
            return null;
        else if(root.val == val)
            return root;
        else if (root.val > val)
            return searchBST(root.left, val);
        else
            return searchBST(root.right, val);
    }
}
/**
 * 执行用时：
 * 0 ms
 * , 在所有 Java 提交中击败了
 * 100.00%
 * 的用户
 * 内存消耗：
 * 39.5 MB
 * , 在所有 Java 提交中击败了
 * 12.99%
 * 的用户
 */
