package written_examination.wangyi0508.wy1_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param inputStr string字符串 输入的长字符串
     * @param cList char字符型一维数组 需要被排除的字符集合
     * @return int整型
     */
    static int res;
    public static int specialStr(String inputStr, char[] cList) {
        List<Character> clist = new ArrayList<>();
        for(char c : cList){
            clist.add(c);
        }
        String tmp = "";
        res = 0;
        for(int i = 0 ; i < inputStr.length(); i++){
            if(clist.contains(inputStr.charAt(i))){
                res = Math.max(res, juisty(tmp));
                tmp = "";
                continue;
            }
            tmp += inputStr.charAt(i);
        }
        res = Math.max(res, juisty(tmp));
        return res;
    }

    private static int juisty(String tmp) {
        if(tmp.length() <= 1){
            return tmp.length();
        }
        int res__ = 0;
        for(int i  = 0; i < tmp.length()-1; i++){
            for(int j = i+1; j <= tmp.length(); j++){
                String str = tmp.substring(i, j);
                int res_tmp = juisty2(str);
                res__ = Math.max(res__, res_tmp);
                System.out.println(str + " = " + res_tmp);
            }
        }
        return res__;
    }

    private static int juisty2(String str) {
        int left = 0, right = str.length() - 1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return 0;
            }
            left ++;
            right--;
        }
        return str.length();
    }

    public static void main(String[] args) {
        char[] ch = {'b', 'x'};
        String str = "abbaca";
        int res = specialStr(str, ch);
        System.out.println(res);
    }
}
