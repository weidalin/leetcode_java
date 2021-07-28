package leetcode.hotcode.hot437_pathSum;

import tools.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 437. 路径总和 III
 * 给定一个二叉树，它的每个结点都存放着一个整数值。
 *
 * 找出路径和等于给定数值的路径总数。
 *
 * 路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 *
 * 二叉树不超过1000个节点，且节点数值范围是 [-1000000,1000000] 的整数。
 *
 * 示例：
 *
 * root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
 *
 *       10
 *      /  \
 *     5   -3
 *    / \    \
 *   3   2   11
 *  / \   \
 * 3  -2   1
 *
 * 返回 3。和等于 8 的路径有:
 *
 * 1.  5 -> 3
 * 2.  5 -> 2 -> 1
 * 3.  -3 -> 11
 */
public class pathSum_2 {
    // 暴力
    public static int pathSum(TreeNode root, int targetSum) {
        if(root == null){
            return 0;
        }
        return calPathSum(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    private static int calPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return 0;
        }
        int res = 0;
        targetSum -= root.val;
        if(targetSum == 0){
            res += 1;
        }
        return res + calPathSum(root.left, targetSum) + calPathSum(root.right, targetSum);
    }
}
