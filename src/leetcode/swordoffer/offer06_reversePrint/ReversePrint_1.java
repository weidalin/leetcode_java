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
public class ReversePrint_1 {
    public int[] reversePrint(ListNode head) {
        ListNode pre = reverse_helper(head);
        ListNode p = pre;
        int n = 0;
        while(p != null){
            n ++;
            p = p.next;
        }
        int i = 0;
        int[] res = new int[n];
        while(pre != null){
            res[i++] = pre.val;
            pre = pre.next;
        }
        return res;
    }

    private ListNode reverse_helper(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode reverseHead = reverse_helper(head.next);
        head.next.next = head;
        head.next = null;
        return reverseHead;

    }

}/**
 执行用时：
 1 ms
 , 在所有 Java 提交中击败了
 72.47%
 的用户
 内存消耗：
 39.3 MB
 , 在所有 Java 提交中击败了
 19.36%
 的用户*/
