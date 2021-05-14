package leetcode.swordoffer.offer32III_levelOrder;

import tools.TreeNode;

import java.util.*;

/**
 * 剑指 Offer 32 - III. 从上到下打印二叉树 III
 * 请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 *
 *
 *
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 *
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 */
public class levelOrder_1 {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return res;
        }
        queue.addLast(root);
        int cur = 1;
        while(queue.size() > 0){
            LinkedList<Integer> tmp = new LinkedList<>();
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.pollFirst();
                if(cur == 1){
                    tmp.add(node.val);
                }else{
                    tmp.addFirst(node.val);
                }

                if(node.left != null){
                    queue.addLast(node.left);
                }if(node.right != null){
                    queue.addLast(node.right);
                }
            }
            cur *= -1;
            res.add(tmp);
        }
        return res;
    }


}
/**
 执行用时：
 1 ms
 , 在所有 Java 提交中击败了
 99.85%
 的用户
 内存消耗：
 38.5 MB
 , 在所有 Java 提交中击败了
 79.12%
 的用户
 */