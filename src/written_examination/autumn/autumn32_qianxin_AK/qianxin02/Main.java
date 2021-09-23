package written_examination.autumn.autumn32_qianxin_AK.qianxin02;

import java.util.*;

/**
 * @author linweida
 * 2021/9/23 3:59 下午
 */

public class Main {
    public static void main(String[] args) {
        char[] seed = {'0','1','2'};
        int size = 2;
        String[] res = Permutation(seed, size);

    }
    public static String[] Permutation (char[] seed, int size) {
        // write code here
        Set<String> set = new HashSet<>();
        boolean[] visited = new boolean[seed.length];
        dfs(seed, 0, size, set, "", visited);
        String[] res = set.toArray(new String[set.size()]);
        List<String> list = Arrays.asList(res);
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        res = list.toArray(res);
        System.out.println(list);
        return res;
    }

    private static void dfs(char[] seed, int i, int size, Set<String> set, String tmp, boolean[] visited) {
        if(tmp.length() == size){
            if(!set.contains(tmp))
                set.add(tmp);
            return;
        }
        // 1. 选择列表
        for(int j = 0; j < seed.length; j++){
            if((visited[j] == false) && tmp.indexOf(seed[j]) == -1){
                visited[j] = true;
                dfs(seed, j + 1, size, set, tmp + seed[j], visited);
                visited[j] = false;
            }
        }
    }
}
