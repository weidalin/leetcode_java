package leetcode.hotcode.hot538_convertBST;

import tools.TreeNode;

/**
 * 538. 把二叉搜索树转换为累加树
 * 给出二叉 搜索 树的根节点，该树的节点值各不相同，请你将其转换为累加树（Greater Sum Tree），使每个节点 node 的新值等于原树中大于或等于 node.val 的值之和。
 *
 * 提醒一下，二叉搜索树满足下列约束条件：
 *
 * 节点的左子树仅包含键 小于 节点键的节点。
 * 节点的右子树仅包含键 大于 节点键的节点。
 * 左右子树也必须是二叉搜索树。
 * 注意：本题和 1038: https://leetcode-cn.com/problems/binary-search-tree-to-greater-sum-tree/ 相同
 *
 * 示例 1：
 *
 * 输入：[4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
 * 输出：[30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]
 */
public class convertBST_1 {
    static int tmp;
    public static TreeNode convertBST(TreeNode root) {
        tmp = 0;
        convertBST_helper(root);
        return root;
    }

    private static void convertBST_helper(TreeNode root) {
//        System.out.println(tmp);
        if(root == null){
            return ;
        }
        convertBST_helper(root.right);
        root.val = root.val + tmp;
        tmp = root.val;
        convertBST_helper(root.left);
    }
}
