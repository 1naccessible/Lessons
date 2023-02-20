package leetCode;

import java.util.Arrays;
import java.util.*;

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int firstMissingNum = 1;
        Arrays.sort(nums);
        for (int i = 1; i <= nums[nums.length - 1]+1 && nums[nums.length-1] < 100_000_00
                || i <= nums[nums.length - 1] && nums[nums.length-1] >= 100_000_00 ; i++) {
            if (Arrays.binarySearch(nums, i)<0){
                return i;
            }

        }
        return firstMissingNum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,10,2147483647,9};
        System.out.println(firstMissingPositive(nums));
    }
}
