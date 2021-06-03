package leetcode.hotcode.hot148_sortList;

import tools.ListNode;

/**
 * 148. 排序链表
 * 给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
 *
 * 进阶：
 *
 * 你可以在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序吗？
 *
 * 输入：head = [4,2,1,3]
 * 输出：[1,2,3,4]
 */
public class sortList_2 {

    public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode right = slow.next;
        ListNode left = head;
        slow.next = null;

        left = sortList(left);
        right = sortList(right);
        ListNode h = new ListNode(0);
        ListNode return_h = h;
        while(left != null && right != null){
            if(left.val < right.val){
                h.next = left;
                h = h.next;
                left = left.next;
            }else{
                h.next = right;
                h = h.next;
                right = right.next;
            }
        }
        if(left == null){
            h.next = right;
        }else if(right == null){
            h.next = left;
        }
        return return_h.next;
    }
}
/**
 * 递归调用函数将带来O(logn)O(logn)的空间复杂度，因此若希望达到O(1)O(1)空间复杂度，则不能使用递归。
 */
