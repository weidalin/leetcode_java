package written_examination.autumn.autumn37_qunar.qunar01_mergeList;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/10/13 2:21 下午
 */

public class Main {
    public int[] mergeSortedArray(int[] a, int m, int[] b, int n) {
        int i = m + n - 1;
        m = m - 1;
        n = n - 1;
        while(m >= 0 && n >= 0){
            if(a[m] > b[n]) a[i--] = a[m--];
            if(a[m] <= b[n]) a[i--] = b[n--];
        }

        while(m == 0 && n >= 0){
            a[i--] = b[n--];
        }
        while(n == 0 && m >= 0){
            a[i--] = a[m--];
        }
        return a;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] res;

        int _a_size = 0;
        _a_size = Integer.parseInt(in.nextLine().trim());
        int[] _a = new int[_a_size];
        int _a_item;
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(in.nextLine().trim());
            _a[_a_i] = _a_item;
        }

        int _m;
        _m = Integer.parseInt(in.nextLine().trim());

        int _b_size = 0;
        _b_size = Integer.parseInt(in.nextLine().trim());
        int[] _b = new int[_b_size];
        int _b_item;
        for(int _b_i = 0; _b_i < _b_size; _b_i++) {
            _b_item = Integer.parseInt(in.nextLine().trim());
            _b[_b_i] = _b_item;
        }

        int _n;
        _n = Integer.parseInt(in.nextLine().trim());

        res = new Main().mergeSortedArray(_a, _m, _b, _n);
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }

    }
}
/*
6
1
3
5
0
0
0
3
3
2
4
6
3
 */