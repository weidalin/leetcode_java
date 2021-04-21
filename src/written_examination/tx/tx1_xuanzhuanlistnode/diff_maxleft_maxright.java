package written_examination.tx.tx1_xuanzhuanlistnode;

/**
 * 将一个数组划分成两部分，
 * 怎样划分，可以得到左半部分与右半部分的最大值差最大？
 * 即 Math.max(max_left - max_right)
 */
public class diff_maxleft_maxright {
//    emmm.......................................................................................................................................................................................
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,3,1,1};
        int max = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        int res1 = max - nums[0];
        int res2 = max - nums[nums.length - 1];
        int res =  res1 > res2 ? res1 : res2;
        System.out.println(res);
    }

}
