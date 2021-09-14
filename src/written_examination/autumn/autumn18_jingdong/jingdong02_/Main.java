package written_examination.autumn.autumn18_jingdong.jingdong02_;

import java.util.*;

/**
 * @author linweida
 * 2021/9/11 7:00 下午
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt();
        sc.nextLine();
        Map<Integer, Set> ADependB = new HashMap<>();
        Map<Integer, Set> BSupplyA = new HashMap<>();
        for(int i = 0; i < q; i++){
            String str = sc.nextLine();
            String[] strs = str.split(" ");
            int a = Integer.parseInt(strs[0]);
            for(int j = 1; j < strs.length; j++){
                int b = Integer.parseInt(strs[j]);
                //1
                Set<Integer> set = ADependB.get(a);
                if(set == null)
                    set = new HashSet<>();
                set.add(b);
                ADependB.put(a, set);
                // 2
                Set<Integer> set2 = ADependB.get(b);
                if(set2 == null)
                    set2 = new HashSet<>();
                set2.add(a);
                BSupplyA.put(b, set2);
            }
        }
//        sc.nextLine();
        Set<Integer> currenOpen = new HashSet<>();
        for(int i = 0; i < q; i++){
            int x = sc.nextInt(), y = sc.nextInt();
            startOrClose(currenOpen, x, y, ADependB, BSupplyA);
            sc.nextLine();
            System.out.println(currenOpen.size());
        }
    }

    private static void startOrClose(Set<Integer> currenOpen, int x, int y,
                                     Map<Integer, Set> ADependB, Map<Integer, Set> BSupplyA) {
        // 1. x == 1
        if(x == 1){
            Set<Integer> xDepend = ADependB.get(y);
            currenOpen.add(y);
            if(xDepend == null) return;
            for(Integer xdepend : xDepend){
                startOrClose(currenOpen,x, xdepend, ADependB, BSupplyA);
                currenOpen.add(xdepend);
            }
        } else {
            Set<Integer> xDepend = BSupplyA.get(y);
            currenOpen.remove(y);
            if(xDepend == null) return;
            for(Integer xdepend : xDepend){
                startOrClose(currenOpen,x, xdepend, ADependB, BSupplyA);
                currenOpen.remove(xdepend);
            }
        }
    }
}
/*
3 2
1 2 4
1 3 5
1 1
0 3
 */