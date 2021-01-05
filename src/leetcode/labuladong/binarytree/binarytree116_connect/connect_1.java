package leetcode.labuladong.binarytree.binarytree116_connect;

import tools.Node;

/*
116. 填充每个节点的下一个右侧节点指针
给定一个 完美二叉树 ，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：

struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。

初始状态下，所有 next 指针都被设置为 NULL。



进阶：

你只能使用常量级额外空间。
使用递归解题也符合要求，本题中递归程序占用的栈空间不算做额外的空间复杂度。

 */
public class connect_1 {
    public static Node connect(Node root) {
        if (root == null)   return null;
        connectTwoNode(root.left, root.right);
        return root;

    }

    private static void connectTwoNode(Node left, Node right) {
        if(left == null || right == null)   return;
        //连接操作
        left.next = right;

        //连接相同父节点的两个子节点
        connectTwoNode(left.left, left.right);
        connectTwoNode(right.left, right.right);
        //连接跨越父节点的两个子节点
        connectTwoNode(left.right, right.left);
    }
    /**
     * 执行用时：
     * 3 ms
     * , 在所有 Java 提交中击败了
     * 41.98%
     * 的用户
     * 内存消耗：
     * 38.6 MB
     * , 在所有 Java 提交中击败了
     * 77.27%
     * 的用户
     */
}
