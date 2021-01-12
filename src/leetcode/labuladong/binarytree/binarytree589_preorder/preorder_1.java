package leetcode.labuladong.binarytree.binarytree589_preorder;

import tools.Node2.Node;

import java.util.LinkedList;
import java.util.List;

/*
589. N叉树的前序遍历
给定一个 N 叉树，返回其节点值的前序遍历。

例如，给定一个 3叉树 :




 */
public class preorder_1 {
    LinkedList<Integer> res = new LinkedList<>();
    public List<Integer> preorder(Node root) {
        if(root == null)    return new LinkedList<>();
        res.add(root.val);
        for(Node node:root.children)
            preorder(node);
        return res;
    }
}/**
 执行用时：
 1 ms
 , 在所有 Java 提交中击败了
 91.14%
 的用户
 内存消耗：
 39.2 MB
 , 在所有 Java 提交中击败了
 59.59%
 的用户*/
