package written_examination.autumn.autumn09_NIO.NIO04_chkBlood;

import java.util.Arrays;

/**
 * @author linweida
 * 2021/8/28 7:49 下午
 */
// 100%
public class Main {
    public static String[] chkBlood(String father, String mother) {
        // write code here
        String combine1 = mother + " " + father;
        String combine2 = father + " " + mother;
        String[] res1 = func1(combine1);
        if(res1.length > 0){
            Arrays.sort(res1);
            return res1;
        }
        String[] res2 = func1(combine2);
        Arrays.sort(res2);
        return res2;
    }

    public static String[] func1(String combine){
        switch (combine){
            case "O O":
                return new String[]{"O"};
            case "A O":
                return new String[]{"A", "O"};
            case "A A":
                return new String[]{"A", "O"};
            case "A B":
                return new String[]{"A", "AB", "B", "O"};
            case "A AB":
                return new String[]{"A", "B", "AB"};
            case "B O":
                return new String[]{"B", "O"};
            case "B B":
                return new String[]{"B", "O"};
            case "B AB":
                return new String[]{"A", "B", "AB"};
            case "AB O":
                return new String[]{"A", "B"};
            case "AB AB":
                return new String[]{"A", "B", "AB"};
            default:
                return new String[0];
        }
    }
    public static void main(String[] args) {
        String[] res = chkBlood("A", "A");
        System.out.println(res);
    }
}
