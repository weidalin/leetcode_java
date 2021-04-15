package leetcode.swordoffer.offer06_reversePrint;

import tools.ListNode;

/**
 * 剑指 Offer 06. 从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 *
 *
 * 示例 1：
 *
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 */
public class ReversePrint_3 {
    int[] res ;
    ListNode p;
    public int[] reversePrint(ListNode head) {
        int  n = 0;
        ListNode p = head;
        while(p != null){
            n ++;
            p = p.next;
        }
        res = new int[n];
        helper(n, 0, head);
        return res;
    }

    private void helper(int n, int i, ListNode head) {
        if(head != null){
            helper(n, i + 1,head.next);
        }
        res[n-i] = head.val;
    }
    /**
     * 执行用时：
     * 1 ms
     * , 在所有 Java 提交中击败了
     * 72.47%
     * 的用户
     * 内存消耗：
     * 39.9 MB
     * , 在所有 Java 提交中击败了
     * 10.43%
     * 的用户
     */
}
