package leetcode.labuladong.binarytree.offer34_pathSum;

import tools.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 剑指 Offer 34. 二叉树中和为某一值的路径
 * 输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
 *
 * 示例:
 * 给定如下二叉树，以及目标和 target = 22，
 *
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \    / \
 *         7    2  5   1
 * 返回:
 *
 * [
 *    [5,4,11,2],
 *    [5,8,4,5]
 * ]
 */
public class pathSum_2 {
    static List<List<Integer>> res;
    static LinkedList<Integer> tmp;
    public static List<List<Integer>> pathSum(TreeNode root, int target) {
        res = new LinkedList<>();
        tmp = new LinkedList<>();
        recure(root, target, 0);
        return res;
    }

    private static void recure(TreeNode root, int target, int curSum) {
        if(root == null){
            return;
        }
        tmp.add(root.val);
        curSum += root.val;
        if(root.left == null && root.right == null && curSum == target){
            res.add(new LinkedList<>(tmp));
        }
        recure(root.left, target, curSum);
        recure(root.right, target, curSum);
        tmp.removeLast();
    }
}