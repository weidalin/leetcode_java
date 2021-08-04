package written_examination.autumn.interview01_didi;

import tools.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
      1
     23
    45657
 蛇形遍历树
        1
        32
        4567
 */

public class didi01_snaketraverse {
    /**
     * 怎么写成了先序遍历。。干
     * @param root
     */
    public static void snaketraverse(TreeNode root){
        if(root == null)    return;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.addLast(root);
        int idx = 1;
        while(!deque.isEmpty()){
            int size = deque.size();
            for(int i = 0; i < size; i++) {
                if (idx == 1) {
                    TreeNode node = deque.poll();
                    if(node == null) continue;
                    System.out.print(node.val);
                    deque.add(node.left);
                    deque.add(node.right);
                } else {
                    TreeNode node = deque.removeFirst();
                    if(node == null) continue;
                    System.out.print(node.val);
                    deque.addFirst(node.right);
                    deque.addFirst(node.left);
                }
                idx *= -1;
            }
        }
    }
}
