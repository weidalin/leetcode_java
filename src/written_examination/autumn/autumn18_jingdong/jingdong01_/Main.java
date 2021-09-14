package written_examination.autumn.autumn18_jingdong.jingdong01_;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author linweida
 * 2021/9/11 7:00 下午
 */

public class Main {
//    作者：yfeedomliTHU
//    链接：https://www.nowcoder.com/discuss/740537?type=post&order=time&pos=&page=1&ncTraceId=&channel=-1&source_id=search_post_nctrack
//    来源：牛客网

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int x = Integer.parseInt(s[2]);
        int y = Integer.parseInt(s[3]);
        int z = Integer.parseInt(s[4]);
        Map<Character,int[]> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char[] input = sc.nextLine().toCharArray();
            for (int j = 0; j < m; j++) {
                map.put(input[j],new int[]{i,j});
            }
        }
        String output = sc.nextLine();
        int currentX = 0;
        int currentY = 0;
        int sum = 0;
        for(int i = 0; i < output.length(); ++i){
            char temp = output.charAt(i);
            sum += z;
            //找到当前字符在键盘的位置
            int[] arr = map.get(temp);
            int gotoX = arr[0];
            int gotoY = arr[1];
            if(gotoX != currentX && gotoY!=currentY){
                sum += y;
            }
            sum += (Math.abs(gotoX-currentX)+Math.abs(gotoY-currentY))*x;
            currentX = gotoX;
            currentY = gotoY;
        }
        System.out.println(sum);
    }

}
