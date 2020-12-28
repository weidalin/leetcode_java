package leetcode.hotcode.hot266_invertTree;

import tools.TreeNode;

import java.util.LinkedList;

public  class InvertTree_2 {
    /**
     * iterate
     * @param root
     * @return
     */
    public static TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            TreeNode left = tmp.left;
            tmp.left = tmp.right;
            tmp.right = left;
            if (tmp.left != null)
                queue.add(tmp.left);

            if (tmp.right != null)
                queue.add(tmp.right);


        }
        return root;
    }
}
