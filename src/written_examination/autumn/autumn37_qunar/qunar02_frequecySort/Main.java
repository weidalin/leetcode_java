package written_examination.autumn.autumn37_qunar.qunar02_frequecySort;

import java.util.*;

/**
 * @author linweida
 * 2021/10/13 2:39 下午
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = frequencySort(s);
        System.out.println(res);
    }

    private static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int len = s.length();
        for(int i = 0; i < len; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new Comparator<Character>() {
            @Override
            public int compare(Character a, Character b) {
                if(map.get(a) - map.get(b) != 0){
                    return map.get(b) - map.get(a);
                }else{
                    return a - b;
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i ++){
            char c = list.get(i);
            for(int j = 0; j < map.get(c); j++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
/*
baAbb
 */
