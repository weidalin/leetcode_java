package leetcode.hotcode.hot337_robIII;

import tools.TreeNode;

public class rob_1 {
    /**
     *
     * @param root
     * @return
     */
    public int rob(TreeNode root) {
        int[] res = rob_help(root);
        return Math.max(res[0], res[1]);

    }

    private int[] rob_help(TreeNode root) {
        if(root == null){
            return new int[2];
        }
        int[] res = new int[2];
        int[] left = rob_help(root.left);
        int[] right = rob_help(root.right);
        res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        res[1] = root.val + left[0] + right[0];
        return res;
    }
/**
 * 超时
 */
}
