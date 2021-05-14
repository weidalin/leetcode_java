package leetcode.swordoffer.offer34_pathSum;

import tools.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 剑指 Offer 34. 二叉树中和为某一值的路径
 * 输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
 *
 *
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
public class pathSum_1 {

    static List<List<Integer>> res = new ArrayList<>();
    static int tar;
    public static List<List<Integer>> pathSum(TreeNode root, int target) {
        tar = target;
        if(root == null){
            return res;
        }
        List<Integer> tmp = new ArrayList<>();
        tmp.add(root.val);
        int sum = root.val;
        dfs(root, tmp, sum);
        return res;
    }

    private static void dfs(TreeNode root, List<Integer> tmp, int sum) {
        //1.exit
        if(root.left == null && root.right == null && sum == tar){
            res.add(new ArrayList<>(tmp));
        }
        //2.choose list
        if(root.left != null ){
//            List<Integer> tmp_left = new ArrayList(tmp);
            tmp.add(root.left.val);
            dfs(root.left, tmp, sum + root.left.val);
//            tmp.remove(tmp.size()-1);
        }
        if(root.right != null){
//            List<Integer> tmp_right = new ArrayList(tmp);
            tmp.add(root.right.val);
            dfs(root.right, tmp, sum + root.right.val);
        }
        tmp.remove(tmp.size()-1);

    }
}
/**
 执行用时：
 2 ms
 , 在所有 Java 提交中击败了
 27.95%
 的用户
 内存消耗：
 41.3 MB
 , 在所有 Java 提交中击败了
 5.01%
 的用户*/