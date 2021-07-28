package written_examination.intern.wangyi.wy1_kuohaopeidui;

import java.util.HashMap;
import java.util.Stack;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param inString string字符串 待判断的字符串
     * @param inStringNum int整型 输入字符串长度
     * @return int整型
     */
    public int getMatchBracketsNum (String inString, int inStringNum) {
        if(inString == null || inStringNum %2 != 0){
            return -1;
        }
        // write code here
        if (inString.length() == 0){
            return 0;
        }
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        int res = 0;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < inStringNum; i++){
            char ch = inString.charAt(i);
            if(ch == '('  || ch == '[' || ch == '{'){
                stack.add(ch);
                continue;
            }
            if(ch == ')' || ch == ']' || ch=='}'){
                if (map.get(ch) != stack.peek()){
                    return -1;
                }else{
                    char c = stack.pop();
                    if(c == '('){
                        res += 1;
                    }else if(c == '['){
                        res +=2;
                    }else{
                        res += 3;
                    }
                }
            }
        }
        return res;
    }
}
