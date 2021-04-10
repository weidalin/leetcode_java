package leetcode.swordoffer.offer54_kthLargest;

import tools.TreeNode;

/**
 * 剑指 Offer 54. 二叉搜索树的第k大节点
 * 给定一棵二叉搜索树，请找出其中第k大的节点。
 *
 *
 *
 * 示例 1:
 *
 * 输入: root = [3,1,4,null,2], k = 1
 *    3
 *   / \
 *  1   4
 *   \
 *    2
 * 输出: 4
 */
public class KthLargest_2 {
    static int res;
    static int k;
    public static int kthLargest(TreeNode root, int k) {
        KthLargest_2.k = k;
        dfs(root);
        return res;
    }

    private static void dfs(TreeNode root) {
        if(root == null) return;
        dfs(root.right);
        if(k == 0) return;
        if(--k == 0)
            res = root.val;
        dfs(root.left);
    }
    public void dfs_my(TreeNode root){
        if (root == null)   return ;
        dfs(root.right);
        if (k == 0) return;
        if(k == 1) res = root.val;
        k--;
        dfs(root.left);
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
 * 38.1 MB
 * , 在所有 Java 提交中击败了
 * 87.05%
 * 的用户
 */

}
