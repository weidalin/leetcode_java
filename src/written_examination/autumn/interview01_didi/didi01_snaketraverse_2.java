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

public class didi01_snaketraverse_2 {
    public static void snaketraverse(TreeNode root){
        if(root == null)    return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int idx = -1;
        while(!queue.isEmpty()){
            Deque<Integer> queue_tmp = new LinkedList<>();
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if(node == null)    return;
                queue.add(node.left);
                queue.add(node.right);
                if(idx == 1)
                    queue_tmp.addFirst(node.val);
                else
                    queue_tmp.addLast(node.val);
            }
            while(!queue_tmp.isEmpty()){
                System.out.print(queue_tmp.poll());
            }
            System.out.println();
            idx *= -1;
        }
    }

}
