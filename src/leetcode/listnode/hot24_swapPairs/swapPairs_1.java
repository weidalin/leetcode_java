package leetcode.listnode.hot24_swapPairs;

import tools.ListNode;

/**
 * 24. 两两交换链表中的节点
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 * 示例 1：
 *
 * 输入：head = [1,2,3,4]
 * 输出：[2,1,4,3]
 * 示例 2：
 *
 * 输入：head = []
 * 输出：[]
 * 示例 3：
 *
 * 输入：head = [1]
 * 输出：[1]
 */
public class swapPairs_1 {
    public static ListNode swapPairs(ListNode head) {

//        ListNode pre = new ListNode(0);
//        pre.next = head;
//        ListNode temp = pre;
//        while(temp.next != null && temp.next.next != null) {
//            ListNode start = temp.next;
//            ListNode end = temp.next.next;
//            temp.next = end;
//            start.next = end.next;
//            end.next = start;
//            temp = start;
//        }
//        return pre.next;

        //2.迭代
        ListNode pre = new ListNode(0);
        pre.next  = head;
        ListNode tmp = pre;
        while(tmp.next != null && tmp.next.next != null){
            ListNode start = tmp.next;
            ListNode end = tmp.next.next;
            tmp.next = end;
            start.next = end.next;
            end.next = start;
            tmp = start;
        }
        return pre.next;
    }
}
