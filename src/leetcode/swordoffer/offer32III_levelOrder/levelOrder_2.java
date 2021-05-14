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
public class levelOrder_2 {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return res;
        }
        queue.addLast(root);
        int cur = 1;
        while(queue.size() > 0){
            List<Integer> tmp = new ArrayList<>();
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.pollFirst();
                tmp.add(node.val);
                if(node.left != null){
                    queue.addLast(node.left);
                }if(node.right != null){
                    queue.addLast(node.right);
                }
            }
            if(cur == -1){
//                tmp = reverst(tmp);
                Collections.reverse(tmp);
            }
            cur *= -1;
            res.add(tmp);
        }
        return res;
    }

    private static List<Integer> reverst(List<Integer> tmp) {
        if(tmp.size() == 1){
            return tmp;
        }
        Integer tmpp = tmp.get(0);
        tmp.remove(0);
        tmp = reverst(tmp);
        tmp.add(tmpp);
        return tmp;
    }

}
/**
 执行用时：
 2 ms
 , 在所有 Java 提交中击败了
 27.05%
 的用户
 内存消耗：
 38.7 MB
 , 在所有 Java 提交中击败了
 61.96%
 的用户
 */