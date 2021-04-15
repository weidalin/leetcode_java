package newcode.read_push_stream;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
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
