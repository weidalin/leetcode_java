package src.leetcode.swordoffer.offer03;


import static src.leetcode.swordoffer.offer03.Repeat_number1.findRepeatNumber;

public class main {
    public  static void main(String[] args) {
        int[] nums = {2, 0, 9,9, 11, 15};
        int res = findRepeatNumber(nums);
        System.out.print(res);

    }
}
