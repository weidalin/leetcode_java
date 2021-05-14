package leetcode.swordoffer.offer32I_levelOrder;

import tools.TreeNode;
import java.util.*;

/**
 * 剑指 Offer 32 - I. 从上到下打印二叉树
 * 从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。
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
 * 返回：
 *
 * [3,9,20,15,7]
 */
public class levelOrder_1 {
    public static int[] levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        if(root != null){
            queue.add(root);
        }
        while(queue.isEmpty() == false){
            for(int i = 0; i < queue.size(); i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
        }
        Integer[] res = new Integer[list.size()];
//        int[] res = new int[n];
        res = list.toArray(res);
        int[] res_ = new int[list.size()];
        for(int i = 0; i < res_.length; i++){
            res_[i] = res[i];
        }
        return res_;
    }
}
