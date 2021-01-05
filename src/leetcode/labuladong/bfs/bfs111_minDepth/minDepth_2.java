package leetcode.labuladong.bfs.bfs111_minDepth;

import tools.TreeNode;

public class minDepth_2 {
    public static int minDepth(TreeNode root) {
        if (root == null) return 0;
        //1.dfs
        if (root.left == null && root.right == null)   return 1;
        else if(root.left != null && root.right == null){
            return 1+minDepth(root.left);
        }else if(root.right != null && root.left == null){
            return 1+minDepth(root.right);
        }else if(root.right != null && root.left != null){
            return 1 + Math.min(minDepth(root.right), minDepth(root.left));
        }else{
            return Integer.MAX_VALUE;
        }
    }
    /**
     * 执行用时：
     * 8 ms
     * , 在所有 Java 提交中击败了
     * 33.77%
     * 的用户
     * 内存消耗：
     * 59.3 MB
     * , 在所有 Java 提交中击败了
     * 18.26%
     * 的用户
     */
}
