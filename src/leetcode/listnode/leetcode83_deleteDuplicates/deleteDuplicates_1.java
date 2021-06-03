package leetcode.listnode.leetcode83_deleteDuplicates;

import tools.ListNode;

/**
 * 83. 删除排序链表中的重复元素
 * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除所有重复的元素，使每个元素 只出现一次 。
 *
 * 返回同样按升序排列的结果链表。
 *
 * 示例 1：
 *
 * 输入：head = [1,1,2]
 * 输出：[1,2]
 */
public class deleteDuplicates_1 {
    public static ListNode deleteDuplicates(ListNode head) {
        //1.递归
        if(head == null || head.next == null){
            return head;
        }
        if(head.val == head.next.val){
            return deleteDuplicates(head.next);
        }else{
            head.next = deleteDuplicates(head.next);
        }
        return head;
    }
}
