package leetcode.listnode.leetcode82_deleteDuplicates;

import tools.ListNode;

/**
 * 82. 删除排序链表中的重复元素 II
 * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除链表中所有存在数字重复情况的节点，只保留原始链表中 没有重复出现 的数字。
 *
 * 返回同样按升序排列的结果链表。
 *
 * 示例 1：
 *
 * 输入：head = [1,2,3,3,4,4,5]
 * 输出：[1,2,5]
 * 示例 2：
 *
 * 输入：head = [1,1,1,2,3]
 * 输出：[2,3]
 */
public class deleteDuplicates_1 {

    public static ListNode deleteDuplicates(ListNode head) {
        //递归
        if(head == null || head.next == null){
            return head;
        }
        ListNode cur = head;
        if(cur.val != cur.next.val){
            head.next = deleteDuplicates(head.next);
            return head;
        }else{
            ListNode next = head.next.next;
            while(next != null && next.val == head.val){
                next = next.next;
            }
            return deleteDuplicates(next);
        }
    }
}
