package leetcode.labuladong.binarytree.binarytree589_preorder;

import tools.Node2.Node;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
589. N叉树的前序遍历
给定一个 N 叉树，返回其节点值的前序遍历。

例如，给定一个 3叉树 :




 */
public class preorder_2 {
    LinkedList<Integer> res = new LinkedList<>();
    LinkedList<Node> stack = new LinkedList<>();

    public List<Integer> preorder(Node root) {
        if(root == null)    return new LinkedList<>();
        stack.add(root);
        while(!stack.isEmpty()){
            Node cur = stack.pollLast();
            res.add(cur.val);
            Collections.reverse(cur.children);
            for(Node node : cur.children)
                stack.add(node);
        }
        return res;
//        stack.add(root);
//        while (!stack.isEmpty()) {
//            Node node = stack.pollLast();
//            res.add(node.val);
//            Collections.reverse(node.children);
//            for (Node item : node.children) {
//                stack.add(item);
//            }
//        }
//        return res;

    }
}
/**
 执行用时：
 4 ms
 , 在所有 Java 提交中击败了
 26.09%
 的用户
 内存消耗：
 39.4 MB
 , 在所有 Java 提交中击败了
 41.27%
 的用户*/