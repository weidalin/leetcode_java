package leetcode.labuladong.binarytree.binarytree107_levelOrderBottom;

import tools.TreeNode;

import java.util.*;

/**
 * 107. 二叉树的层序遍历 II
 * 给定一个二叉树，返回其节点值自底向上的层序遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其自底向上的层序遍历为：
 *
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 */
public class levelOrderBottom_1 {
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> res = new LinkedList<>();
        if(root == null)
            return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int idx = -1;

        while(!queue.isEmpty()){
            List<Integer> list_tmp = new LinkedList<>();
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if(node == null)    continue;
                queue.add(node.left);
                queue.add(node.right);
                list_tmp.add(node.val);
            }
            if(list_tmp.size() > 0)
                res.addFirst(list_tmp);
        }
        return res;
    }
}
