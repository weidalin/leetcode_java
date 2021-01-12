package leetcode.labuladong.binarytree.binarytree297_CodeTree;

import tools.TreeNode;
//not work
public class CodeTree_1 {
    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        StringBuilder res = new StringBuilder();
        if(root != null){
            res.append(root.val + "," + serialize(root.left) + ","+serialize(root.right));
        }else{
            return "null";
        }
        return res.toString();
    }


    // Decodes your encoded data to tree.
    int l = 0;
    public TreeNode deserialize(String data) {
        String[] s = data.split(",");
        return deserialize_helper(s, l);
    }

    private TreeNode deserialize_helper(String[] s, int l) {
        TreeNode root = new TreeNode(Integer.parseInt(s[l++]));
        root.left = deserialize_helper(s, l);
        root.right = deserialize_helper(s, l);
        return root;
    }

}
