package written_examination.autumn.autumn37_qunar.qunar03_preMath;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author linweida
 * 2021/10/13 3:07 下午
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<String> listStr = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);
            if(ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                listStr.add(ch+"");
            }
            if(ch == ')'){

            }
        }
        List<String> strList = new ArrayList<>();

        Stack<String> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            String ch = str.substring(i, i+1);
            stack.add(ch+"");
            if(ch.equals(")")){
                List<String> list = new ArrayList<>();
                while(!stack.isEmpty() && stack.peek() != "("){
                    list.add(stack.pop());
                }
                String listRes = compute(list);
                System.out.println(list + "---" + listRes);
                // 中断！
                if(listRes.equals("invalid expression") || listRes.equals("division by zero")){
                    System.out.println(listRes);
                    return;
                }
                stack.add(listRes);
            }
        }
        if(stack.size() == 1){
            System.out.println(stack.pop());
        }else{
            System.out.println("invalid expression");
        }
    }

    private static String compute(List<String> list) {

        String method = list.get(0);
        if(method.equals('+')){
            int res = 0;
            for(int i = 1; i < list.size(); i++){
                res += Integer.parseInt(list.get(i));
            }
            return res+"";
        }if(method.equals('-')){
            if(list.size() != 3){
                return "invalid expression";
            }
            return Integer.parseInt(list.get(1)) - Integer.parseInt(list.get(2)) + "";

        }if(method.equals('*')){
            int res = 1;
            for(int i = 1; i < list.size(); i++){
                res += Integer.parseInt(list.get(i));
            }
            return res+"";
        }if(method.equals('/')){
            if(list.size() != 3){
                return "invalid expression";
            }
            if(list.get(2).equals("0")){
                return "division by zero";
            }
            return Integer.parseInt(list.get(1)) / Integer.parseInt(list.get(2)) + "";
            }
        return "invalid expression";
    }
}
/*
(+ (* 1 2 3) (/ 6 2) (- 1 4))
 */