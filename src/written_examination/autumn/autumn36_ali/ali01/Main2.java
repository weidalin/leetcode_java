package written_examination.autumn.autumn36_ali.ali01;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/10/8 8:01 下午
 */

public class Main2 {

    static int begin_x = -1;
    static int begin_y = -1;
    static int end_x = -1;
    static int end_y = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int t = sc.nextInt();
        char[][] chars = new char[h][w];
        for(int i = 0; i < h; i++) {

            String line = sc.nextLine();
            if(line.contains("S")){
                begin_x = i;
                begin_y = line.indexOf("S");
            }
            if(line.contains("G")){
                end_x = i;
                end_y = line.indexOf("G");
            }
            chars[i] = line.toCharArray();
        }
        // 找出最短路径
        int[] res = new int[2];
        dfs(chars, begin_x, begin_y, 0, 0);
    }

    private static void dfs(char[][] chars, int i, int j, int countOne, int countX) {

        if(i >= chars.length || i < 0 || j >= chars[0].length || j < 0){
            return;
        }

        if(i == end_x && j == end_y){
            return;
        }
    }
}
