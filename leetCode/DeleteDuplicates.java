package leetCode;

// FIXME: 15.12.2022 / 16.12.2022
public class DeleteDuplicates {
    public static int removeDuplicates(int[] nums) {
        int currInd = 0;
        int swapper;
        if (nums[currInd]<nums[currInd+1]){
            currInd++;
        }else {
            swapper = nums[currInd];
            for (int i = 0; i < nums.length-currInd; i++){
            }
        }
        return 0;
    }
}
class DemoDD {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(DeleteDuplicates.removeDuplicates(nums));
    }
}