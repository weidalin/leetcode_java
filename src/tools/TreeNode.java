package tools;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {
    public int val;
    // 以该节点为根的树的节点总数
    public int size;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     * 调用以构造二叉树，BFS
     * @param vals 数组
     * @return
     */
    public static TreeNode InitTree(Integer[] vals) {
        TreeNode root = new TreeNode(vals[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        int cur = 1;
        queue.offer(root);
        while (queue != null) {
            TreeNode r = queue.poll();
            if (vals[cur] == null) {
                r.left=null;
            } else {
                r.left = new TreeNode(vals[cur]);
                queue.offer(r.left);
            }
            if (++cur >= vals.length) {
                break;
            }
            if (vals[cur] == null) {
                r.right = null;
            } else {
                r.right = new TreeNode(vals[cur]);
                queue.offer(r.right);
            }
            if (++cur >= vals.length) {
                break;
            }
        }
        return root;
    }

    public static void main(String[] args) {
        //测试
        Integer[] integets_arr = {3, 5, 1, 6, 2, 0, 8, null, null, 7, 4};
        TreeNode treeNode = InitTree(integets_arr);
        System.out.println(treeNode.val);

    }
}

