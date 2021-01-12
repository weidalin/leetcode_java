package leetcode.labuladong.binarytree.binarytree297_CodeTree;

import tools.TreeNode;

public class CodeTree {
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
    static public int left = 0;
    public static TreeNode deserialize(String data) {
        String[] s = data.split(",");
        return deserialize_helper(s);
    }

    private static TreeNode deserialize_helper(String[] s) {
        String first = s[left++];
        if(first.equals("null")){
            return null;
        }else{
            TreeNode root = new TreeNode(Integer.parseInt(first));
            root.left = deserialize_helper(s);
            root.right = deserialize_helper(s);
            return root;
        }

    }

}
