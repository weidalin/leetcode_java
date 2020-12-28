package leetcode.swordoffer.offer32.levelOrder;

import tools.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder_1 {
    public static void levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root != null)
            queue.add(root);
        while(!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            res.add(tmp);
        }
    }
}/**
 执行用时：
 1 ms
 , 在所有 Java 提交中击败了
 92.67%
 的用户
 内存消耗：
 38.6 MB
 , 在所有 Java 提交中击败了
 67.96%
 的用户*/
