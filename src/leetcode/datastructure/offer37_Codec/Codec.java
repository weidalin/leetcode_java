package leetcode.datastructure.offer37_Codec;

import tools.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

import static tools.TreeNode.InitTree;

/**
 * 剑指 Offer 37. 序列化二叉树
 * 请实现两个函数，分别用来序列化和反序列化二叉树。
 *
 * 你需要设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
 *
 * 提示：输入输出格式与 LeetCode 目前使用的方式一致，详情请参阅 LeetCode 序列化二叉树的格式。你并非必须采取这种方式，你也可以采用其他的方法解决这个问题。
 *
 *
 *
 * 示例：
 *
 *
 * 输入：root = [1,2,3,null,null,4,5]
 * 输出：[1,2,3,null,null,4,5]
 *
 */
public class Codec {
    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        if(root == null){
            return "[]";
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        StringBuilder sb = new StringBuilder("[");
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node != null){
                queue.add(node.left);
                queue.add(node.right);
                sb.append(node.val + ",");
            }else{
                sb.append("null,");
            }
        }
        sb.deleteCharAt(sb.length() - 1).append(']');
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        if("[]".equals(data)){
            return null;
        }
        String[] input = data.substring(1, data.length() - 1).split(",");
        Queue<TreeNode> queue = new LinkedList<>();
        int i = 0;
        TreeNode root = new TreeNode(Integer.parseInt(input[i]));
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node != null){
                i++;
                if(!"null".equals(input[i])){
                    node.left = new TreeNode(Integer.parseInt(input[i]));
                    queue.add(node.left);
                }else{
                    node.left = null;
                }

                i++;
                if(!"null".equals(input[i])){
                    node.right = new TreeNode(Integer.parseInt(input[i]));
                    queue.add(node.right);
                }else{
                    node.right = null;
                }
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Integer[] input1 = {1,2,3,null,null,4,5};
        TreeNode root = InitTree(input1);
        String res = serialize(root);
        System.out.println(res);
        System.out.println("=========================");
        TreeNode rebuildtree = deserialize(res);
    }
}
