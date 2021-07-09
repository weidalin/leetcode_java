package written_examination.intern.huawei.huawei1_rota_string;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();

        String str = "(u(love)i)";
//        String str = "((jhku)(love)i)";

        Stack<Integer> lindex = new Stack<>();
        Stack<Integer> rindex = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '('){
                lindex.add(i);
            }else if(ch == ')'){
                int left = lindex.pop();
                int right = i;
                str = inver_str(str, left, right);
//                rindex.add(0, i);
            }
        }
//        while(lindex.size() > 0){
//            int l = lindex.pop();
//            int r = rindex.pop();
//            str = inver_str(str, l, r);
//        }
        String res = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch != '(' && ch != ')'){
                res += ch;
            }
        }
        System.out.println(res);
    }

    public  static String inver_str(String str, int i, int j){
        char[] chars = str.toCharArray();
        while(i < j){
            char tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
            i ++;
            j--;
        }
        String res = String.valueOf(chars);
        return res;
    }
}
