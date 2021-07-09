//package written_examination.intern.wangyi.chaxunrizhi;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Solution {
//    /**
//     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
//     *
//     * 搜索满足条件的日志。 返回值为二维数组，第一维对应待查询时间戳的下标，第二维是命中日志的事件ID
//     * @param logs long长整型二维数组 日志数据，数组第一维的下标即为事件ID，第二维包含两个long型整数，分别表示起始和结束时间
//     * @param tss long长整型一维数组 timestamps，表示待查询的多个时间戳
//     * @return int整型二维数组
//     */
//    public int[][] search_log (long[][] logs, long[] tss) {
//        List<int[][]> res = new ArrayList<>();
//        // write code here
//        for(int i = 0; i < tss.length; i++){
//                List<int[]> list = new ArrayList<>();
//            for(int j = 0; j < logs.length; j++){
//                long begin = logs[j][0];
//                long end = logs[j][1];
//                if(tss[i] > begin && tss[i] < end){
//                    list.add(j);
//                }
//            }
//            int[] list_arr = list;
//            res.add(list_arr);
//        }
//        return res.toArray();
//
//
//
//    }
//}
