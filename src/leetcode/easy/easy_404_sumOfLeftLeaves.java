package src.leetcode.easy;

import tools.TreeNode;

import static tools.TreeNode.InitTree;

/**
 * 404. 左叶子之和
 * 计算给定二叉树的所有左叶子之和。
 *
 * 示例：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
 */
public class easy_404_sumOfLeftLeaves {
    public static int sumOfLeftLeaves(TreeNode root) {
        int res = dfs(root);
        return res;
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
     * 36.8 MB
     * , 在所有 Java 提交中击败了
     * 58.30%
     * 的用户
     * 炫耀一下:
     * @param tree
     * @return
     */
    public static int dfs(TreeNode tree){
        int res = 0;
        //遍历左子树
        if (tree.left != null){
            //如果是叶子节点
            if (isTreeLeef(tree.left)){
                res += tree.left.val;
            }else{
                res += dfs(tree.left);
            }
        }
        //遍历右子树
        if(tree.right != null){
            res += dfs(tree.right);
        }
        return res;
    }

    private static boolean isTreeLeef(TreeNode tree) {
        return tree.left== null && tree.right == null;
    }

    public static void main(String[] args){
        Integer[] integets_arr = {3, 9, 20, null, null, 15, 7};
        TreeNode tree = InitTree(integets_arr);
        int i = sumOfLeftLeaves(tree);
        System.out.println(i);

    }
}
