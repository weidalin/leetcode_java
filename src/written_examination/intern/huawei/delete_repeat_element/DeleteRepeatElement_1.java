package written_examination.intern.huawei.delete_repeat_element;

import java.util.HashSet;
import java.util.Set;

public class DeleteRepeatElement_1 {
    public static String deleteRepeatElement(String str){
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        Set<Character> set = new HashSet<Character>();
        StringBuilder sb = new StringBuilder();
        for (Character ch : chars){
            if(set.contains(ch)){
                continue;
            }else{
                set.add(ch);
                sb.append(ch);
            }
        }
        String res = sb.toString();
        return res;
    }
}
