package pers.weida.leetcode.tools;
import java.util.Queue;
import java.util.LinkedList;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
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

