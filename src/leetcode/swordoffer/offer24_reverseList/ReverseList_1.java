package leetcode.swordoffer.offer24_reverseList;

import tools.ListNode;

/**
 * 剑指 Offer 24. 反转链表
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 *
 *
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 */
public class ReverseList_1 {
    /**
     * 递归
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
/**
 * 执行用时：
 0 ms
 , 在所有 Java 提交中击败了
 100.00%
 的用户
 内存消耗：
 38.6 MB
 , 在所有 Java 提交中击败了
 6.29%
 的用户
 *
 *
 * 时间复杂度：O(n)O(n)，其中 nn 是链表的长度。需要对链表的每个节点进行反转操作。
 *
 * 空间复杂度：O(n)O(n)，其中 nn 是链表的长度。空间复杂度主要取决于递归调用的栈空间，最多为 nn 层。
 *
 * 作者：LeetCode-Solution
 * 链接：https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/solution/fan-zhuan-lian-biao-by-leetcode-solution-jvs5/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
}
