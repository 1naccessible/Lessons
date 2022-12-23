package generics;

import java.util.Arrays;

public class GenericMethodDemo {
    static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] nums1, V[] nums2){
        if (Arrays.compare(nums1,nums2) == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer nums1[] = {1,2,3,4,5};
        Integer nums2[] = {1,2,3,4,5};
        Integer nums3[] = {1,7,2,4,5};
        Integer nums4[] = {1,2,3,4,5,6};


        System.out.println(arraysEqual(nums1,nums2));
        System.out.println(arraysEqual(nums1,nums4));
        System.out.println(arraysEqual(nums1,nums3));

    }
}
