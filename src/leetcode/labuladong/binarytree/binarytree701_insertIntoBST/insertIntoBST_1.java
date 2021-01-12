package leetcode.labuladong.binarytree.binarytree701_insertIntoBST;

import tools.TreeNode;

public class insertIntoBST_1 {
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            root = new TreeNode(val);
        }
        if(root.val > val){
            root.left = insertIntoBST(root.left, val);
        }else if (root.val < val){
            root.right = insertIntoBST(root.right, val);
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
 * 39.1 MB
 * , 在所有 Java 提交中击败了
 * 94.02%
 * 的用户
 * 炫耀一下:
 */
