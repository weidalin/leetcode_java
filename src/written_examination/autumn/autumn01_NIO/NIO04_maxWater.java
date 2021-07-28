package written_examination.autumn.autumn01_NIO;

public class NIO04_maxWater {
    /**
     * 原题：直方图水量
     * https://leetcode-cn.com/problems/volume-of-histogram-lcci/
     *
     * 判断水桶可以装多少水
     * {3,2,1,5,2,4} 5
     * max water
     * @param arr int整型一维数组 the array
     * @return long长整型
     */
    public static long maxWater (int[] arr) {
        // write code here
        int sum = 0;
        for(int a : arr){
            sum += a;
        }
        int left = 0, right = arr.length - 1, volumn = 0;
        int height = 1;
        while(left <= right){
            while(left <= right && arr[left] < height){
                left ++;
            }while(left <= right && arr[right] < height){
                right--;
            }
            volumn += right - left + 1;
            height ++;
        }
        return volumn - sum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        long res = maxWater(nums);
        System.out.println(res);
    }
}
