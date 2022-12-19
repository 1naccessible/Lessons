package leetCode;

import java.util.Arrays;

public class ClosetSum {
    public int threeSumClosest(int[] nums, int target) {
        int inx = Arrays.binarySearch(nums,target);

    return inx;
    }
}
class TextCSum{
    public static void main(String[] args) {
        ClosetSum ob = new ClosetSum();
        int[] nums = {1,2,3,4,5};
        System.out.println(ob.threeSumClosest(nums, 5));
    }
}