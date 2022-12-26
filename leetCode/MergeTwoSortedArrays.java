package leetCode;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void mergeTwoArr(int [] nums1,int m, int [] nums2, int n){
        if (n != 0){
            System.arraycopy(nums2,0,nums1, m, n);
            Arrays.sort(nums1);
        }
    }
}
