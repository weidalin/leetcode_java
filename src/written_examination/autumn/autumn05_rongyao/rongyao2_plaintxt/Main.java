package written_examination.autumn.autumn05_rongyao.rongyao2_plaintxt;

import java.util.Scanner;

/**
 * @author linweida
 * 2021/8/21 7:08 下午
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
        String str = "This,is,an,eggplant,of,our,beautifull,sweety,baby";
        String[] strList = str.split(",");
        int i = 0, j = 0;
        while(j < strList.length){
            j = i;
            int len = 0;
            while(j < strList.length && len + strList[j].length() < 16){
                len += strList[j].length();
                j++;
            }

            int wordCount = j - i;
            String[] tmp = new String[wordCount];
            int cur_real_len = strList[i].length();
            tmp[0] = strList[i];
            for(int curi = 1; curi < wordCount; curi++){
                tmp[curi] = strList[i + curi];
                cur_real_len += strList[i + curi].length();
            }
            printFillStart(tmp, cur_real_len, i, j, wordCount);
            System.out.println(i + "~" + j + ": " + " real_len:" + cur_real_len+" wordCount: "+wordCount);
            i = j;
        }

    }

    private static void printFillStart(String[] tmp, int real_len, int begin, int end, int wordCount) {

        int toBeFillLen = 16 - real_len;
        int space = wordCount - 1;

        String[] toBeFillStarList = new String[space];

        for(int curi = 0; curi < space; curi++){
            toBeFillStarList[curi] = new String();
        }
        for(int curi = 0, curj = 0; curj < toBeFillLen; curj++){
            toBeFillStarList[curi] += "*";
            curi++;
            curi %=space;
        }
        String res = tmp[begin];
        for(int curi = 0; curi < space; curi++){
            res+=tmp[begin + curi + 1] + toBeFillStarList[curi];
        }
        System.out.println(res);
    }
}
