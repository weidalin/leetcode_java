package leetcode.swordoffer.offer27_mirrorTree;

import tools.TreeNode;

/**
 * 剑指 Offer 27. 二叉树的镜像
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 *
 * 例如输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 镜像输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 *
 *
 *
 * 示例 1：
 *
 * 输入：root = [4,2,7,1,3,6,9]
 * 输出：[4,7,2,9,6,3,1]
 */
public class MirrorTree_1 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null){
            return root;
        }
        mirrorTree(root.right);
        mirrorTree(root.left);
        TreeNode right = root.right;
        root.right = root.left;
        root.left = right;
        return root;
    }
    /**
     * 执行用时：
     * 0 ms
     * , 在所有 Java 提交中击败了
     * 100.00%
     * 的用户
     * 内存消耗：
     * 35.8 MB
     * , 在所有 Java 提交中击败了
     * 62.82%
     * 的用户
     */
}
