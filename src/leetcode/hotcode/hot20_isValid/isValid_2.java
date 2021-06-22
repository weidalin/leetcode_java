package leetcode.hotcode.hot20_isValid;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class isValid_2 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        for(char c : s.toCharArray()){
            // 1 判断栈顶元素和c 能否凑成一对括号，如果可以，出栈
            if(!stack.isEmpty() && stack.peek() == map.get(c)){
                stack.pop();
            }else
            { // 2 否则入栈
                stack.add(c);
            }
        }
        return stack.isEmpty();
    }
}
