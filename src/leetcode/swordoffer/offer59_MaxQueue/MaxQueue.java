package leetcode.swordoffer.offer59_MaxQueue;

import java.util.Deque;
import java.util.LinkedList;

public class MaxQueue {
    Deque<Integer> res, max;
    public MaxQueue() {
        res = new LinkedList<>();
        max = new LinkedList<>();
    }

    public int max_value() {
        if(max.isEmpty())   return -1;
        return max.peekFirst();
    }

    public void push_back(int value) {
        res.addLast(value);
        while(!max.isEmpty() && max.peekLast() < value){
            max.removeLast();
        }
        max.addLast(value);
    }

    public int pop_front() {
        if(res.isEmpty()){
            return -1;
        }
        Integer tmp = res.peekFirst();
//        if(tmp == max.peekFirst()){
        if(tmp.equals(max.peekFirst())){
            max.removeFirst();
        }
        res.removeFirst();
        return tmp;
    }

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */
}
