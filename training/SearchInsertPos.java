package training;

import java.util.Arrays;

public class SearchInsertPos {
    public static int searchInsert(int[] nums, int target) {
        int ind = Arrays.binarySearch(nums,target);
        if(ind<0){
            ind = Math.abs(ind) - 1;
        }
        return ind;
    }
}
class DemoSIP{
    public static void main(String[] args) {
        int [] ints = {1,2,2,4,5,6,7,8,9};
        System.out.println(SearchInsertPos.searchInsert(ints, 3));
    }
}
