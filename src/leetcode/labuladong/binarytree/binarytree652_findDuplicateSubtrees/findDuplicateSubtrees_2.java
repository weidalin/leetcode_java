package leetcode.labuladong.binarytree.binarytree652_findDuplicateSubtrees;

import tools.TreeNode;

import java.util.*;

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
public class findDuplicateSubtrees_2 {
    static Map<String, Integer> count;
    static List<TreeNode> ans;
    public static List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        count = new HashMap<>();
        ans = new ArrayList<>();
        helper(root);
        System.out.print("count:"+count);
        return ans;

    }

    private static String helper(TreeNode node) {
        if(node == null)    return "#";
        String serial = node.val + "-" + helper(node.left) + "-" + helper(node.right);
        count.put(serial, count.getOrDefault(serial, 0) + 1);
        if (count.get(serial) == 2)
            ans.add(node);
        return serial;
    }
}
/**
 执行结果：
 通过
 显示详情
 执行用时：
 32 ms
 , 在所有 Java 提交中击败了
 16.92%
 的用户
 内存消耗：
 43.5 MB
 , 在所有 Java 提交中击败了
 33.51%
 的用户
 炫耀一下:*/