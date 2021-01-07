package leetcode.labuladong.binarytree.binarytree652_findDuplicateSubtrees;

import tools.TreeNode;

import java.util.LinkedList;
import java.util.List;

/*
652. 寻找重复的子树
给定一棵二叉树，返回所有重复的子树。对于同一类的重复子树，你只需要返回其中任意一棵的根结点即可。

两棵树重复是指它们具有相同的结构以及相同的结点值。

示例 1：

        1
       / \
      2   3
     /   / \
    4   2   4
       /
      4
下面是两个重复的子树：

      2
     /
    4
和

    4
 */

/**
 * not work
 */
public class findDuplicateSubtrees_3 {
    public static List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        LinkedList<TreeNode> res = new LinkedList<>();
        if (root != null)   return null;
        boolean bool = helper(root.left, root.right);
        if (bool == true)
            res.add(root.left);
        findDuplicateSubtrees(root.left);
        findDuplicateSubtrees(root.right);
        return res;

    }

    private static boolean helper(TreeNode left, TreeNode right) {
        if(left == null && right == null)
            return true;
        if(left == null || right == null)
            return false;
        else if(left.val == right.val){
            return helper(left.left,right.left) && helper(left.right, right.right);
        }
        return false;
    }
}
