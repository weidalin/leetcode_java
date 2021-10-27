package written_examination.autumn.autumn41_gaungfa;

import java.util.*;

public class Main {
    static int res;
    public static int countMagics(ArrayList<Integer> arrayA, ArrayList<Integer> arrayB) {
        // write code here

        HashSet<Integer> setA = new HashSet<>(arrayA);
        res = 0;
        countMagics(0, setA, arrayB);
        return res;
    }
    public static void countMagics(int change, HashSet<Integer> setA, ArrayList<Integer> arrayB) {
        int meanA = getMeanA(setA);
        int meanB = getMeanA(arrayB);
        if(meanA < meanB){
            res = Math.max(change, res);
            return;
        }
        for(int num : arrayB){
            setA.add(num);
            arrayB.remove(num);
            countMagics(change + 1, setA, arrayB);
            setA.remove(num);
            arrayB.remove(num);
        }
    }

    private static int getMeanA(Collection<Integer> coll) {
        int sum = 0;
        for(int num : coll){
            sum += num;
        }
        return sum/coll.size();
    }

    public static void main(String[] args) {
        Integer[] nums1 = new Integer[]{1,2,5};
        Integer[] nums2 = new Integer[]{2,3,4,5,6};

        ArrayList<Integer> list1 = (ArrayList)Arrays.asList(nums1);
        ArrayList<Integer> list2 = (ArrayList)Arrays.asList(nums2);
        int res = countMagics(list1, list2);
        System.out.println(res);
    }
}
