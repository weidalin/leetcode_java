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
public class ReversePrint_2 {
    public static int[] reversePrint(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        int n = 0;
        while(cur != null){
            n++;
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        int[] res = new int[n];
        int i = 0;
        while(pre != null){
            res[i++] = pre.val;
            pre = pre.next;
        }
        return res;
    }
}
/**
 * 执行用时：
 * 0 ms
 * , 在所有 Java 提交中击败了
 * 100.00%
 * 的用户
 * 内存消耗：
 * 39.1 MB
 * , 在所有 Java 提交中击败了
 * 57.20%
 * 的用
 */
