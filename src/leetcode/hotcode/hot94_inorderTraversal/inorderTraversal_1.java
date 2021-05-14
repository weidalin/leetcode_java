package leetcode.hotcode.hot94_inorderTraversal;

import tools.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 *
 *
 *
 * 示例 1：
 *
 *
 * 输入：root = [1,null,2,3]
 * 输出：[1,3,2]
 * 示例 2：
 *
 * 输入：root = []
 * 输出：[]
 * 示例 3：
 *
 * 输入：root = [1]
 * 输出：[1]
 */
public class inorderTraversal_1 {
    static List<Integer> res;
    public static List<Integer> inorderTraversal(TreeNode root) {
        res = new ArrayList<>();
        recure(root);
        return res;
    }

    private static void recure(TreeNode root) {
        if(root != null){
            recure(root.left);
            inorderTraversal_1.res.add(root.val);
            recure(root.right);
            System.out.println("res: " + inorderTraversal_1.res);
        }
    }
}
