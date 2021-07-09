package written_examination.intern.wangyi0508.wy2_getMostStr;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static String getMostStr(String s0, String s1, char[] cList) {
        List<Character> clist = new ArrayList<>();
        for(char c : cList){
            clist.add(c);
        }
        String res = getMostStr_helper(s0, s1, 0, 0, 0, 0, clist);
        return res;
    }

    private static String getMostStr_helper(String s0, String s1, int pre1, int i1, int pre2, int i2,  List<Character> clist) {
        String res = "";
        if(clist.contains(s0.charAt(i1))){
            i1++;
        }
        else if(clist.contains(s1.charAt(i2))){
            i2++;
        }
        else if(s0.charAt(i1) == s1.charAt(i2)){
            i1 ++;
            i2 ++;
        }else{
            String tmp1 = s0.substring(pre1, i1);
            String tmp2 = s1.substring(pre2, i2);
            if(tmp1.length() > res.length()){
                res = tmp1;
            }
            if(tmp2.length() > res.length()){
                res = tmp2;
            }
            pre1 += 1;
        }
        return res;
    }


    public static void main(String[] args) {
        String s0 = "abc%";
        String s1 = "zxab%c%%";
        char[] ch = {'%', '#'};
        String res = getMostStr(s0, s1, ch); //ab%c%%"
        System.out.println(res);
    }
}
