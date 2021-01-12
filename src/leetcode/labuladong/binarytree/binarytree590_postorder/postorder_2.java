package leetcode.labuladong.binarytree.binarytree590_postorder;


import tools.Node2.Node;

import java.util.LinkedList;
import java.util.List;

public class postorder_2 {
    List<Integer> res = new LinkedList<>();
    public List<Integer> postorder(Node root) {
        if (root == null)   return new LinkedList<>();
        List<Node>childrens = root.children;
        for(Node node : childrens){
            postorder(node);
        }
        res.add(root.val);
        return res;
    }
}
/**
 * 执行用时：
 * 1 ms
 * , 在所有 Java 提交中击败了
 * 92.09%
 * 的用户
 * 内存消耗：
 * 39.3 MB
 * , 在所有 Java 提交中击败了
 * 59.37%
 * 的用户
 */
