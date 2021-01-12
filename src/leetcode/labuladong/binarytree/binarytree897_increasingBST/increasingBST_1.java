package leetcode.labuladong.binarytree.binarytree897_increasingBST;

import tools.TreeNode;
/*
给你一个树，请你 按中序遍历 重新排列树，使树中最左边的结点现在是树的根，并且每个结点没有左子结点，只有一个右子结点。


 */
public class increasingBST_1 {
    static TreeNode cur;
    public static TreeNode increasingBST(TreeNode root) {
       TreeNode res = new TreeNode(0);
       cur = res;
       inorder(root);
       return res.right;
    }

    private static void inorder(TreeNode root) {
        if(root == null)    return;
        inorder(root.left);
        root.left = null;
        cur.right = root;
        cur = root;
        inorder(root.right);
    }
}
/**
 * 执行结果：
 * 通过
 * 显示详情
 * 执行用时：
 * 0 ms
 * , 在所有 Java 提交中击败了
 * 100.00%
 * 的用户
 * 内存消耗：
 * 36 MB
 * , 在所有 Java 提交中击败了
 * 52.27%
 * 的用户
 */
