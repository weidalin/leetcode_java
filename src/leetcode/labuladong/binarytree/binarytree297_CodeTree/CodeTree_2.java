package leetcode.labuladong.binarytree.binarytree297_CodeTree;

import sun.awt.image.ImageWatched;
import tools.TreeNode;

import java.util.LinkedList;

public class CodeTree_2 {
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
    public static TreeNode deserialize(String data) {
        LinkedList<String> nodes = new LinkedList<>();
        for(String s : data.split(",")){
            nodes.addLast(s);
        }
        return deserialize_helper(nodes);
    }

    private static TreeNode deserialize_helper(LinkedList<String> nodes) {
        if(nodes.isEmpty())     return null;

        String first = nodes.removeFirst();
        if(first.equals("null"))    return null;
        TreeNode root = new TreeNode(Integer.parseInt(first));
        root.left = deserialize_helper(nodes);
        root.right = deserialize_helper(nodes);
        return root;
    }
}/**

 执行用时：
 26 ms
 , 在所有 Java 提交中击败了
 33.10%
 的用户
 内存消耗：
 41.5 MB
 , 在所有 Java 提交中击败了
 9.85%
 的用户
*/
