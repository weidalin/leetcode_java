package leetcode.palindrome.hot234_palindrome;

import tools.ListNode;

import static tools.Weida_utils.print_ListNode;

/***
 * 234. 回文链表
 * 请判断一个链表是否为回文链表。
 *
 * 示例 1:
 *
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 *
 * 输入: 1->2->2->1
 * 输出: true
 */
public class Palindrome_1 {
    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        ListNode pre, prepre = null;
        while(fast != null && fast.next != null){
            System.out.println(slow.val);
            fast = fast.next.next;
            pre = slow;
            slow = slow.next;
            pre.next = prepre;
            prepre = pre;
        }

        if(fast != null){
            slow = slow.next;
        }
        print_ListNode(slow);
        System.out.println(" \n");
        print_ListNode(prepre);
        while(slow != null && prepre.next != null){
            if(slow.val != prepre.val){
                return false;
            }
            slow = slow.next;
            prepre = prepre.next;
        }
        return true;
    }
}
/**
 *
 */
