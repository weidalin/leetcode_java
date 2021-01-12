package leetcode.labuladong.binarytree.binarytree897_increasingBST;

import tools.TreeNode;

/*
给你一个树，请你 按中序遍历 重新排列树，使树中最左边的结点现在是树的根，并且每个结点没有左子结点，只有一个右子结点。


 */
public class increasingBST_2 {
    public static TreeNode increasingBST(TreeNode root) {
        if(root == null)    return null;
        TreeNode left = increasingBST(root.left);
        TreeNode right = increasingBST(root.right);
        TreeNode cur = root;
        if(left != null){
            cur = left;
            while(left != null)
                continue;
        }
        left = root;

        left.left = null;//置为空
        left.right = right;
        return root;
    }
}
