package written_examination.autumn.autumn20_bytedance.bytedance02_symmTree;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/13 3:30 下午
 */
/*
题目描述
给定一颗二叉树，二叉树每个节点都有一个唯一的整数值代表节点，在遍历时，我们使用节点的整数值作为标记;结构对称，是指二叉树从根节点往下看，左右翻转一下，能够重合(不考虑节点内容比较，仅仅是结构)，我们就称这棵二又树树结构对称

输入:二叉树的节点个数N(0<N<60000)、前序和中序遍历结果，分别是第一行、第二行与第三行;各个节点整数值在1到60000之间
。

输出:判断这棵二叉树是否结构对称，若对称请输出最大值节点在树中对称节点的整数值，不对称请直接输出最大值节点的整数值

输入描述
二叉树的前序和中序 遍历结果，以数组序列表示
第一行为节点个数N(0<N<60000)前序和中序 遍历结果，输入分别是第二行与第三行

3
1 3 4
3 1 4
1
2
3
输出描述
判断这棵二叉树是否结构对称，若对称请输出最大值节点在树中对称节点的整数值，不对称请直接输出最大值节点的整数值

3
————————————————
版权声明：本文为CSDN博主「TechGuide」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/weixin_41896265/article/details/120257995
 */

public class Main {
    static HashMap<Integer, Integer> inorder_idx;
    static int[] preorder;
    static int[] inorder;
    static int[] inorder_height;
    static int max_idx = 0;
    static int n;
    static boolean flag = true;

    public static void isMirror (int preorder_left,
                                 int preorder_right,
                                 int inorder_left,
                                 int inorder_right,
                                 int height) {
        if (preorder_left > preorder_right || inorder_left > inorder_right) {
            return;
        }
        int inorder_root = inorder_idx.get(preorder[preorder_left]);
        inorder_height[inorder_root] = height;
        int other_height = inorder_height[n - 1 - inorder_root];
        if (!flag || (other_height != 0 && other_height != height)) {
            flag = false;
            return;
        }
        int left_size = inorder_root - inorder_left;
        isMirror(preorder_left + 1, preorder_left + left_size, inorder_left, inorder_root - 1, height + 1);
        isMirror(preorder_left + left_size + 1, preorder_right, inorder_root + 1, inorder_right, height + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        preorder = new int[n];
        inorder = new int[n];
        inorder_height = new int[n];
        for (int i = 0; i < n; i++) {
            preorder[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            inorder[i] = sc.nextInt();
            max_idx = inorder[i] > inorder[max_idx] ? i : max_idx;
        }
        inorder_idx = new HashMap<Integer, Integer>();
        for (int i = 0; i < inorder.length; i++) {
            inorder_idx.put(inorder[i], i);
        }
        isMirror(0, n - 1, 0, n - 1, 0);
        System.out.println(flag ? inorder[n - 1- max_idx] : inorder[max_idx]);
    }
//————————————————
//    版权声明：本文为CSDN博主「TechGuide」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
//    原文链接：https://blog.csdn.net/weixin_41896265/article/details/120257995
}
/*
3
1 3 4
3 1 4

3
 */