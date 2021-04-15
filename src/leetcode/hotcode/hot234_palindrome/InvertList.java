package leetcode.hotcode.hot234_palindrome;

import tools.ListNode;

public class InvertList {
    public ListNode invertList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode prehead = invertList(head.next);
        head.next.next = head;
        head.next = null;
        return prehead;
    }
}
