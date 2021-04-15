package leetcode.swordoffer.offer09_CQueue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 剑指 Offer 09. 用两个栈实现队列
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 *
 *
 * 示例 1：
 *
 * 输入：
 * ["CQueue","appendTail","deleteHead","deleteHead"]
 * [[],[3],[],[]]
 * 输出：[null,null,3,-1]
 * 示例 2：
 *
 * 输入：
 * ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
 * [[],[],[5],[2],[],[]]
 * 输出：[null,-1,null,null,5,2]
 */
public class CQueue_1 {
    Deque<Integer> Stack1;
    Deque<Integer> Stack2;

    public CQueue_1() {
        Stack1 = new LinkedList<Integer>();
        Stack2 = new LinkedList<Integer>();
    }


    public void appendTail(int value) {
        Stack1.push(value);
    }

    public int deleteHead() {
        if(Stack2.isEmpty()){
            while(Stack1.isEmpty() == false){
                Stack2.push(Stack1.pop());
            }
            if(Stack2.isEmpty() == false){
                return Stack2.pop();
            }else{
                return -1;
            }
        }else{
            return Stack2.pop();
        }
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */