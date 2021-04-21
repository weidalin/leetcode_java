package newcode.read_push_stream;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //nextLine()读取的是nextInt()的回车换行符，导致无法输入爱好的内容。
        //解决办法:添加sc.nextLine();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String str =  sc.nextLine();
            System.out.println(str);
        }
    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a_arr = new int[n];
//        int[] b_arr = new int[n];
//        for(int i = 0; i < n; i++){
//            a_arr[i] = sc.nextInt();
//            b_arr[i] = sc.nextInt();
//        }
//        for(int i = 0; i < n; i++){
//            System.out.println(a_arr[i] + b_arr[i]);
//        }
//    }
}
