package leetCode;

import java.util.Arrays;

public class FindMedianOfTwoArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        double mid = 0;
        System.arraycopy(nums1, 0, nums, 0, nums1.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
        Arrays.sort(nums);
        if (nums.length % 2 == 0) {
            mid = (nums[nums.length / 2] + nums[(nums.length / 2) - 1]);
            mid = mid / 2;
        } else {
            mid = nums[nums.length / 2];
        }
        return mid;
    }
}

class TestBC {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 7, 9};
        int[] nums2 = {2, 4, 6, 8, 10};
        System.out.println(FindMedianOfTwoArrays.findMedianSortedArrays(nums1, nums2));
    }
}