package written_examination.autumn.autumn31_meidi_AK.meidi01;

import java.util.ArrayList;

/**
 * @author linweida
 * 2021/9/23 10:34 上午
 */

public class Main {
    public ArrayList<String> justifyFill (String[] words, int M) {
        // write code here
        // 定义0-maxWidth个空格字符串，方便之后直接调用
        final String[] space = new String[M+1];
        StringBuffer s = new StringBuffer();
        for(int i = 0;i<M+1;i++){
            space[i] = s.toString();
            s.append(" ");
        }
        ArrayList<String> pWords = new ArrayList<String>();
        for(int i=0; i<words.length; i++){
            int curlen = words[i].length();
            int startI = i;
            while(i < words.length-1 && curlen<M){
                i++;
                curlen = curlen+words[i].length()+1;
            }
            if(curlen>M){
                curlen = curlen-words[i].length()-1;
                i--;
            }
            pWords.add(processCurline(words,startI,i,curlen,M,space));
        }
        return pWords;

    }
    public static String processCurline(String[] words, int si, int ei, int curlen, int maxWidth, String[] space){
        StringBuffer sb = new StringBuffer();   //用来进行排版
        int map = ei-si;                   // 记录单词之间的有几个间隙
        int addSpace = maxWidth - curlen+map;   //记录这一行总共有多少个空格
        if(map==0){               //间隙为0，证明只有一个单词
            sb.append(words[ei]);
            sb.append(space[addSpace]);
            return sb.toString();
        }
        if(ei == words.length-1){            //最后一行了，格式特殊
            for(int i =si;i<ei;i++){
                sb.append(words[i]).append(" ");
            }
            sb.append(words[ei]);             //最后一个单词不加空格
            sb.append(space[addSpace-map]);   //如果还有多余空格，一起加上
            return sb.toString();
        }
        int allAddSpace = addSpace/map;     // 所有的空格数 / 间隙 = 每个间隙必加的空格数
        int left = addSpace % map + si;     // 多出来的空格要从si开始，依次加在间隙中
        for(int i = si;i<ei;i++){
            sb.append(words[i]).append(space[allAddSpace]);
            if(i < left) sb.append(" ");     // <left就要多加一个空格
        }
        sb.append(words[ei]);
        return sb.toString();
    }
}
