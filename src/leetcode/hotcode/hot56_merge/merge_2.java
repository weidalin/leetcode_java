//package leetcode.hotcode.hot56_merge;
//
//import java.util.HashMap;
//
///**
// * 56. 合并区间
// * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
// * 示例 1：
// *
// * 输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
// * 输出：[[1,6],[8,10],[15,18]]
// * 解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
// */
//public class merge_2 {
//    public static int[][] merge(int[][] intervals) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i < intervals.length; i++){
//            int begin = intervals[i][0];
//            int end = intervals[i][1];
//            map.put(end, begin);
//            for(int map_end : map.keySet()){
//                int map_begin = map.get(map_end);
//                // 1. 拼接在后面
//                if(begin < map_end && end > map_end){
//                    map.remove(end);
//                    map.put(end,map_begin);
//                // 2. 拼接在前面
//                }else if(begin < map_begin && end < map_end){
//                    map.remove(map_end);
//                    map.put(map_end,begin);
//                // 3. 覆盖原有整一段，更新
//                }else if(begin < map_begin && end > map_end){
//                    map.remove(map_end);
//                    map.put(end, begin);
//                }
//            }
//        }
//        int[][] res = new int[map.size()][2];
//        int i = 0;
//        for(int end : map.keySet()){
//            int begin = map.get(end);
//            res[i++] = new int[]{begin, end};
//        }
//        return res;
//    }
//}
