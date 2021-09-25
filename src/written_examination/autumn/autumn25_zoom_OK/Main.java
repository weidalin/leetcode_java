package written_examination.autumn.autumn25_zoom_OK;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author linweida
 * 2021/9/16 5:27 下午
 */

public class Main {
    public boolean isValidStr (String str) {
        if(str.length() == 0){
            return true;
        }
        // write code here
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        map.put('>', '<');
        for(char c : str.toCharArray()){
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
