package leetcode.hotcode.hot20_isValid;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class isValid_1 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('{','}'); map.put('[',']'); map.put('(',')');
        for(char c : s.toCharArray()){
            // 1 如果是左括号，直接入栈吧
            if(map.containsKey(c)){
                stack.add(c);
            }else if(map.get(stack.pop()) != c) { // 如果是右括号，判断能不能组成一对，如果不能说明已经over了
                return false;
            }
        }
        return stack.isEmpty();
    }
}
