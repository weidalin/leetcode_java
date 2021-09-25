package written_examination.autumn.autumn27_xiaohongshu.xioahongshu02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author linweida
 * 2021/9/18 10:32 上午
 */

public class Main {
    static int maxMin;
    static PriorityQueue<Integer> pq;
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[][] strs = new String[N][2];
        sc.nextLine();
        for(int i = 0; i < N; i++){
            String str = sc.nextLine();
            strs[i] = str.split("-");
        }
        maxMin = Integer.MIN_VALUE;
        pq = new PriorityQueue<>((o1, o2)->o1-o2);

        boolean[] visited = new boolean[N];
        Arrays.sort(strs,(o1, o2)->o1[0].compareTo(o2[0]));
        PriorityQueue<String> list = new PriorityQueue<>((o1,o2) -> o2.compareTo(o1));
        System.out.println(0);
    }

    private static void dfs(String[][] strs, boolean[] visited, PriorityQueue<String> pq, int curMin, int i) throws ParseException {
        if(pq.size() == 3){
            maxMin = Math.max(curMin, maxMin);
            return;
        }
        // 结束
        if(i >= strs.length){
            return;
        }

        // 2 选择i
        pq.add(strs[i][1]);
        visited[i] = true;
        for(int j = i+1; j < strs.length; j++){
            String curBegin = strs[j][0];
            String curEnd = strs[j][1];
            String preEnd = pq.peek();
            // 可以选择j
            if(curBegin.compareTo(preEnd) >= 0){
                int thisMin = getThisMin(curBegin, curEnd);
                curMin += thisMin;
                dfs(strs, visited, pq, curMin,i+1);
                curMin -= thisMin;
            }
        }

        // 3 撤销i
        pq.remove(strs[i][1]);
        visited[i] = false;
        dfs(strs, visited, pq, curMin,i+1);
    }

    private static int getThisMin(String curBegin, String curEnd) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm");
        Date begin = simpleDateFormat.parse(curBegin);
        Date end = simpleDateFormat.parse(curEnd);
        long from = begin.getTime();
        long to = end.getTime();
        return (int)(to - from) / (1000 * 60);
    }

}
/*
4
10:00-10:30
10:30-11:00
11:00-11:30
10:00-10:29
 */
