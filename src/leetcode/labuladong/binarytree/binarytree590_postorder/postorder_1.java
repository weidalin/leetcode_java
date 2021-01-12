package leetcode.labuladong.binarytree.binarytree590_postorder;


import tools.Node2.Node;

import java.util.LinkedList;
import java.util.List;

public class postorder_1 {
    public List<Integer> postorder(Node root) {
        LinkedList<Integer> res = new LinkedList<>();
        LinkedList<Node> stack = new LinkedList<>();
        if (root != null) {
            stack.addFirst(root);
            while (!stack.isEmpty()) {
                Node cur = stack.pollLast();//尾部插入，尾部移除
                res.addFirst(cur.val);
                for (Node node : cur.children) {
                    stack.addFirst(node);
                }
            }
            return res;
        } else {
            return new LinkedList<>();
        }
    }
}/**
 执行用时：
 4 ms
 , 在所有 Java 提交中击败了
 40.31%
 的用户
 内存消耗：
 39.3 MB
 , 在所有 Java 提交中击败了
 58.90%
 的用户
 炫耀一下:*/
