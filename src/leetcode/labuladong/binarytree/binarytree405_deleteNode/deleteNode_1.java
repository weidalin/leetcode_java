package leetcode.labuladong.binarytree.binarytree405_deleteNode;

import tools.TreeNode;

/*
450. 删除二叉搜索树中的节点
给定一个二叉搜索树的根节点 root 和一个值 key，删除二叉搜索树中的 key 对应的节点，并保证二叉搜索树的性质不变。返回二叉搜索树（有可能被更新）的根节点的引用。

一般来说，删除节点可分为两个步骤：

首先找到需要删除的节点；
如果找到了，删除它。
说明： 要求算法时间复杂度为 O(h)，h 为树的高度。
 */
public class deleteNode_1 {
    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)   return null;
        if(root.val == key){
            if(root.left == null)   return root = root.right;
            if(root.right == null)   return root = root.left;
            if(root.left != null && root.right != null){
                TreeNode max_in_left = getMaxTree(root.left);
                root.val = max_in_left.val;
                root.left = deleteNode(root.left, max_in_left.val);
            }
        }else if (root.val > key){
            root.left = deleteNode(root.left, key);
        }else{
            root.right = deleteNode(root.right, key);
        }
        return root;
    }

    private static TreeNode getMaxTree(TreeNode root) {
        while(root.right != null){
            root = root.right;
        }
        return root;
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
 * 38.9 MB
 * , 在所有 Java 提交中击败了
 * 66.31%
 * 的用户
 */
