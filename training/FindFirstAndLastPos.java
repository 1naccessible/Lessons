package training;

import java.util.Arrays;

// FIXME: 16.12.2022 
public class FindFirstAndLastPos {
    public static int[] searchRange(int[] nums, int target) {
        int[] nFalse = {-1, -1};
        int iter = 0;
       for (int i = 0; i < nums.length; i++){
           if (nums[i] == target && iter == 0){
               nFalse[0] = i;
               iter++;
           }
           if (nums[i] == target){
               nFalse[1] = i;
           }
       }
        return nFalse;
    }
}

class DemoFF {
    public static void main(String[] args) {
        int[] nums = {0,0,0,0,1,2,1,3,3,4,5,6,6,7,8,8,8,9,9,10,10,12,11};
        System.out.println(FindFirstAndLastPos.searchRange(nums, 12));
    }
}