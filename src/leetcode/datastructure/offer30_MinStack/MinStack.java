package leetcode.datastructure.offer30_MinStack;

import java.util.ArrayList;

public class MinStack {
    /** initialize your data structure here. */
    ArrayList<Integer> min;
    ArrayList<Integer> stack;
    public MinStack() {
        min = new ArrayList<>();
        stack = new ArrayList<>();
    }

    public void push(int x) {
        this.stack.add(x);
        if(min.isEmpty() || x <= this.min.get(min.size() - 1)){
            this.min.add(x);
        }
    }

    public void pop() {
        if(stack.get(stack.size() - 1).equals(min.get(min.size() - 1)))
            min.remove(min.size() - 1);
        stack.remove(stack.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int min() {
        return this.min.get(min.size() - 1);
    }
}
