package leetcode.hotcode.hot234_palindrome;

import tools.ListNode;

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
    //递归
    private ListNode frontPointer;
    public boolean isPalindrome(ListNode head) {
        frontPointer = head;
        return recurisivelyCheck(head);

    }

    private boolean recurisivelyCheck(ListNode currentNode) {
        if (currentNode != null){
            if(!recurisivelyCheck(currentNode.next)){
                return false;
            }
            if(currentNode.val != frontPointer.val){
                return false;
            }
            frontPointer = frontPointer.next;
        }
        return true;
    }
}
/**
 *
 */
