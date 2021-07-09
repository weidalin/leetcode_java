package written_examination.intern.tx.tx4_juistystr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < t; i++){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            String res;
            if(str1.length() % 2 == 1){
                res = juistA(str1, str2);
            }else{
                res = juistB(str1, str2) ? "YES" : "NO";
            }
            System.out.println(res);
        }
    }

    private static boolean juistB(String str1, String str2) {
        String a1 = str1.substring(0, str1.length() / 2);
        String a2 = str1.substring(str1.length() / 2, str1.length());
        String b1 = str1.substring(0, str2.length() / 2);
        String b2 = str1.substring(str2.length() / 2, str2.length());
        return juistB_detail(a1, a2, b1, b2);
    }

    private static boolean juistB_detail(String a1, String a2, String b1, String b2) {
        if(a1.length() == 0){
            return true;
        }
        if (a1.length() == 1)
            return a1.equals(b1)&& a2.equals(b2) || a1.equals(b2) && a2.equals(b1);
        return juistB(a1, b1) && juistB(a2, b2) || juistB(a1, b2) && juistB(a2, b1);
    }

    private static String juistA(String str1, String str2) {
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                return "NO";
            }
        }
        return "YES";
    }
}

/**
 *
 *
 *
 4
 aaba
 abaa
 aabb
 abab
 aaabbb
 bbbaaa
 cba
 abc







1
aaba
abaa
 *
 */